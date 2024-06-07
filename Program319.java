/*Accept directory name from user and return number of files present*/

import java.util.*;
import java.io.*;

class Program317
{
    public static void main(String arg[]) throws Exception
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("ENter name of Directory(Folder)");
        String DirectoryName=sobj.nextLine();

        boolean bRet=false;
        File fobj=new File(DirectoryName);  //folders are also treated as file

        bRet=fobj.isDirectory();

        if(bRet==true)
        {
            System.out.println("Directory is present  ");

            File Arr[]=fobj.listFiles();
            System.out.println("Number of files in directory are: "+Arr.length);

            for(int i=0;i<Arr.length;i++)
            {
                System.out.println(Arr[i].getName());
            }
        }
        else
        {
            System.out.println("There is no such directory ");
        }

        
    }

}