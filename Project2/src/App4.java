import java.sql.*;
import java.io.*;

public class App4 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/renocrewwork", "root", "Nh@2218#0112");
            String sql = "insert into images(picture) values(?)";
            PreparedStatement st = con.prepareStatement(sql);
            
            FileInputStream fis = new FileInputStream("C:\\Users\\navan\\OneDrive\\Desktop\\Image\\Photo.jpeg");
            st.setBinaryStream(1, fis, fis.available());

            int rowsAffected = st.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Inserted successfully!!!");
            } else {
                System.out.println("Oops! Data not inserted.");
            }

            // Close the resources
            st.close();
            fis.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
