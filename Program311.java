/*Accept file name from user and accept data from user and write data into file */

import java.util.*;
import java.io.*;

class Program311
{
    public static void main(String arg[]) throws Exception
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("ENter the name of File: ");
        String FileName=sobj.nextLine();

        try
        {
            //File fobj=new File(FileName);

            System.out.println("Enter the data that you want to write into file: ");
            String Data=sobj.nextLine();

            FileWriter fwobj=new FileWriter(FileName);
            fwobj.write(Data);
            fwobj.close();
        }
        
        catch(Exception obj)
        {
            System.out.println("Exception occured");
        }

    }
}