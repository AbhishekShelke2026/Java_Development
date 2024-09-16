class Base
{
    public int A , B ;

    public void Fun()
    {
        System.out.println("Inside Base Fun");
    }
    public void Gun()
    {
        System.out.println("inside base gun");
    }
    public void Sun()
    {
        System.out.println("inside base Sun");
    }
    public void Run()
    {
        System.out.println("inside base Run");
    }

}

class Derived extends Base     
{
    public int X , Y;
    
    public void Gun()
    {
        System.out.println("Inside Derived Gun");
    }
    public void Run()
    {
        System.out.println("inside Derived Run");
    }
    public void Mun()
    {
        System.out.println("inside Derived Mun");
    }
    
}

class RMD
{
    public static void main(String Aks[])
    {
        Base bobj = new Derived();

        bobj.Fun();
        bobj.Gun();
        bpbj.Sun();
        bobj.Run();
        bobj.Mun();
        
    } 
}