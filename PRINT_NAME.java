import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
class PRINT_NAME
{
    public static void main(String[] args)
    {
        ArrayList<String> list=new ArrayList<>(Arrays.asList("puji","gowtham","ravi"));
        Iterator<String>itr=list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}