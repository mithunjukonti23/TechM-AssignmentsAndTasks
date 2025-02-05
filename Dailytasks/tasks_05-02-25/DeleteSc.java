package database;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteSc {
		public static void main(String args[])throws SQLException,Exception{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm?autoReconnect=true&useSSL=false","root","tiger");
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the id of row to be deleted : ");	
			int eid=sc.nextInt();
			PreparedStatement ps = con.prepareStatement("Delete from Employee where emoid=?");
			ps.setInt(1,eid);		
			int value = ps.executeUpdate();
			if (value > 0) {
                System.out.println(value+ " rows deleted successfully.");
            } else {
                System.out.println("Deletion failed.");
            }	
			con.close();
		   }
		}
