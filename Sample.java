
import java.io.*;
import java.sql.*;
public class Sample {
   public static void main(String ar[])
   {
       try
       {
           Class.forName("com.mysql.jdbc.Driver");
           String url="jdbc:mysql://localhost:3306/chennai";
           Connection con=DriverManager.getConnection(url,"roottaxi","roottaxi");
           System.out.println("connected");
           Statement stmt = con.createStatement();
           ResultSet rs = stmt.executeQuery("select * from cute awards");
           System.out.println("selected");
           while(rs.next())
           {
               String s1=rs.getString("lumiin");
<<<<<<< HEAD
               String s2=rs.getString("chandra20@gmail.com");
               String s3=rs.getString("Hi welcome to the new world of team city");
=======
               String s2=rs.getString("hr.lumiins");
               String s3=rs.getString("UK taxi");
>>>>>>> 9fe68630c0dc3990e520a425f363f4025f62b9bc
               String s4=rs.getString("test");
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
