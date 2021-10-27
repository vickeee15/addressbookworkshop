import java.sql.*;
import java.sql.DriverManager;
import java.sql.Statement;

public class addressbook {
    public static void main(String[] args) {
        System.out.println("welcome to address book program");
        try {
            String url = "jdbc:mysql://localhost:3306/addressbookservice1";
            String user = "root";
            String pass = "15011999";

            Connection connection = DriverManager.getConnection(url, user, pass);
            Statement stat = connection.createStatement();
            String sql = "create table address__book(firstname varchar(50), last_name varchar(50), address varchar(150), city varchar(50), state varchar(50), zip int unsigned, phone_Number int unsigned, email varchar(50))";
            stat.executeUpdate(sql);
            System.out.println("table created successfully");
            stat.close();
            connection.close();
        }
        catch (Exception e)
        {
            System.out.println("TABLE NOT CREATED");
            e.printStackTrace();

        }

    }
    }