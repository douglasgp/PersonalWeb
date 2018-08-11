package br.com.personal.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.personal.controle.FuelBean;
import br.com.personal.modelo.Fuel;

@WebServlet("/testes/addFuel")
public class AddFuelServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		// search writer
		PrintWriter out = response.getWriter();

		// Searching for the arameters in the request
		String stringValueLiter = request.getParameter("valueLiter");
		Double valueLiter = Double.parseDouble(stringValueLiter.trim()); // Converter String em Double
		String stringAmount = request.getParameter("amount");
		Double amount = Double.parseDouble(stringAmount.trim());
		String stringCurrentKm = request.getParameter("currentKm");
		Integer currentKm = Integer.parseInt(stringCurrentKm.trim());
		String stringKmTraveled = request.getParameter("kmTraveled");
		Double kmTraveled = Double.parseDouble(stringKmTraveled.trim());
		String stringTotalLiters = request.getParameter("totalLiters");
		Double totalLiters = Double.parseDouble(stringTotalLiters);
		String levelReservoir = request.getParameter("levelReservoir");
		String dateInText = request.getParameter("dateSupplies");
		Calendar dateSupplies = null;

		// Date conversion
		try {
			Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dateInText);
			dateSupplies = Calendar.getInstance();
			dateSupplies.setTime(date);
		} catch (ParseException e) {
			out.println("Date conversion error");
			return;// Stop the execution of the method
		}

		// Mount a fuel object
		Fuel fuel = new Fuel();
		fuel.setValueLiter(valueLiter);
		fuel.setAmount(amount);
		fuel.setCurrentKm(currentKm);
		fuel.setKmTraveled(kmTraveled);
		fuel.setTotalLiters(totalLiters);
		fuel.setLevelReservoir(levelReservoir);
		fuel.setDateSupplies(dateSupplies);

		// Saves fuel
		FuelBean fuelBean = new FuelBean();
		try {
			fuelBean.addFuel(fuel);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Prints the feed that was added
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>Supply the date" + fuel.getDateSupplies() + " added successfully!</h2>");
		out.println("</body>");
		out.println("</html>");

	}

}
