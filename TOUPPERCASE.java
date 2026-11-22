import java.util.*;
class TOUPPERCASE
{
    public static void main(String[] args)
    {
        Optional <String> s=Optional.of("hey i am");
        s.map(String::toUpperCase)
        .ifPresent(System.out::println);
    }
}