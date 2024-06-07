/*Unpacking Activity*/

import java.util.*;
import java.io.*;

class Program328
{
    public static void main(String arg[])throws Exception
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the name of packed File that you want to Unpack");
        String PackedFile=sobj.nextLine();

        File fobj=new File(PackedFile);

        FileInputStream fiobj=new FileInputStream(fobj);

        //File madhla data bytes madhe ahe ani to read karnya sathi 100 bytes cha array banavla which reads header of 100 bytes

        byte Header[]=new byte[100];

        fiobj.read(Header,0,100);   //(read kelela data Header madhe store karaychay,from 0,to 100);

        
        String Hstr=new String(Header);

        System.out.println(Hstr);

        System.out.println("length of header string is: "+Hstr.length());

        String str=Hstr.trim();

        System.out.println("length of final header string is: "+str.length());

        String Tokens[]=str.split(" ");  //space disla ki split karaycha //they get split into two strings called as tokens 
        //it returns array of strings karan to 1 string la multiple strings madhe divide kaerto 

        System.out.println("Name of file is : "+Tokens[0]);  //File cha naav is stored in tokens[0]

        System.out.println("Size of file is : "+Tokens[1]); //size of file is stored in tokens[1]

    }
}

