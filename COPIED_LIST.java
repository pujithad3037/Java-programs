import java.util.ArrayList;
import java.util.Arrays;
class COPIED_LIST
{
    public static void main(String[] args)
    {
        ArrayList<String>list1=new ArrayList<>(Arrays.asList("A","B","C"));
        ArrayList<String>list2=new ArrayList<>(list1);
        System.out.println("Copied list2: "+list2);
    }
}