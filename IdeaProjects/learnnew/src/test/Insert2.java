package test;

import java.sql.*;

public class Insert2 {
    public static void main(String[] args) throws Exception{
        String url= "jdbc:mysql://localhost/demo_sql";
        String uname="root";
        String pass="Imaginnovate@123";
        //2. ------->
        int id=789;
        String studentName="shabo";
        int age=22;
        char gender='M';
        String DOA="2021-07-29";
        String city="Vizianagaram";
        //2. --->
    // 1.  String query="insert into students values (888,'swarnapushpam',54,'F','2012-05-03','kakinada');";
        String query="insert into students values ?,?"; //2.

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("con1");
            Connection con= DriverManager.getConnection(url,uname,pass);
            System.out.println("con2");
         // 1.   Statement st=con.createStatement();
            PreparedStatement st=con.prepareStatement(query); //2.
            st.setInt(1,id);
            st.setString(2,studentName);
            st.setInt(3,age);
            st.setString(4, String.valueOf(gender));
            st.setString(5,DOA);
            st.setString(6,city);
            int count=st.executeUpdate();

            System.out.println(count+"row/s effected");
            st.close();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
