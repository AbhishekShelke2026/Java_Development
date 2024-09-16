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

class DerivedX extends Derived
{
    public int P , Q;
    public DerivedX()
    {
        System.out.println("Insede Derivedx Constructor");
    }
}

class hierarchal

{
    public static void main(String A[])
    {
        Derived dobj1 = new Derived();
    
        DerivedX dobj2 = new DerivedX();
    }
}