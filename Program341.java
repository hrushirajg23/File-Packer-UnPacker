//replace all method
import java.util.*;
import java.io.*;

class Program341
{
    public static void main(String arg[])throws Exception
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("ENter a string : ");
        String str=sobj.nextLine();

        str=str.trim();

        System.out.println("After trim: "+str);

        str=str.replaceAll("\\s+"," "); // "\\s+" mhanje multiple whitespaces la 1 white space ne replace karel 
        System.out.println("After replace all : "+str);
       
    }
}

