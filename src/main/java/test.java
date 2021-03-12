import java.sql.DriverManager;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.Driver;

public class test {
    public static void main(String[] args) {
        Config config = new Config();
        try {
            Connection connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from ads");
            while (rs.next()){
                System.out.println(rs.getString("title"));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
