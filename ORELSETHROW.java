import java.util.*;
class ORELSETHROW
{
    public static void main(String[] args)
    {
        Optional<String> s=Optional.ofNullable(null);
        System.out.println(s.orElseThrow(()->new RuntimeException("no value")));
    }
}