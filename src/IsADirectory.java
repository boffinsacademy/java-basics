import java.io.*;
public class IsADirectory {

	    public static void main(String arg[])
	    {
	        String dirname = "F:\\BLOG"; 
	        File f1 = new File(dirname); // LINE A
	        System.out.println(f1.getAbsolutePath()); // LINE B 
	        if(f1.isDirectory()) // LINE C
	        {
	            System.out.println("Directory of " + dirname);
	            String s[] = f1.list(); // LINE D
	        
	            for(int i = 0; i < s.length; i++)
	            {
	                File f = new File(dirname + "/" + s[i]);
	                if(f.isDirectory())
	                {
	                    System.out.println(s[i] + " is a directory");
	                }
	                else
	                    System.out.println(s[i] + " is a file");
	            }
	        }
	        else
	            System.out.println(dirname + " is not a directory");
	    
	    }
	}