import java.sql.*;

public class App2 {
    public static void main(String[] args) {
        try {
           

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/renocrewwork", "root", "Nh@2218#0112");
            String sql = "insert into Table1(name,age) values(?,?)";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, "Kaveri");
            st.setInt(2, 2);

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
