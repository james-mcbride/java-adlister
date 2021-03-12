import java.sql.*;
import java.util.ArrayList;

import com.mysql.cj.jdbc.Driver;

public class JBDCDemo {
    public static void main(String[] args) {
        try {
            Config config=new Config();
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
// work from initial jdbc lecture on 3/11
//            Statement statement = connection.createStatement();
//            ResultSet rs = statement.executeQuery("SELECT * FROM albums");
//
//            while (rs.next()) {
//                System.out.println("rs.getString(\"artist\") = " + rs.getString("artist"));
//            }
//            statement.execute("DELETE FROM albums WHERE id = 6");
//
//
////            statement.executeUpdate("INSERT INTO albums (artist, name, release_date, genre, sales) VALUES('Nelly Furtado', 'Loose', 2006, 'Dance-pop, hip hop, R&B', 12.5)");
//
//            rs = statement.executeQuery("SELECT * FROM albums");
//
//            while (rs.next()) {
//                System.out.println("rs.getString(\"id\") = " + rs.getLong(1));
//                System.out.println("rs.getString(\"artist\") = " + rs.getString(2));
//            }

            //work on next tbdc lecture on 3/12
            ArrayList <Album> albums = new ArrayList<>();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from albums");
            while (rs.next()){
                Album album = new Album(rs.getLong("id"),
                        rs.getString("artist"),
                        rs.getString("name"),
                        rs.getInt("release_date"),
                        rs.getFloat("sales"),
                        rs.getString("genre"));
                albums.add(album);
            }

            for (Album album: albums){
                System.out.println(album.getArtist());
                System.out.println(album.getName());
                System.out.println(album.getRelease_date());
                System.out.println(album.getSales());
                System.out.println(album.getGenre());
            }



        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}