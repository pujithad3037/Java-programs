import java.util.ArrayList;
import java.util.Scanner;
class REMOVE
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> list=new ArrayList<>();
        list.add("cat");
        list.add("dog");
        list.add("cow");
        System.out.println(list);
        System.out.print("enter value to remove: ");
        String value=sc.next();
        list.remove(value);
        System.out.println("updated list: "+list);
    }
}