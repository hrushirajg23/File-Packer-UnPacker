/*Accept directory name from user and check if directory(folder) is present*/

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
        }
        else
        {
            System.out.println("There is no such directory ");
        }

        
    }

}