package database;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateDyn {
		public static void main(String args[])throws SQLException,Exception{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm?autoReconnect=true&useSSL=false","root","tiger");
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the element to update : ");	
			String s=sc.nextLine();
			System.out.println("enter the element to be updated :");	
			String s1=sc.nextLine();
			PreparedStatement ps = con.prepareStatement("update Employee set empname=? where empname=?");
			ps.setString(1,s);
			ps.setString(2,s1);			
			int value = ps.executeUpdate();
			if (value > 0) {
                System.out.println(value+ " row(s) updated successfully.");
            } else {
                System.out.println("No matching record found. Update failed.");
            }	
			con.close();
		   }
		}
