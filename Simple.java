import java.io.*;
import java.sql.*;
public class Simple {
    public static void main(String ar[])
    {
        try
        {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con=DriverManager.getConnection("jdbc:odbc:test");
            System.out.println("Connected");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from cute");
            while(rs.next())
            {
                String s1=rs.getString("Ename");
                String s2=rs.getString("Email");
                String s3=rs.getString("Password");
                String s4=rs.getString("Address");
                System.out.print(s1);
                System.out.print("\t");
                System.out.print(s2);
                System.out.print("\t");
                System.out.print(s3);
                System.out.print("\t");
                System.out.print(s4);
                System.out.print("\n");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }

}
