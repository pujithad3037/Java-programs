import java.util.*;
class NULLLABLE
{
    public static void main(String[] args)
    {
        Optional<String>s=Optional.ofNullable(null);
        if(s.isPresent())
        {
            System.out.println("this is not null");
        }
        else{
            System.out.println("null");
        }
    }
}