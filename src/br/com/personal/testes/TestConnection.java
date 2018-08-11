package br.com.personal.testes;

import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.personal.jdbc.ConnectionFactory;

public class TestConnection {

	public static void main(String[] argss) {
		try {
			Connection connection = new ConnectionFactory().getConnection();
			JOptionPane.showMessageDialog(null, "Open Connection!");
			connection.close();
		} catch (SQLException e) {
			throw new RuntimeException("Connection Error!");
		}
	}
}
