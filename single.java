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

class single
{
    public static void main(String Aks[])
    {
        Derived dobj = new Derived();
        dobj.Fun();
        dobj.Gun();
    } 
}