
class StringDemo
{
    public static void main(String Arg[])
    {
        String s1 = "HELLO";

        String s2 = new String("HELLO");

        char Arr[] = {'H','E','L','L','O'};
        String s3 = new String(Arr);

        System.out.println(s1);
        System.out.println(s3);
        System.out.println(s2);

        System.out.println(s1.length());
        System.out.println(s2.length());
        System.out.println(s3.length());

        
    }
}