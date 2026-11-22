import java.util.*;
import java.util.stream.*;
class LISTTOSET
{
    public static void main(String[] args)
    {
        List<Integer> list=Arrays.asList(1,2,2,3,4);
        Set<Integer> set=list.stream()
        .collect(Collectors.toSet());
        System.out.println(set);
    }
}