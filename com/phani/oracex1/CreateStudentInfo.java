package com.phani.oracex1;
import java.sql.*;
class CreateStudentInfo{
public static void main(String[] args) {
Connection con=null;
Statement st=null;
try{
Class.forName("oracle.jdbc.driver.OracleDriver");
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","phani","phani");
System.out.println(con);
st=con.createStatement();
System.out.println(st);
st.execute("create table employer(sno number, sname varchar2(20), sc varchar2(20),sfee number(7,2))");
System.out.println("Table created...");
}catch(SQLException|ClassNotFoundException re){re.printStackTrace();}
finally{
	try{
		st.close();
		con.close();
		}catch(SQLException re){re.printStackTrace();}
		}
	}
}
