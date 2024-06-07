/*Accept directory name from user and combine all files into one packed file*/
import java.util.*;
import java.io.*;

class Program326
{
    public static void main(String arg[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        boolean bret = false;

        System.out.println("Enter the name of Directory : ");  //treated as file
        String DirectoryName = sobj.nextLine();

        System.out.println("Enter the name of packed file that you want to create : ");
        String PackedFile = sobj.nextLine();

        File fobjPack = new File(PackedFile);

        bret = fobjPack.createNewFile();
        if(bret == false)
        {
            System.out.println("Unable to create packed file...");
            return;
        }
        

        File fobj = new File(DirectoryName);

        bret = fobj.isDirectory();
        if(bret == true)
        {
            System.out.println("Directory is present");

            File Arr[] = fobj.listFiles();
            System.out.println("Number of files in the directory are : "+Arr.length);

           
            String Header=null;

            //to write data into packed file
            FileOutputStream fcombine=new FileOutputStream(PackedFile);
            int iRet=0;

            //Travel Directory
            for(int i = 0; i < Arr.length; i++)
            {
                //create header
                Header=Arr[i].getName()+" "+Arr[i].length();
                
                for(int j=Header.length();j<100;j++)
                {
                    //add extra whitespaces at end of header
                    Header=Header+" ";
                }
                byte hArr[]=Header.getBytes();
                fcombine.write(hArr,0,100);

                //to read the file from directory
                FileInputStream fiobj = new FileInputStream(Arr[i]);

                byte Buffer[]=new byte[1024];

                //write data into packed file after header
                while((iRet = fiobj.read(Buffer)) != -1 )
                {
                    fcombine.write(Buffer,0,iRet);
                }
                fiobj.close();
                
            }
            //fcombine.close();
        }
        else 
        {
            System.out.println("There is no such directory");
        }
    }
}
