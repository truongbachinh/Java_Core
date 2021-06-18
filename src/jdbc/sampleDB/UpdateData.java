/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.sampleDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Hung
 */
public class UpdateData {

    public static void main(String[] args) {

        String dbURL = "jdbc:mysql://localhost:3306/sampledb";
        String username = "root";
        String password = "12345";

        try {
            Class.forName("com.mysql.jdbc.Driver");// nap driver

        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
        }

        try {
            Connection connection = DriverManager.getConnection(dbURL,username,password);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

}
