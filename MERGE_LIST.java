import java.util.ArrayList;
import java.util.Arrays;
class MERGE_LIST
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list1=new LinkedList<>(Arrays.asList(1,2,3));
        LinkedList<Integer> list2=new LinkedList<>(Arrays.asList(4,5,6));
        list1.addAll(list2);
        System.out.println("merged list: "+list1);
    }
}