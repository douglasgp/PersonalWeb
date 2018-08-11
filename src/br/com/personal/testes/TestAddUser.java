package br.com.personal.testes;

import javax.swing.JOptionPane;

import br.com.personal.controle.UserBean;
import br.com.personal.modelo.User;

public class TestAddUser {
	public static void main(String[] args) {

		User user = new User();
		user.setName("José Manuel");
		user.setTelephone("+55 11 98865-3799");
		user.setLogin("jmanuel");
		user.setPassword("mudar.123");
		user.setProfile("user");
		user.setEmail("jmanuel@email.com");

		UserBean userBean = new UserBean();
		userBean.addUser(user);
		
		User user2 = new User();
		user2.setName("Douglas Galdino Pereira");
		user2.setTelephone("+55 11 97660-1947");
		user2.setLogin("douglas.galdino");
		user2.setPassword("mudar.123");
		user2.setProfile("user");
		user2.setEmail("douglas22galdino@gmail.com");

		UserBean userBean2 = new UserBean();
		userBean2.addUser(user2);
		
		User user3 = new User();
		user3.setName("Manuel Oliveira");
		user3.setTelephone("+55 11 95568-3582");
		user3.setLogin("manu.oliveira");
		user3.setPassword("mudar.123");
		user3.setProfile("user");
		user3.setEmail("manueloliveira@email.com");

		UserBean userBean3 = new UserBean();
		userBean3.addUser(user3);
		
		User user4 = new User();
		user4.setName("Carla Alessandra Moreira");
		user4.setTelephone("11 98865-3799");
		user4.setLogin("carla.moreira");
		user4.setPassword("mudar.123");
		user4.setProfile("user");
		user4.setEmail("cmoreira@email.com");

		UserBean userBean4 = new UserBean();
		userBean4.addUser(user4);
		
		User user5 = new User();
		user5.setName("Cristopher Veloso");
		user5.setTelephone("+55 11 99589-3287");
		user5.setLogin("cris.veloso");
		user5.setPassword("mudar.123");
		user5.setProfile("user");
		user5.setEmail("cveloso@gmail.com");

		UserBean userBean5 = new UserBean();
		userBean5.addUser(user5);

		JOptionPane.showMessageDialog(null, "Done!");

	}

}
