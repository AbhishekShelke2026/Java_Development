class Base
{
    public void Fun()
    {
        System.out.println("inside base fun");
    }
    public final void gun()
    {
        System.out.println("inside base gun");
    }
}

class Derived extends Base
{
    public void Fun()
    {
        System.out.println("inside derived fun");
    }
    public void gun()              //error
    {
        System.out.println("inside derived gun");
    }

}

class final2
{
    public static void main(String A[])
    {
        
    }
}