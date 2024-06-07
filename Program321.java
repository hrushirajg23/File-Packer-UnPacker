/*Accept directory name from user and combine all files into one packed file*/

import java.util.*;
import java.io.*;

class Program317
{
    public static void main(String arg[]) throws Exception
    {
        boolean bRet=false;
        Scanner sobj=new Scanner(System.in);

        System.out.println("ENter name of Directory(Folder)");
        String DirectoryName=sobj.nextLine();

        System.out.println("Enter the name of packed file you want to create ");
        String PackedFile=sobj.nextLine();

        File fobjPack=new File(PackedFile);

        bRet=fobjPack.createNewFile();
        if(bRet==false)
        {
            System.out.println("Unable to create file");
        }

        
        File fobj=new File(DirectoryName);  //folders are also treated as file

        bRet=fobj.isDirectory();

        if(bRet==true)
        {
            System.out.println("Directory is present  ");

            File Arr[]=fobj.listFiles();
            System.out.println("Number of files in directory are: "+Arr.length);

            for(int i=0;i<Arr.length;i++)
            {
                System.out.println("File name : "+ Arr[i].getName() + " File size : "+Arr[i].length());}
        }
        else
        {
            System.out.println("There is no such directory ");
        }

        
    }

}