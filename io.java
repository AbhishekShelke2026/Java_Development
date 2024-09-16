import java.util.Scanner;

class io
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first No");
        int No1 = sobj.nextInt();

        System.out.println("Enter Second No");
        int No2 = sobj.nextInt();

        int Ans = No1 + No2;

        System.out.println("Addition is :" +Ans);
    }
}

/*

 datatype           function

 boolean            nextBoolean
 byte               nextByte
 char               -----
 int                nextInt
 float              nextFloat
 double             nextDouble
 string             nextLine
 short              nextShort
 long               nextLong
   
*/