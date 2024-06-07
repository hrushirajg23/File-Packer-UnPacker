/*Accept file name from user and  copy data from that file to other file */

import java.util.*;
import java.io.*;

class Program316
{
    public static void main(String arg[]) throws Exception
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("ENter name of source file which is existing...");
        String SourceFile=sobj.nextLine();

        System.out.println("ENter name of destination file that we want to create...");
        String DestinationFile=sobj.nextLine();
    
        File fobj=new File(SourceFile);

        if(!fobj.exists())
        {
            System.out.println("Source File is not working...");
            return;
        }

        File fobj1=new File(DestinationFile);
        fobj.createNewFile();

        FileInputStream fiobj=new FileInputStream(SourceFile);
        FileOutputStream foobj=new FileOutputStream(DestinationFile);


        byte Buffer[]=new byte[1024];
        int iRet=0;

        while((iRet=fiobj.read(Buffer))!=-1)
        {
            foobj.write(Buffer,0,iRet);
        }

        fiobj.close();
        foobj.close();

    }

}