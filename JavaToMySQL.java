import java.sql.*;

public class JavaToMySQL {
      private static final String url="jdbc:mysql://localhost:3306/Tasks_for_bot";
    private static final String user="root";
    private static final String password="AAr-1991m";
    private static Connection con;
    private static Statement stmt;
    private  static ResultSet rs;

    public static void main(String[] args){
        String query="SELECT person_id, fname, l_name FROM person";
        try {
        con=DriverManager.getConnection(url, user, password);
        stmt= con.createStatement();
        rs=stmt.executeQuery(query);
            while (rs.next()) {
                String fname = rs.getString(1);
                String l_name = rs.getString(1);
                Integer person_id=rs.getInt(1);
                System.out.printf(fname);
                System.out.printf(l_name);
                System.out.printf(person_id.toString());
            }

        }
        catch (SQLException e){

        } finally{
            try { con.close(); } catch(SQLException se) { /*can't do anything */ }
            try { stmt.close(); } catch(SQLException se) { /*can't do anything */ }
            try { rs.close(); } catch(SQLException se) { /*can't do anything */ }
        }

    }}

