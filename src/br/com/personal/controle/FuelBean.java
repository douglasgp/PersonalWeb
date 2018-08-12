package br.com.personal.controle;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.personal.jdbc.ConnectionFactory;
import br.com.personal.modelo.Fuel;

public class FuelBean {

	// Open connection to database
	private Connection con;

	public FuelBean() {
		this.con = new ConnectionFactory().getConnection();
	}

	public void addFuel(Fuel fuel) throws SQLException {
		String sql = "INSERT INTO tb_fuel"
				+ " (valueLiter, amount, currentKm, kmTraveled, totalLiters, levelReservoir, dateSupplies)"
				+ " values (?,?,?,?,?,?,?)";

		try {
			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setDouble(1, fuel.getValueLiter());
			stmt.setDouble(2, fuel.getAmount());
			stmt.setInt(3, fuel.getCurrentKm());
			stmt.setDouble(4, fuel.getKmTraveled());
			stmt.setDouble(5, fuel.getTotalLiters());
			stmt.setString(6, fuel.getLevelReservoir());
			stmt.setDate(7, new Date(fuel.getDateSupplies().getTimeInMillis()));
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Fuel> getList() {
		try {
			List<Fuel> fuels = new ArrayList<Fuel>();
			PreparedStatement stmt = this.con.prepareStatement("SELECT * FROM tb_fuel");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Fuel fuel = new Fuel();
				fuel.setId(rs.getLong("id"));
				fuel.setValueLiter(rs.getDouble("valueLiter"));
				fuel.setAmount(rs.getInt("amount"));
				fuel.setCurrentKm(rs.getInt("currentKm"));
				fuel.setKmTraveled(rs.getDouble("kmTraveled"));
				fuel.setTotalLiters(rs.getDouble("totalLiters"));
				fuel.setLevelReservoir(rs.getString("levelReservoir"));

				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dateSupplies"));
				fuel.setDateSupplies(data);

				fuels.add(fuel);
			}
			rs.close();
			stmt.close();
			return fuels;

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void update(Fuel fuel) {
		String sql = "UPDATE tb_fuel SET valueLiter=?, amount=?, currentKm=?, kmTraveled=?, totalLiters=?, levelReservoir=?, dateSupplies=?"
				+ "WHERE id=?";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setDouble(1, fuel.getValueLiter());
			stmt.setDouble(2, fuel.getAmount());
			stmt.setInt(3, fuel.getCurrentKm());
			stmt.setDouble(4, fuel.getKmTraveled());
			stmt.setDouble(5, fuel.getTotalLiters());
			stmt.setString(6, fuel.getLevelReservoir());
			stmt.setDate(7, new Date(fuel.getDateSupplies().getTimeInMillis()));
			stmt.setLong(8, fuel.getId());
			stmt.executeUpdate();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException("Erro ao alterar" + e);
		}
	}

	public void remove(Fuel fuel) {
		String sql = "DELETE FROM tb_fuel WHERE id=?";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setLong(1, fuel.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
