/*Accept file name from user and create file with that name */

import java.util.*;
import java.io.*;

class Program307
{
    public static void main(String arg[]) throws Exception
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("ENter the name of File: ");
        String FileName=sobj.nextLine();

        File fobj=new File(FileName);

        boolean bRet=false;

        bRet=fobj.createNewFile();

        if(bRet==true)
        {
            System.out.println("File gets successfully created ");
        }
        else
        {
            System.out.println("Unable to create File ");
        }

    }
}