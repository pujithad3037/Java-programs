import java.util.LinkedList;
import java.util.Scanner;
class FOUND_NAME
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        LinkedList<String> list=new LinkedList<>();
        list.add("red");
        list.add("blue");
        list.add("green");
        System.out.print("enter value to search: ");
        String value=sc.next();
        if(list.contains(value))
        {
            System.out.println("Found");
        }
        else
        {
            System.out.println("not found");
        }
    }
}