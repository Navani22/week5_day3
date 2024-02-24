
import java.sql.*;


public class App {
    public static void main(String[] args) throws Exception {

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/renocrewwork", "root", "Nh@2218#0112");
      Statement stmt = con.createStatement();
      String sql="CREATE TABLE Table1 (" +
      "id INT AUTO_INCREMENT PRIMARY KEY," +
      "name VARCHAR(255)," +
      "age INT" +
      ")";
      stmt.executeUpdate(sql);
      System.out.println("Table created sucessfully!!!");
       con.close();

    }
    catch(Exception e){
      System.out.println(e);
    }
  }

    }


