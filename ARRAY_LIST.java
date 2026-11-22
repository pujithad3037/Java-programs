import java.util.ArrayList;
class ARRAY_LIST
{
    public static void main(String[] args)
    {
        ArrayList<String> names=new ArrayList<>();
        names.add("gowtham");
        names.add("puji");
        names.add("reddy");
        System.out.println("first element: "+names.get(0));
        System.out.println("second element: "+names.get(1));
        names.remove(2);
        System.out.println("elements after removel:");
        for(String name:names)
        {
            System.out.println(name);
        }
    }
}