package online_app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.LoginDAO;
import Model.User;

@WebServlet("/Online")
public class Online extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String name=request.getParameter("user_name");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		
		PrintWriter out = response.getWriter();
		out.println("Name=" + name );
		
		LoginDAO login=new LoginDAO();
		User user=new User();
		
		user.setName(name);
		user.setPassword(password);
		user.setEmail(email);
		
		
		try {
			login.insert(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
