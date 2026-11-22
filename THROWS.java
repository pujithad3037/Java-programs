import java.io.FileNotFoundException;
class THROWS
{
    public static void main(String[] args)
    {
        try{
            readFile("example.txt");
        } catch(FileNotFoundException e)
        {
            System.out.println("File not found: " + e.getMessage());
        }
    }
    public static void readFile(String fileName) throws FileNotFoundException
    {
        if(!fileExists(fileName))
        {
            throws new FileNotFoundException("File not found: " + fileName);
        }
        System.out.println("File "+fileName+"found.Reading...");
    }
    public static boolean fileExists(String fileName)
    {
        return false;
    }
}