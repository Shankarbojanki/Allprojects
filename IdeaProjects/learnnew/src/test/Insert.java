package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Insert {
    public static void main(String[] args) throws Exception{
        String url= "jdbc:mysql://localhost/demo_sql";
        String uname="root";
        String pass="Imaginnovate@123";
        String query="insert into students values (999,'swarnapushpam',54,'F','2012-05-03','kakinada');";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("con1");
            Connection con= DriverManager.getConnection(url,uname,pass);
            System.out.println("con2");
            Statement st=con.createStatement();
            int count= st.executeUpdate(query);
            System.out.println(count + "rows effected ");

            st.close();
            con.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
