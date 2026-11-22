import java.util.Scanner;
class grade
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks:");
        int mr=sc.nextInt();
        if(mr>=90)
        {
            System.out.println("A");
        }
        else if(mr>=70)
        {
            System.out.println("B");
        }
        else if(mr>=40)
        {
            System.out.println("c");
        }
        else{
            System.out.println("d");
        }
    }
}