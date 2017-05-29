package com.phani.mysqlex;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class CreateStudentInfo {
	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		try{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/phani","root","root");
		String query="create table employee(sno int,sname varchar(20),sc varchar(20),sfee double(7,2))";
		st=con.prepareStatement(query);
		st.execute(query);
		System.out.println("Table Created");
		}catch(SQLException|ClassNotFoundException re){re.printStackTrace();}
		finally{
			try{
				st.close();
				con.close();
				}catch(SQLException re){re.printStackTrace();}
				}
	}
}
