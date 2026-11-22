import java.util.Scanner;
class largesttwonum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b)
        {
            System.out.println("Largest="+a);
        }
        else{
            System.out.println("Largest="+b);
        }
    }
}