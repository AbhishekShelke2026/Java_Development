// linklist

import java.util.*;

class collections1
{
    public static void main(String Arg[])
    {
        LinkedList <Integer> lobj = new LinkedList<Integer>();

        lobj.add(11);
        lobj.add(21);
        lobj.add(51);
        lobj.add(101);

        System.out.println(lobj);
        lobj.addFirst(5);
        System.out.println(lobj);

        Integer iobj = lobj.iterator();
        while(lobj.hashnext())
        {
            System.out.println(lobj.next());
        }
        lobj.clear();
    }
}