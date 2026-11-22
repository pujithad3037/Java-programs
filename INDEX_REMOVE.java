import java.util.LinkedList;
import java.util.Scanner;
class INDEX_REMOVE
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.print("enter index to remove: ");
        int index=sc.nextInt();
        list.remove(index);
    System.out.println("updated list: "+list);
    }
}