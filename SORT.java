import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class SORT
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> numbers=new ArrayList<>();
        System.out.print("Enter count: ");
        int count=sc.nextInt();
        for(int i=0;i<count;i++)
        {
            System.out.print("enter number: ");
            numbers.add(sc.nextInt());
        }
        Collections.sort(numbers);
        System.out.println("sorted list: "+numbers);
    }
}