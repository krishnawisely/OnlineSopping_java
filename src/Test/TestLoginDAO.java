package Test;

import DAO.LoginDAO;
import Model.User;

public class TestLoginDAO {

	public static void main(String[] args) throws Exception {
		User user=new User();
		LoginDAO login=new LoginDAO();
		user.setId(1);
		user.setName("krishna");
		user.setPassword("k123");
		user.setEmail("krishna@gmail.com");
		login.insert(user);

	}

}
