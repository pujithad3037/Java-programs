import java.util.*;
class ORELSEGET
{
    public static void main(String[] args)
    {
        Optional<String>s=Optional.ofNullable(null);
        String value=s.orElseGet(()->"Default");
        System.out.println(value);
    }
}