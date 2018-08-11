package br.com.personal.testes;

import javax.swing.JOptionPane;

import br.com.personal.controle.UserBean;
import br.com.personal.modelo.User;

public class TestUpdateUser {
	public static void main(String[] args) {
		
		String value = JOptionPane.showInputDialog("Enter the ID to change a record: ");
		Long idUser = Long.parseLong(value.trim());
		
		User user = new User();
		user.setName("José Manuel");
		user.setTelephone("+55 11 98865-3799");
		user.setLogin("josé-manuel");
		user.setPassword("mudar.123");
		user.setProfile("user");
		user.setEmail("jmanuel@email.com");
		user.setId(idUser);
		
		UserBean userBean = new UserBean();
		userBean.update(user);
		
		JOptionPane.showMessageDialog(null, "Registry changed successfully!");
		
	}

}
