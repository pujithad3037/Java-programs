import java.util.*;
class STREAM{
    public static void main(String[] args)
    {
        List<Integer> list=Array.asList(1,2,3,4,5,6);
        List.stream()
        .filter(x->x%2==0)
        .map(x->x*2)
        .forEach(System.out::println);
    }
}