import java.util.*;
import java.util.stream.Stream;

import javax.management.timer.Timer;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.awt.Dimension.*;

import javax.swing.plaf.basic.BasicBorders;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
//import java.text.SimpleDateFormat;
import java.util.Date;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.nio.*;

import java.util.List;
import java.util.stream.*;
import java.io.*;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;



class Build1
{
    public static void main(String arg[])
    {
        try{
            MarvellousLogin frame=new MarvellousLogin();
            frame.setVisible(true);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage()); 
        }
    }
}


class MarvellousLogin extends Frame
{
    JButton SUBMIT;
    JLabel label1,label2,label3,TopLabel;
    final JTextField text1,text2;
    private static int attempt=3;

    MarvellousLogin()
    {
        TopLabel = new JLabel();
        TopLabel.setHorizontalAlignment(SwingConstants.CENTER);
        TopLabel.setText("Marvellous Packer UnPacker: Login");
        TopLabel.setForeground(Color.BLUE);

        Dimension topsize=TopLabel.getPreferredSize();
        TopLabel.setBounds(50,40,topsize.width,topsize.height);
        _header.add(TopLabel);

        label1=new JLabel();//
        label1.setText("Username");//Label cha naav
        label1.setForeground(Color.white);

        Dimension size=label1.getPreferredSize();//size returned in Dimension

        label1.setBounds(50,135,size.width,size.height);//(x,y,width returned by Window manager,height returned by Window manager)
        label1.setHorizontalAlignment(SwingConstants.CENTER); //

        text1=new JTextField(15);//Passing number of Columns of characters to JTextField cha constructor
        Dimension tsize=text1.getPreferredSize();   //windows manager gives the preffered size by return Dimension which contain characteristics width and height
        text1.setBounds(200,135,tsize.width,tsize.height);

        text1.setToolTipText("ENTER USERNAME");/*Jevha eka element var cursor yeto tevha hi information display hote
        In our case UserName chya textfield var cursor thevlyavar it should display ENTER USERNAME */

        label2=new JLabel();
        label2.setText("Password");
        label2.setBounds(50,175,size.width,size.height);//   (same as label1,175,same as label1,same as label1)
        label2.setHorizontalAlignment(SwingConstants.CENTER); 
        label2.setForeground(Color.white);

        text2=new JTextField(15);
        text2.setBounds(200,175,tsize.width,tsize.height);
        text2.setToolTipText("ENTER PASSWORD"); 

        text2.addFocusListener(new FocusListener(){
            public void focusGained(FocusEvent e)
            {
                System.out.println("text2 has focus");  //jevha we click on password textfield Focus gained gets implemented
            }
            public void focusLost(FocusEvent e)
            {
                label3.setText(""); //jevha focus is on another element, focus lost gets implemented
            }
        });


        SUBMIT=new JButton("SUBMIT");
        SUBMIT.setHorizontalAlignment(SwingConstants.CENTER);

        Dimension ssize=SUBMIT.getPreferredSize();

        SUBMIT.setBounds(50,220,ssize.width,ssize.height);

        label3=new JLabel();
        label3.setText("");

        Dimension l3size=label3.getPreferredSize();
        label3.setBounds(50,250,l3size.width,l3size.height);

        Thread t=new Thread(this); //this mule jo object of a class thread la call kartoy to parameter mhanun pass hoto ,Thread chya constructor la Runnable task pass hota
        t.start();

        _content.add(label1);  //_content is an object of JPanel: Panel mhanje asa area highlighted jyacha var speciic goshti add karu shakto
        _content.add(text1);

        _content.add(label2);
        _content.add(text2);

        _content.add(label3);
        _content.add(SUBMIT);

        pack();
        validate();

        ClockHome();
        setVisible(true);
        this.setSize(500,500);
        this.Resizeable(false);

            setLocationRelativeTo(null);
            SUBMIT.addActionListener(this);
        }

        public boolean Validate(String Username,String Password)
        {
            if((Username.length()<8)|| (Password.length()<8))
            {
                return false;
            }
            else
            {
                return true;
            }
        }

