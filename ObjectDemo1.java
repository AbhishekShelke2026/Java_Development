

class Marvellous
{
    public int i , j;
    
    public Marvellous()
    {
        System.out.print("Marvellous Constructor\n");
    }

    protected void finalize()
    {
        System.out.println("inside finalize method\n");
    }
}

//class ObjectDemo extends Object

class ObjectDemo1
{
    public static void main(String Avg[])
    {
        Marvellous obj = new Marvellous();

        System.out.println(obj.hashCode());

        obj = null;
        System.gc();
    }

}