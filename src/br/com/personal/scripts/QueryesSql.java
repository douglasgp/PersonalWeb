package br.com.personal.scripts;

import java.sql.Connection;

public class QueryesSql {
	Connection con = null;

	public void SqlInsere() {
		// Connection con = new ConnectionFactory().getConnection();
		String sql = "INSERT INTO tb_fuel"
				+ " (valorLitro, valorTotal, kmAtual, kmPercorrido, totalLitro, nivelReservatorio, dataAbastece)"
				+ " values (?,?,?,?,?,?,?)";
		// PreparedStatement stmt = con.prepareStatement(sql);
	}

}
