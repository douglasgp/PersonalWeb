package br.com.personal.controle;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.personal.jdbc.ConnectionFactory;
import br.com.personal.modelo.User;

public class UserBean {

	private java.sql.Connection con;

	public UserBean() {
		this.con = new ConnectionFactory().getConnection();
	}

	public void addUser(User user) {

		String sql = "INSERT INTO tb_user" + "(name, telephone, login, password, profile, email)"
				+ " values (?,?,?,MD5(?),?,?)";

		try {
			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setString(1, user.getName());
			stmt.setString(2, user.getTelephone());
			stmt.setString(3, user.getLogin());
			stmt.setString(4, user.getPassword());
			stmt.setString(5, user.getProfile());
			stmt.setString(6, user.getEmail());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<User> getLista() {
		try {
			List<User> users = new ArrayList<User>();
			PreparedStatement stmt = this.con.prepareStatement("SELECT * FROM tb_user");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				User user = new User();
				user.setId(rs.getLong("id"));
				user.setName(rs.getString("name"));
				user.setTelephone(rs.getString("telephone"));
				user.setLogin(rs.getString("login"));
				user.setPassword(rs.getString("password"));
				user.setProfile(rs.getString("profile"));
				user.setEmail(rs.getString("email"));

				users.add(user);
			}
			rs.close();
			stmt.close();
			return users;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public void update(User user) {
		String sql = "UPDATE tb_user SET name=?, telephone=?, login=?, password=?, profile=?, email=?" + "WHERE id=?";

		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, user.getName());
			stmt.setString(2, user.getTelephone());
			stmt.setString(3, user.getLogin());
			stmt.setString(4, user.getPassword());
			stmt.setString(5, user.getProfile());
			stmt.setString(6, user.getEmail());
			stmt.setLong(7, user.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void remove(User user) {
		try {
			PreparedStatement stmt = con.prepareStatement("DELETE FROM tb_user WHERE id=?");
			stmt.setLong(1, user.getId());
			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

}
