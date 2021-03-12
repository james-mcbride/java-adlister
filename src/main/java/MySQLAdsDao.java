import java.sql.Connection;
import java.sql.DriverManager;
import com.mysql.cj.jdbc.Driver;

public class MySQLAdsDao implements Ads {
    private Connection connection;

    MySQLAdsDao(Config config){
        try {
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );

            Statement stmt = connection.createStatement();
        } catch{

        }
    }

}
