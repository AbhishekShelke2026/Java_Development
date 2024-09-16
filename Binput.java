import java.io.*;


class Binput
{
    public static void main(String Arg[])
    {
        //InputStreamReader iobj = new InputStreamReader(System.in);
        //BufferedReader bpoj = new BufferedReader(iobj);

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter your name\n");
        String name = bobj.readLine();

        System.out.println("Welcome : "+name);
    }
}