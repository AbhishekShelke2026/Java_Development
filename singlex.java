class Base
{
    public int A , B ;
    public Base()
    {
        System.out.println("Inside Base Constructor");
    }
    public void Fun()
    {
        System.out.println("Inside Base Fun");
    }

}

class Derived extends Base     //class Derived : public Base
{
    public int X , Y;
    public Derived()
    {
        System.out.println("Inside Derived Constructor");
    }
    public void Gun()
    {
        System.out.println("Inside Derived Gun");
    }
}

class singlex
{
    public static void main(String Aks[])
    {
        Base bobj = new Base();
        Derived dobj = new Derived();
        Base bobj2 = new Derived();
        Derived dobj2 = new Base();

    } 
}