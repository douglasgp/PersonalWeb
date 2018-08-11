package br.com.personal.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.personal.controle.UserBean;
import br.com.personal.modelo.User;

@WebServlet("/testes/addUser")
public class AddUserServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		PrintWriter out = response.getWriter();

		String name = request.getParameter("name");
		String telephone = request.getParameter("telephone");
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		String profile = request.getParameter("profile");
		String email = request.getParameter("email");

		User user = new User();
		user.setName(name);
		user.setTelephone(telephone);
		user.setLogin(login);
		user.setPassword(password);
		user.setProfile(profile);
		user.setEmail(email);

		UserBean userBean = new UserBean();
		userBean.addUser(user);

		out.println("<html>");
		out.println("<body>");
		out.println("<h2>User " + user.getName() + " registered successfully!</h2>");
		out.println("</body>");
		out.println("</html>");

	}

}
