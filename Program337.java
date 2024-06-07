//replace all method
import java.util.*;
import java.io.*;

class Program337
{
    public static void main(String arg[])throws Exception
    {
        Scanner sobj=new Scanner(System.in);

        String str="     Hello   World  Demo   "; 

        str=str.replaceAll(" ","");  //replace whitespace with nothing mhanje sagle whitespaces remove hotat

        System.out.println(str);

       
    }
}

