import java.util.ArrayList;
import java.util.Arrays;
class CLEAR_LIST
{
    public static void main(String[] args)
    {
        ArrayList<String> list=new ArrayList<>(Arrays.asList("x","y","z"));
        list.clear();
        System.out.println("list after clear: "+list);
    }
}