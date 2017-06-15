package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import Connection.ConnectionUtil;
import Model.User;

public class LoginDAO {
	public void insert(User user) throws Exception
	{
		Connection conn=ConnectionUtil.getConnection();
		String query="insert into user(id,user_name,user_password,email) values(?,?,?,?)";
		PreparedStatement state=conn.prepareStatement(query);
		state.setInt(1,user.getId());
		state.setString(2,user.getName());
		state.setString(3, user.getPassword());
		state.setString(4, user.getEmail());
		int rows=state.executeUpdate();
		System.out.println(rows+"row is updated!!!");
		
	}
}
