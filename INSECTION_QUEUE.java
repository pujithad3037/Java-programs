import java.util.ArrayList;
import java.util.Scanner;
class INSECTION_QUEUE
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> names=new ArrayList<>();
        System.out.print("Enter number of names: ");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            System.out.print("enter name:");
            names.add(sc.nextLine());
        }
        System.out.println("names list: " + names);
    }
}