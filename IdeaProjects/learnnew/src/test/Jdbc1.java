package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc1 {
    public static void main(String[] args) throws Exception{

        String url= "jdbc:mysql://localhost/demo_sql";
        String uname="root";
        String pass="Imaginnovate@123";
        String query="select * from students;";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("con1");
            Connection con= DriverManager.getConnection(url,uname,pass);
            System.out.println("con:");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(query);

            String studentdata="";
            while ( rs.next()) {
                studentdata = rs.getString(1) + "|" + rs.getString(2) + "|" + rs.getString(3) + "|" + rs.getString(4) + "|" + rs.getString(5) + "|" + rs.getString(6);
                System.out.println(studentdata);
            }
            st.close();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
