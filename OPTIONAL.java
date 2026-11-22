import java.util.*;
class OPTIONAL{
    public static void main(String[] args)
    {
        Optional<String> s=Optional.of("hey i am");
        s.flatMap(v->Optional.of(v.toUpperCase()));
        System.out.println(s);

    }
}