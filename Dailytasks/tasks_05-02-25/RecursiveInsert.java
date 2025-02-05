package database;
import java.sql.*;
import java.util.Scanner;
public class RecursiveInsert {
	public static void main(String[] args) throws SQLException,Exception{
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/techm?autoReconnect=true&useSSL=false","root","tiger");		
		insert(con,scan);
	}
		public static void insert(Connection con,Scanner scan) throws SQLException{
		String s;
		int eid;
		String ename;
		int sal;
		System.out.println("enter the employee id :");
		eid=scan.nextInt();
		scan.nextLine();
		System.out.println("enter the employee name :");
		ename=scan.nextLine();
		System.out.println("enter the employee salary :");
		sal=scan.nextInt();
		PreparedStatement ps =con.prepareStatement("insert into Employee(emoid,empname,sal) values(?,?,?)");		
		ps.setInt(1, eid);
		ps.setString(2, ename);
		ps.setInt(3, sal);	
		int value=ps.executeUpdate();
		System.out.println(value+" rows inserted:");
		System.out.println("do you want to insert more rows?");
		s=scan.next();
		if(s.equals("yes")) {
			insert(con,scan);
	    }
		else {
			System.out.println("Insertion process completed");
		}
	
}//function
			
}//main

