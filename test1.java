import java.sql.*;

class test1
{
    public static void main(String A[])
    {
        Connection cobj = DriverManager.getConnetion("xampp:mysql:bin:mysql.exe","root","root");

        Statement sobj = cobj.createStatement();

        ResultSet robj = sobj.executeQyery("select * from student");

        while (robj.next())
        {
            System.out.println("rno :"+robj.getInt("rno"));
            System.out.println("name :"+robj.getString("name"));
            System.out.println("city :"+robj.String("city"));
        }

    }
}