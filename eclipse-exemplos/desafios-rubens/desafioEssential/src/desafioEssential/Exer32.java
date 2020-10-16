package desafioEssential;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

public class Exer32 {

	public static void main(String[] args) {
		Connection con  = DriverManager.getConnection(url,uname,pwd){
			Statement stmt =  con.createStatement();
			System.out.println(stmt.executeUpdate(sql));
		}
			
		

	}

}
