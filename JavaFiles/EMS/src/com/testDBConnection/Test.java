package com.testDBConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test {

	public static void main(String[] args) {
			String user = "";
			String password = "";
			String url="jdbc:mysql://localhost:3306/mycompanyDB?useSSL=false&serverTimezone=UTC";
			//String driver = "com.mysql.cj.jdbc.Driver";
		
		try {
			System.out.println(url);
			Connection myConn = DriverManager.getConnection(url,user,password);
			System.out.println("success");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
			
	}

}
