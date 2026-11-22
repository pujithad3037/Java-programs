import java.io.FileReader;
import java.io.IOException;
public class file_error {
    public static void main(String[] args)
    {
        FileReader file=null;
        try{
            file=new FileReader("sample.txt");
            int ch;
            while((ch=file.read())!=-1)
            
                {
                    System.out.println((char) ch);
                }
    }
    catch(IOException e)
    {
        System.out.println("error while reading the file ");
    }
    finally{
        try{
            if(file!=null)
            {
                file.close();
                System.out.println("\n file closed successfully");
            }
        }
        catch(IOException e)
        {
            System.out.println("error while closing ");
        }
    }
    
}
}