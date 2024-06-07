//replace all method //imp
import java.util.*;
import java.io.*;

class Program342
{
    public static void main(String arg[])throws Exception
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("ENter a string : ");
        String str=sobj.nextLine();

        str=str.trim();
        str=str.replaceAll("\\s+"," "); // "\\s+" mhanje multiple whitespaces la 1 white space ne replace karel 

       String words[]=str.split(" ");  //whitespace is our delimiter

       for(String s:words)   //for each loop
       {
            System.out.println(s);
       }
    }
}

