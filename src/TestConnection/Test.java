package TestConnection;

import java.sql.Connection;

import Connection.ConnectionUtil;

public class Test {

	public static void main(String[] args) throws Exception {
		Connection con=ConnectionUtil.getConnection();
		System.out.println(con);

	}

}
