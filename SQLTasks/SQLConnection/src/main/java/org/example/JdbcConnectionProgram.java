package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcConnectionProgram {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/employee";
        String user = "root";
        String password = "Sharmy@123";

        String sql = "insert into employee.employee (empname,empage,esalary) values(?,?,?)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
            preparedStatement.setString(1, "Jenny");
            preparedStatement.setInt(2, 25);
            preparedStatement.setInt(3, 10000);
            preparedStatement.executeUpdate();
            preparedStatement.setString(1, "Jacky");
            preparedStatement.setInt(2, 30);
            preparedStatement.setInt(3, 20000);
            preparedStatement.executeUpdate();
            preparedStatement.setString(1, "Joe");
            preparedStatement.setInt(2, 20);
            preparedStatement.setInt(3, 40000);
            preparedStatement.executeUpdate();
            preparedStatement.setString(1, "Jhon");
            preparedStatement.setInt(2, 40);
            preparedStatement.setInt(3, 80000);
            preparedStatement.executeUpdate();
            preparedStatement.setString(1, "Shameer");
            preparedStatement.setInt(2, 25);
            preparedStatement.setInt(3, 90000);
            preparedStatement.executeUpdate();
            System.out.println("All records inserted successfully!");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}


/*OUTPUT:
101	Jenny	25	10000
102	Jacky	30	20000
103	Joe	20	40000
104	Jhon	40	80000
105	Shameer	25	90000
 */