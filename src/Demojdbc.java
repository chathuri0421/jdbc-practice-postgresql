import java.sql.*;
public class Demojdbc {
    public static void main(String[] args) throws Exception {

       String url="jdbc:postgresql://localhost:5432/Demo";
       String uname="postgres";
       String pass="1234";
        Class.forName("org.postgresql.Driver");
        Connection con=DriverManager.getConnection(url,uname,pass);
        System.out.println("Connection Established");
    }
}