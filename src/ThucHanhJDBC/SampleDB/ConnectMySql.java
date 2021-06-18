package ThucHanhJDBC.SampleDB;

import java.sql.*;

public class ConnectMySql {
    final String urlDB = "jdbc:mysql://localhost:3306/testJDBC";
    final String username = "root";
    final String password = "123456";
    Connection conn;

    public void connectDB() throws SQLException {
        conn = DriverManager.getConnection(urlDB, username, password);
    }

    public void selectDB() {

        try {

            String studentResult = "select * from `student`";

            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(studentResult);
            while (rs.next()) {
                System.out.println("Id: " + rs.getString("id") +
                        " Full name: " + rs.getString("fullname") +
                        " Address " + rs.getString("address"));
            }
            rs.close();
            statement.close();
        } catch (SQLException e) {
            e.getMessage();
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {
        ConnectMySql db = new ConnectMySql();
        try {
            db.connectDB();
        }
        catch (SQLException e)
        {
            e.getMessage();
        }

        db.selectDB();


    }
}
