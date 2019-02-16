import java.io.File;
import java.io.FilenameFilter;

class OnlyExt implements FilenameFilter
{
    String ext;
    
        public OnlyExt(String ext)
        {
            this.ext = "." + ext;
        }
    
        public boolean accept(File dir, String name)
        {
            return name.endsWith(ext);
        }
}

public class UsingFileNameFilterDemo
{
    public static void main(String[] args)
    {
        String dirname = "F:\\Boffins"; // LINE A
        File f1 = new File(dirname); // LINE B
        String[] allFiles = f1.list(); // LINE C

        System.out.println("Printing all files in the directory.");
        for(int i = 0; i < allFiles.length; i++)
        {
            System.out.println(allFiles[i]);
        }
        System.out.println("-----------------------");

        FilenameFilter only = new OnlyExt("html"); // LINE D
        System.out.println("Printing files after filtering.");
        String s[] = f1.list(only); // LINE E
        for(int i = 0; i < s.length; i++)
        {
            System.out.println(s[i]);
        }

    }

}