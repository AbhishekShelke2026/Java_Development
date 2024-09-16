class oop
{
    public static void main(String Avg[])
    {
        Arithmatic obj1 = new Arithmatic();
        Arithmatic obj2 = new Arithmatic(21,11);

        int Ret = 0;
        Ret = obj2.Addition();
        System.out.println(Ret);

        Ret = obj2.Subtraction();
        System.out.println(Ret);

    }
}

class Arithmatic
{
    public int no1;
    public int no2;

    public Arithmatic()
    {
        System.out.println("inside default constructor");
        this.no1 = 0;
        this.no2 = 0;
    }

    public Arithmatic(int A , int B)
    {
        System.out.println("inside parametrised constructor");
        this.no1 = A;
        this.no2 = B;
    }
    public int Addition()
    {
        int Ans = 0;
        Ans = no1 + no2;
        return Ans;
    }
    public int Subtraction()
    {
        int Ans = 0;
        Ans = no1 - no2;
        return Ans;
    }
}