        public void actionPerformed(ActionEvent ae)
        {
            String value1=text1.getText();
            String value2=text2.getText();

            if(ae.getSource()==exit)
            {
                this.setVisible(false);
                System.exit(0);
            }
            if(ae.getSource()== minimize)
            {
                this.setState(Frame.ICONIFIED);
            }
            /*WindowEvents are things like window minimized, maximized, etc.
             ActionEvents are button presses, button clicks, or submitting a text field value. */

             if(ae.getSource()==SUBMIT)
             {
                if(Validate(value1,value2)==false)
                {
                    text1.setText("");
                    text2.setText("");
                    JOptionPane.showMessageDialog(this,"Short Username ","Marvellous Packer Unpacker ",JOptionPane.ERROR_MESSAGE);

                }
                if(value1.equals("MarvellousAdmin")&& value2.equals("MarvellousAdmin"))
                {
                    NextPage page=new NextPage(value1);
                    this.setVisible(false);
                    page.pack();
                    page.setVisible(true);
                    page.setSize(500,500);
                }
                else
                {
                    attempt--;

                    if(attempt==0)
                    {
                        JOptionPane.showMessageDialog(this,"Number of attempts finished","Marvellous Packer Unpacker ",JOptionPane.ERROR_MESSAGE); 
                        this.dispose();
                        System.exit(0);
                    }
                    JOptionPane.showMessageDialog(this,"Incorrect login or password","Error",JOptionPane.ERROR_MESSAGE); 

                }
             }
        }
        public void run()
        {
            for(;;)
            {
                if(text2.isFocusOwner)
                {
                    if(ToolKit.getDefaultToolKit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK))
                    {
                        text2.setToolTipText("Warning : CAPS LOCK is on ");
                    }
                    else
                    {
                        text2.setToolTipText("");

                    }
                    if((text2.getText()).length()<8)
                    {
                        label3.setText("Weak Password");
                    }
                    else
                    {
                        label3.setText("");
                    }
                }
            }
        }
    }


//Template

class ClockLabel extends JLabel implements ActionListener
{

    String type;
    SimpleDateFormat sdf;

    public ClockLabel(String type)
    {
        this.type=type;
        setForeground(Color.GREEN);

        switch(type)
        {
            case"date":sdf =new SimpleDateFormat("MMMM dd yy");
                setFont(new Font("sans serif",Font.PLAIN,12));
                setHorizontalAlignment(SwingConstants.LEFT);
                break;
            case"time":sdf =new SimpleDateFormat("hh:mm:ss a");
                setFont(new Font("sans serif",Font.PLAIN,40));
                setHorizontalAlignment(SwingConstants.CENTER);
                break;
            case"day":sdf =new SimpleDateFormat("EEEE ");
                setFont(new Font("sans serif",Font.PLAIN,16));
                setHorizontalAlignment(SwingConstants.RIGHT);
                break;
            default:sdf=new SimpleDateFormat();
            break;
            
        }
            Timer t=new Timer(1000,this);
            t.start();
    }
    public void actionPerformed(ActionEvent e)
    {
        Date d=new Date();
        setText(sdf.format(d));
    }
}

class Template extends JFrame implements Serializable,ActionListener
{
    JPanel _header;
    JPanel _content;
    JPanel _top;

    ClockLabel dayLabel;
    ClockLabel timeLabel;
    ClockLabel dateLabel;

    JButton minimize,exit;

