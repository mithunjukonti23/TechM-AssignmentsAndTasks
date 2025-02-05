package database;



import java.sql.*;
import java.util.Scanner;

public class  Menu{
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in);
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm?autoReconnect=true&useSSL=false", "root", "tiger")) {
            while (true) {
                System.out.println("\nMENU");
                System.out.println("1. Insert");
                System.out.println("2. Update");
                System.out.println("3. Delete");
                System.out.println("4. Select");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                int c = sc.nextInt();
                sc.nextLine(); 
                switch (c) {
                    case 1:
                        insertRow(con, sc);
                        break;
                    case 2:
                        updateRow(con, sc);
                        break;
                    case 3:
                        deleteRow(con, sc);
                        break;
                    case 4:
                        selectRow(con, sc);
                        break;
                    case 5:
                        System.out.println("exiting program");
                        return;
                    default:
                        System.out.println("invalid choice");
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    private static void insertRow(Connection con, Scanner sc) throws SQLException {
        System.out.print("enter employee id: ");
        int eid = sc.nextInt();
        sc.nextLine(); 
        System.out.print("enter employee name: ");
        String ename = sc.nextLine();
        System.out.print("enter employee salary: ");
        int sal = sc.nextInt();

        String query = "insert into Employee (emoid, empname, sal) values (?, ?, ?)";
        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, eid);
            ps.setString(2, ename);
            ps.setDouble(3, sal);

            int value = ps.executeUpdate();
            if (value > 0) {
                System.out.println(value+"row inserted successfully!");
            } else {
                System.out.println("insertion failed");
            }
        }
    }

    private static void updateRow(Connection con, Scanner sc) throws SQLException {
        System.out.print("enter employee id to update: ");
        int eid = sc.nextInt();
        sc.nextLine();
        System.out.print("enter new employee name: ");
        String empname = sc.nextLine();
        System.out.print("enter new employee salary: ");
        int sal = sc.nextInt();

        String query = "update Employee set empname=?, sal=? where emoid=?";
        try (PreparedStatement ps = con.prepareStatement(query)) {
        	ps.setString(1, empname);
        	ps.setInt(2, sal);
            ps.setInt(3, eid);                  
            int value = ps.executeUpdate();
            if (value > 0) {
                System.out.println("row updated successfully");
            } else {
                System.out.println("update failed.");
            }
        }
    }

    private static void deleteRow(Connection con, Scanner sc) throws SQLException {
        System.out.print("enter employee id to delete: ");
        int eid = sc.nextInt();

        String query = "delete from Employee where emoid=?";
        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, eid);
            int value = ps.executeUpdate();
            if (value > 0) {
                System.out.println(value+"row deleted successfully!");
            } else {
                System.out.println("deletion failed");
            }
        }
    }


    private static void selectRow(Connection con, Scanner sc) throws SQLException {
        try (Statement s = con.createStatement()) {
            ResultSet rs = s.executeQuery("select * from Employee");
            while(rs.next()) {
                System.out.println(rs.getInt("emoid"));
                System.out.println(rs.getString("empname"));
                System.out.println(rs.getDouble("sal"));
            } 
        }
        }
    }
            
