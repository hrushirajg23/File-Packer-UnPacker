/*Accept file name from user and accept data from user and write data into file */

import java.util.*;
import java.io.*;

class Program312
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

            FileOutputStream fobj=new FileOutputStream(FileName);  //existing data overwrite hoto karan FileOutputStream cha 2nd parameter boolean asto which is optional and is by default false

            /*FileOutputStream is powerful than FileWrite karan FileWrite only accepts characters(a,b,c...) 
            but FileOutputStream accepts data in byte format . Byte format madhe kuthla pn data fit hoto like mp3,mp4 incling characters*/

            byte arr[]=Data.getBytes();

            fobj.write(arr);
            fobj.close();
        }
        
        catch(Exception obj)
        {
            System.out.println("Exception occured");
        }

    }
}