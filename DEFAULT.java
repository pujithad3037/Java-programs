import java.util.*;
class DEFAULT
{
    public static void main(String[] args)
    {
        Optional<String>s=Optional.ofNullable(null);
        String value=s.orElse("Default");
        System.out.println(value);
    }
}