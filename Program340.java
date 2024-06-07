//replace all method
import java.util.*;
import java.io.*;

class Program340
{
    public static void main(String arg[])throws Exception
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("ENter a string : ");
        String str=sobj.nextLine();

        str=str.trim();

        System.out.println("After trim: "+str);

        str=str.replaceAll("\\s",""); // "\\s" mhanje replaces multiple whitespaces

        System.out.println("After replace all : "+str);
       
    }
}

