
interface Circle
{
    float Radious = 10.5f;
    float PI = 3.14f; 

    float Area();
    float Circumfarance();
}

class Marvellous implements Circle
{
    public float Area()
    {
        return PI * Radious * Radious;
    }
    public float Circumfarance()
    {
        return 2 * PI * Radious;
    }
}

class blueprint
{
    public static void main(String A[])
    {
        Marvellous mobj = new Marvellous();

        System.out.println("Area is : "+mobj.Area());
        System.out.println("Circumference  is : "+mobj.Circumfarance());

        System.out.println("Value of radious is ; "+Circle.Radious);
        System.out.println("Value of PI is ; "+Circle.PI);

       // Circle.PI = 7.12;    error

    }
}