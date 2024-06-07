/*Accept file name from user and display Information(properties) of that file */

import java.util.*;
import java.io.*;

class Program310
{
    public static void main(String arg[]) throws Exception
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("ENter the name of File: ");
        String FileName=sobj.nextLine();

        try
        {
            File fobj=new File(FileName);

            boolean bRet=false;

            bRet=fobj.exists();

            if(bRet) //if(bRet==true)
            {
                System.out.println("Name of File is "+fobj.getName());
                System.out.println("Absolute path of File is "+fobj.getAbsolutePath());
                System.out.println("Size of File is "+fobj.length());
                System.out.println("We can read from File "+fobj.canRead());
                System.out.println("We can write into File  "+fobj.canWrite());
            }

            

        }
        
        catch(Exception obj)
        {
            System.out.println("Exception occured");
        }

    }
}