import java.util.*;
class FILTER{
    public static void main(String[] args)
    {
        List<Integer> list=Arrays.asList(5,10,15,20,8);
        list.stream()
        .filter(x->x>10)
        .forEach(System.out::println);
    }
}