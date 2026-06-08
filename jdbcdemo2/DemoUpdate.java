package jdbcdemo2;

import java.sql.*;
import java.util.Scanner;
import java.sql.*;

public class DemoUpdate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Database Connection Details
            String url = "jdbc:mysql://localhost:3306/sitj2";
            String username = "root";
            String password = "root";

            // Establish Connection
            Connection con = DriverManager.getConnection(url, username, password);

            // Take input from user
            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();

            System.out.print("Enter New Salary: ");
            double salary = sc.nextDouble();

            // SQL Query
            String query = "UPDATE emp SET salary = ? WHERE id = ?";

            // Prepare Statement
            PreparedStatement ps = con.prepareStatement(query);

            // Set values
            ps.setDouble(1, salary);
            ps.setInt(2, id);

            // Execute query
            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee Updated Successfully");
            } else {
                System.out.println("Update Failed");
            }

            // Close resources
            ps.close();
            con.close();
            sc.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}