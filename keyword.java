class Base
{
    public int A ,B;

    Base()
    {
        System.out.println("inside base constructor");

        this.A = 10;
        this.B = 20;
    }
    public void fun()
    {
        System.out.println("inside fun of base");
    }
}


class Derived extends Base
{
    public int X , Y;

    public Derived(int i , int j)
    {
        System.out.println("inside derived constructor");

        this.X = i;
        this.Y = j;
    }
    public void gun()
    {
        System.out.println("inside gun of derived");
        
        super.fun();

        System.out.println("Value of A :" +super.A);
        System.out.println("value of B :"+this.X);
    }
}
class keyword
{
    public static void main(String Arg[])
    {
        Derived dobj = new Derived(11,21);
        dobj.gun();
    }
}