import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
class REVERSE_LIST
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Collections.reverse(list);
        System.out.println("reversed list: "+list);
    }
}