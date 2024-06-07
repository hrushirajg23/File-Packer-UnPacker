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
            byte Arr[]=new byte[100];
            
            fobj.read(Arr);  //syntax read(byte[] b)   //reads data from file and stores it into Arr
                //apan file name constructor la dila ahe so kalta ki constructor madhlya file madhla data read karaycha

            String str=new String(Arr);
            
            
            System.out.println(str);
            fobj.close();
        }
        
        catch(Exception obj)
        {
            System.out.println("Exception occured");
        }

    }
}