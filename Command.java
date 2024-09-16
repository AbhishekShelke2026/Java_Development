class Command
{
    public static void main(String Arg[])
    {
        System.out.println("Name of command Line Argument :"+Arg.length);
        int i = 0;

        for(i = 0; i< Arg.length; i++)
        {
            System.out.println(Arg[i]);
        }

    }
}


//javac command.java

// java Command MArvellous PPA LB 11 