    public Template()
    {
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        GridBagLayout grid=new GridBagLayout();
        setLayout(grid);

        _top=new JPanel();
        _top.setBackground(Color.LIGHT_GRAY);
        _top.setLayout(null);

        getContentPane().add(_top,new GridBagConstraints(0,0,1,1,1,5,GridBagConstraints.BASELINE,GridBagConstraints.BOTH,new Insets(0,0,0,0),0,0));
        _header=new JPanel();
        _header.setLayout(null);
        _header.setBackground(Color.WHITE);

        getContentPane().add(_top,new GridBagConstraints(0,0,1,1,1,20,GridBagConstraints.BASELINE,GridBagConstraints.BOTH,new Insets(0,0,0,0),0,0));
       

        _content=new JPanel();
        _content.setLayout(null);
        _content.setBackground(new Color(0,5,120));

        JScrollPane jsp=new JScrollPane(_content,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jsp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);

        getContentPane().add(jsp,new GridBagConstraints(0,0,1,1,1,20,GridBagConstraints.BASELINE,GridBagConstraints.BOTH,new Insets(0,0,0,0),0,0));
        setTitle("Marvellous Packer UnPacker");

        Clock();
        CloseAndMin();
    
    
    }   
    void CloseAndMin()
    {
        minimize=new JButton("-");
        minimize.setBackground(Color.LIGHT_GRAY);
        minimize.setBounds(MAXIMIZED_HORIZ,0, 45, 20);


        exit=new JButton("X");
        exit.setHorizontalAlignment(SwingConstants.CENTER);
        exit.setBackground(Color.LIGHT_GRAY);

        _top.add(minimize);
        _top.add(exit);
        
        exit.addActionListener(this);
        minimize.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==exit)
        {
            this.setVisible(false);
            System.exit(0);
        }   
        if(ae.getSource()==minimize)
        {
            setState(JFrame.ICONIFIED);
        }
    }


    void Clock()
    {
        dateLabel =new ClockLabel("Date");
        timeLabel=new ClockLabel("time");
        dayLabel=new ClockLabel("day");

        dateLabel.setForeground(Color.BLUE);
        timeLabel.setForeground(Color.BLUE);
        dayLabel.setForeground(Color.BLUE);
        
        
        dayLabel.setFont(new Font("Century",Font.BOLD,15));

        dayLabel.setBounds(700,10,200,100);

        timeLabel.setFont(new Font("Century",Font.BOLD,15));

        timeLabel.setBounds(760,-15,200,100);

        dateLabel.setFont(new Font("Century",Font.BOLD,15));

        dateLabel.setBounds(800,-40,200,100);


        _header.add(dateLabel);
        _header.add(dayLabel);
        _header.add(timeLabel);
    }

    void ClockHome()
    {
        dateLabel =new ClockLabel("Date");
        timeLabel=new ClockLabel("time");
        dayLabel=new ClockLabel("day");

        dateLabel.setForeground(Color.BLUE);
        timeLabel.setForeground(Color.BLUE);
        dayLabel.setForeground(Color.BLUE);
        
        
        dayLabel.setFont(new Font("Century",Font.BOLD,15));

        dayLabel.setBounds(200,20,200,100);

        timeLabel.setFont(new Font("Century",Font.BOLD,15));

        timeLabel.setBounds(260,-10,200,100);

        dateLabel.setFont(new Font("Century",Font.BOLD,15));

        dateLabel.setBounds(300,-10,200,100);


        _header.add(dateLabel);
        _header.add(dayLabel);
        _header.add(timeLabel);
    }

}


//NextPage.java

class NextPage extends Template implements ActionListener
{

    JLabel label;
    JButton pack,unpack;

    NextPage(String value)
    {
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        label=new JLabel("Welcome: "+value);
        Dimension size=label.getPreferredSize();
        label.setBounds(40,50,size.width,size.height);
        label.setFont(new Font("Century",Font.BOLD,17));
        label.setBackground(Color.BLUE);

        pack=new JButton("Pack Files");
        Dimension bSize=pack.getPreferredSize();
        pack.setBounds(100,100,bSize.width,bSize.height);
        pack.addActionListener(this);  //jevha he button click hoil Action event trigger hoil tyachi method ppudhe lhili ahe

        unpack=new JButton("Pack Files");
        Dimension b2Size=unpack.getPreferredSize();
        unpack.setBounds(300,100,b2Size.width,b2Size.height);
        unpack.addActionListener(this);


        _header.add(label);
        _header.add(pack);
        _header.add(unpack);

        ClockHome();
        this.setSize(600,600);
        this.setResizable(false);
        this.setVisible(true);

    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==exit)
        {
            this.setVisible(false);
            System.exit(0);
        }
        if(ae.getSource()==minimize)
        {
            this.setState(this.ICONIFIED);
        }
        if(ae.getSource()==pack)
        {
            this.setVisible(false);
            try{
                MarvellousPackFront obj=new MarvellousPackFront();

            }
            catch(Exception e)
            {}
        }
        if(ae.getSource()==unpack)
        {
            this.setVisible(false);
            MarvellousUnPackFront obj=new MarvellousUnPackFront();
        }
    }
}


