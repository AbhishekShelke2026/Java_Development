class StringCompare
{
    public static void main(String Arg[])
    {
        String s1 = "HELLO";

        String s2 = "DEMO";

        String s3  = new String ("HELLO");

        String s4 = "HELLO";

        if (s1 == s4)
        {
            System.out.println("s1 and s4 Are same");
        }

        if (s1 == s3)
        {
            System.out.println("s1 and s3 are same");
        }

        if(s1.equals(s3))
        {
            System.out.println("s1 and s3 are same using equals method");
        }
    }
}