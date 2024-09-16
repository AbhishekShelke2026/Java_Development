import java.util.Scanner;

class exception3
{
    public static void main(String A[])
    {
        try
        {
            Scanner sobj = new Scanner(System.in);
            int Arr [] = {10,20,30,40,50};

            System.out.println("Enter the Try Number:");
            int i = sobj.nextInt();

            System.out.println(Arr[i]);

        }

        catch(ArrayIndexOutOfBoundsException obj)
        {
            System.out.println("Inside Catch Bolck");
        }

        finally
        {
            System.out.println("Inside Finally block");
        }

        System.out.println("End of Class");

    }
}