//MarvellousPackFront.java

class MarvellousPackFront extends Template implements ActionListener
{
    JButton SUBMIT,PREVIOUS;
    JLabel label1,label2,title;
    final JTextField text1,text2;

    public MarvellousPackFront()
    {
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        title=new JLabel("Marvellous Packing Portal");
        Dimension size=getPreferredSize();
        title.setBounds(40,50,size.width,size.height);
        title.setFont(new Font("Century",Font.BOLD,17));
        title.setForeground(Color.BLUE);

        label1=new JLabel();
        label1.setText("Directory name");
        label1.setForeground(Color.WHITE);
        label1.setBounds(350,50,size.width,size.height);

        text1=new JTextField(15);
        Dimension tsize=getPreferredSize();
        text1.setBounds(500,50,tsize.width,tsize.height);
        text1.setToolTipText("Enter Directory Name");

        label2=new JLabel();
        label1.setText("Destination File Name");
        label1.setForeground(Color.WHITE);
        label1.setBounds(350,100,size.width+60,size.height);


        text2=new JTextField(15);
        text2.setBounds(500,100,tsize.width,tsize.height);
        text2.setToolTipText("Enter destination File name");
        

        SUBMIT=new JButton("SUBMIT");
        Dimension bsize=SUBMIT.getPreferredSize();
        SUBMIT.setBounds(350,200,bsize.width,bsize.height);
        SUBMIT.addActionListener(this);

        
        PREVIOUS=new JButton("PREVIOUS");
        Dimension b2size=PREVIOUS.getPreferredSize();
        PREVIOUS.setBounds(500,200,b2size.width,b2size.height);
        PREVIOUS.addActionListener(this);

        _header.add(title);
        _content.add(label1);
        _content.add(label2);
        _content.add(text1);
        _content.add(text2);
        _content.add(SUBMIT);   
        _content.add(PREVIOUS); //add method accepts Component which is Parent class of JPanel,Button etc


        this.setSize(1000,40);
        this.setResizable(false);
        this.setVisible(true);    //this mhanje jo object hya method la call karel tyavar he apply honare //eg JPanel chi size badalnar
        text1.requestFocusInWindow();


    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==exit)
        {
            this.setVisible(false);
            System.exit(0);
        }
        if(ae.getSource()==minimize)
        {
            this.setState(this.ICONIFIED);
        }
        if(ae.getSource()==SUBMIT)
        {
            try{
                MarvellousPacker obj=new MarvellousPacker(text1.getText(),text2.getText());
                this.dispose();
                NextPage t=new NextPage("Marvellous Admin");

            }
            catch(Exception e){}
        }
        if(ae.getSource()==PREVIOUS)
        {
            this.setVisible(false);
            this.dispose();
            NextPage t=new NextPage("Marvellous Admin");

        }
    }
}


class MarvellousPacker {
    
    FileOutputStream outstream=null;

    String ValidExt[]={".txt",".c",".cpp",".java"};

