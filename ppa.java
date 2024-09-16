import Marvellous.arithmatic;
import Infosystem.mathematics;

class ppa
{
    public static void main(String A[])
    {
        arithmatic aobj = new arithmatic();
        mathematics mobj = new mathematics();

        System.out.println(aobj.addition(10,11));
        System.out.println(aobj.subtraction(10,11));

        System.out.println(mobj.multiplication(10,11));
        System.out.println(mobj.division(10,11));
    }
}