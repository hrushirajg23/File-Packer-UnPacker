/*Accept file name from user and  read data from file */

import java.util.*;
import java.io.*;

class Program313
{
    public static void main(String arg[]) throws Exception
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("ENter the name of File: ");
        String FileName=sobj.nextLine();

        try
        {

            FileInputStream fobj=new FileInputStream(FileName);  //true lihilya mule data overwrite nahi hoat

            int b=fobj.read(); 

            System.out.println((char)b);

            fobj.close();
        }
        
        catch(Exception obj)
        {
            System.out.println("Exception occured");
        }

    }
}