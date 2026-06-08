package jdbcdemo2;


import java.util.Scanner;
import java.sql.*;

public class DemoDelete {
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
            System.out.print("Enter Employee ID to delete: ");
            int id = sc.nextInt();

            // SQL Query
            String query = "DELETE FROM emp WHERE id = ?";

            // Prepare Statement
            PreparedStatement ps = con.prepareStatement(query);

            // Set value
            ps.setInt(1, id);

            // Execute query
            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee Deleted Successfully");
            } else {
                System.out.println("Delete Failed ");
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