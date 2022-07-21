package test;

import java.sql.*;
/*
1.import---->java.sql
2.load and register the driver ---->com.mysql.jdbc.Driver
3.create connection --->connection
4.create a statement ---> statement
5.execute the query
6.process the results
7.close
 */
public class Main {
    public static void main(String[] args) throws Exception{

       String url= "jdbc:mysql://localhost/demo_sql";
       String uname="root";
       String pass="Imaginnovate@123";
       String query="select studentName from students where id=102";
      try{
         Class.forName("com.mysql.cj.jdbc.Driver");
         System.out.println("con1");
         Connection con=DriverManager.getConnection(url,uname,pass);
         System.out.println("con:");
         Statement st=con.createStatement();
         ResultSet rs=st.executeQuery(query);

         rs.next();
         String name=rs.getString("studentName");
         System.out.println(name);
         st.close();
         con.close();
      }catch(Exception e){
         e.printStackTrace();
      }






    }
}
