import java.util.*;
class SUMMAP
{
    public static void main(String[] args)
    {
        List<Integer> list=Arrays.asList(1,2,3,4,5);
        int sum=list.stream()
        .reduce(0,(a,b)->a+b);
        System.out.println("sum="+sum);
    }
}