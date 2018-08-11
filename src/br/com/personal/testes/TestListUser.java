package br.com.personal.testes;

import java.util.List;

import javax.swing.JOptionPane;

import br.com.personal.controle.UserBean;
import br.com.personal.modelo.User;

public class TestListUser {
	public static void main(String[] args) {

		UserBean userBean = new UserBean();

		List<User> users = userBean.getLista();

		for (User user : users) {
			JOptionPane.showMessageDialog(null,
					"= = = = Registered User = = = =\n" + "\nId: " + user.getId() + "\nName: " + user.getName()
							+ "\nTelephone: " + user.getTelephone() + "\nLogin: " + user.getLogin() + "\nProfile: "
							+ user.getProfile() + "\nEmail: " + user.getEmail() + "\n");
		}

	}

}
