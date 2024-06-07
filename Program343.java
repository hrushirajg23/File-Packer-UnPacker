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

        System.out.println("After trim: "+str);

        str=str.replaceAll("\\s+"," "); // "\\s+" mhanje multiple whitespaces la 1 white space ne replace karel 
        System.out.println("After replace all : "+str);
       

       String words[]=str.split(" ");  //whitespace is our delimiter

       System.out.println("Number of words in the sentence are :"+words.length);

       for(int i=0;i<words.length;i++)
       {
            System.out.println(words[i]);
       }
    }
}