    public MarvellousPacker(String src,String Dest)throws Exception
    {
        String Magic="Marvellous11";
        byte arr[]=Magic.getBytes();
        File outfile=new File(Dest);

        File infile=null;
        outstream=new FileOutputStream(Dest);
        outstream.write(arr,0,arr.length);

        File folder=new File(src);

        System.setProperty("user.dir",src);

        listAllFiles(src);

    }
    public void listAllFiles(String path)
    {
        try
        (Stream <Path> paths=Files.walk(Paths.get(path)));
        {
            paths.forEach(filePath->
            {
                if(Files.isRegularFile(filePath))
                {
                    try{
                        String name=filePath.getFileName().toString();
                        String ext=name.substring(name.lastIndexOf("."));
                    }
                }
            }
            
            
            );   
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public void Pack(String filePath)
    {
        FileInputStream instream=null;
        try{
            byte[] buffer=new byte[1024];
            int length;
            byte temp[]=new byte[100];

            File fobj=new File(filePath);

            String Header =filePath+" "+fobj.length();

            for(int i=Header.length();i<100;i++)
            {
                Header=Header+" ";
            }
            temp=Header.getBytes();

            instream=new FileInputStream(filePath);

            outstream.write(temp,0,temp.length);

            while((length=instream.read(buffer))>0) //reads and stores it in byte array
            {
                outstream.write(buffer,0,length);
            }
            instream.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}





class InvalidFileException extends Exception  //user - defined exception
{
    public InvalidFileException(String str)
    {
        super(str);
    }
}

class MarvellousUnPackFront extends Template implements ActionListener
{
    JButton SUBMIT,PREVIOUS;
    JLabel label1,label2,title;
    final JTextField text1;

    public MarvellousUnPackFront()
    {
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        title=new JLabel("UnPacking Portal");
        Dimension size=title.getPreferredSize();
        title.setBounds(40,50,size.width,size.height);
        title.setFont(new Font("Century",Font.BOLD,17));
        title.setForeground(Color.blue);

        label1=new JLabel();
        label1.setText("FileName");
        label1.setForeground(Color.WHITE);
        label1.setBounds(350, 50, size.width, size.height);

        text1=new JTextField(15);
        Dimension tsize=text1.getPreferredSize();
        text1.setBounds(500, 50, tsize.width, tsize.height);
        text1.setToolTipText("Enter Name of directory");

        SUBMIT =new JButton("Extract Here");
        Dimension bsize=SUBMIT.getPreferredSize();
        SUBMIT.setBounds(350, 200, bsize.width, bsize.height);
        SUBMIT.addActionListener(this);

        PREVIOUS =new JButton("Extract Here");
        Dimension b2size=PREVIOUS.getPreferredSize();
        PREVIOUS.setBounds(350, 200, b2size.width, b2size.height);
        PREVIOUS.addActionListener(this);

        _header.add(title);
        _content.add(label1);
        _content.add(text1);
        _content.add(SUBMIT);
        _content.add(PREVIOUS);

        this.setSize(1000,400);
        this.setResizable(false);
        this.setVisible(true);
        text1.requestFocusInWindow();

    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==exit)
        {
            this.setVisible(false);
            System.exit(0);
        }
        if(ae.getSource()==minimize)
        {
            this.setState(this.ICONIFIED);
        }
        if(ae.getSource()==SUBMIT)
        {
            try{
                MarvellousUnPack obj=new MarvellousUnPack(text1.getText());
                this.dispose();
            }
            catch(InvalidFileException obj)
            {
                this.setVisible(false);
                this.dispose();

                JOptionPane.showMessageDialog(this, "Invalid Packed File","Error",JOptionPane.ERROR_MESSAGE);
                NextPage t=new NextPage("MarvellousAdmin");
            }
            catch(Exception e)
            {

            }
        }
        if(ae.getSource()==PREVIOUS)
        {
            this.setVisible(false);
            this.dispose();
            NextPage t=new NextPage("admin");
        }   
    }
}



public class MarvellousUnPack {
    FileOutputStream outstream=null;

    public MarvellousUnPack(String src)throws Exception
    {
        unpack(src);
    }
    public void unpack(String filepath)throws Exception
    {
        try{
            FileInputStream inputStream=new FileInputStream(filepath);

            byte header[]=new byte[1024];
            int length=0;

            byte Magic[]=new byte[12];
            instream.read(Magic,0,Magic.length);

            String MagicStr=new String(Magic); //byte to string conversion

            if(!MagicStr.equals("Marvellous11"))
            {
                throw new InvalidFileException("Invalid packed File Format");

            }
            while((length=instream.read(header,0,100))>0)
            {
                String str=new String(header);

                String ext=str.substring(str.lastIndexOf("/"));
                ext=ext.substring(1);
                String[] words=ext.split("\\s");

                String filename=words[0];
                int size=Integer.parseInt(words[1]);

                byte arr[]=new byte[size];

                instream.read(arr,0,size);

                FileOutputStream fout=new FileOutputStream(filename);

                fout.write(arr,0,size);

            
            
            }

        }
        catch(InvalidFileException obj)
        {
            throw new InvalidFileException("Invalid Packed File Format");

        }
        catch(Exception e)
        {
            
        }
    }
}
