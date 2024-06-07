/*split activity*/
//just explained with example 
import java.util.*;
import java.io.*;

class Program333
{
    public static void main(String arg[])throws Exception
    {
        Scanner sobj=new Scanner(System.in);

        String str="     Hello  world  Demo     "; 

        System.out.println("Length of str is: "+str.length());//28

        str=str.trim(); //whitespaces trim hotat but before and after sentence , 2 words chya madhle white spaces nahi remove hoat, fakt start and end che trim hotat

        System.out.println("Length of str is: "+str.length()); 
        
    }
}

