import java.util.Scanner;

class exception
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first No");
        int No1 = sobj.nextInt();

        System.out.println("Enter Second No");
        int No2 = sobj.nextInt();

        float Ans = No1 / No2;

        System.out.println("division is :" +Ans);
    }
}