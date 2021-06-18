/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.sampleDB;

import java.sql.*;

/**
 *
 * @author Hung
 */
public class SelectData { 
    public static void main(String[] args) {

         
        String dbURL = "jdbc:mysql://localhost:3306/sampledb";
        String username = "root";
        String password = "123456";

        try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {

            String sql = "SELECT * FROM Users";// where username=?";

            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);

            int count = 0;

            while (result.next()) {
                String name = result.getString(2);
                String pass = result.getString(3);
                String fullname = result.getString("fullname");
                String email = result.getString("email");

                String output = "User #%d: %s - %s - %s - %s";
                System.out.println(String.format(output, ++count, name, pass, fullname, email));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    }

