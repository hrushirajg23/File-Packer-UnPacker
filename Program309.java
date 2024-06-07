/*Accept file name from user and check if file with that name exists*/

import java.util.*;
import java.io.*;

class Program309
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

            if(bRet==true)
            {
                System.out.println("File is present ");
            }
            else
            {
                System.out.println("There is not such file ");
            }

        }
        
        catch(Exception obj)
        {
            System.out.println("Exception occured");
        }

    }
}