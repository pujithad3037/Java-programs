import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
class NEW_VALUE
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> list=new ArrayList<>(Arrays.asList("A","B","C"));
        System.out.print("enter index to replace: ");
        int index=sc.nextInt();
        sc.nextLine();
        System.out.print("enter new value:");
        String value=sc.nextLine();
        list.set(index,value);
        System.out.println("updated list: "+list);
    }
}