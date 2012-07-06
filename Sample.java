
import java.io.*;
import java.sql.*;
public class Sample {
   public static void main(String ar[])
   {
       try
       {
           Class.forName("com.mysql.jdbc.Driver");
           String url="jdbc:mysql://localhost:3306/test";
           Connection con=DriverManager.getConnection(url,"root","root");
           System.out.println("connected");
           Statement stmt = con.createStatement();
           ResultSet rs = stmt.executeQuery("select * from cute");
           System.out.println("selected");
           while(rs.next())
           {
               String s1=rs.getString("lumiin");
               String s2=rs.getString("karthick88it@gmail.com");
               String s3=rs.getString("Pastjh;trthtyh);
               String s4=rs.getString("Address");
               System.out.println(s1);
               System.out.println(s2);
               System.out.println(s3);
               System.out.println(s4);
           }
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
   }

}
