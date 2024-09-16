import java.io.*;
import java.util.*;

class AgeInvalid extends Exception
{

}

class user
{
    public static void main(String Avg[])
    {
        try
        {
            Scanner sobj = new Scanner(System.in);

            System.out.println("please enter your age\n");
            int Age = sobj.nextInt();

            if (Age < 18)
            {
                throw new AgeInvalid();
            }
            else
            {
                System.out.println("you successfully login on site");
            }
        }

        catch(AgeInvalid obj)
        {
            System.out.println("age is invalid to register for this state \n");
        }
    }
}

