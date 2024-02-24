import java.sql.*;
import java.io.*;

public class App3 {
    public static void main(String[] args) {
        try {
           BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter name: ");
            String name = reader.readLine();

            System.out.print("Enter age: ");
            int age = reader.read();


            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/renocrewwork", "root", "Nh@2218#0112");
            String sql = "insert into Table1(name,age) values(?,?)";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, name);
            st.setInt(2, age);

            int rowsAffected = st.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Inserted successfully!!!");
            } else {
                System.out.println("Oops! Data not inserted.");
            }
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
