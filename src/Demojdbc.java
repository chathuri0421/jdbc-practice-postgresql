java.sql.*;
public class Demojdbc {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:postgresql://localhost:5432/Demo";
        String uname = "postgres";
        String pass = "1234";
        String sql = "SELECT * FROM \"Student\"";
//Create statement
        //Class.forName("org.postgresql.Driver");//load & Register statement
        Connection con = DriverManager.getConnection(url, uname, pass);//Create connection statement
        System.out.println("Connection Established");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);//execute query
        // rs.next();
        //  String name=rs.getString("sname");
        // System.out.println("Name of a student is " + name);


        while (rs.next()) {
            System.out.print(rs.getInt(1) + "-");
            System.out.print(rs.getString(2) + "-");
            System.out.println(rs.getInt(3));
        }

        con.close();
        System.out.println("Connection Closed");
    }
}