/*split activity*/
//just explained with example 
import java.util.*;
import java.io.*;

class Program333
{
    public static void main(String arg[])throws Exception
    {
        Scanner sobj=new Scanner(System.in);

        String str="     Hello     "; 

        System.out.println("Length of str is: "+str.length()); //15

        str=str.trim(); //whitespaces trim hotayt sagle before and after sentence

        System.out.println("Length of str is: "+str.length()); //5
    }
}

