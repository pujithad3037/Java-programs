import java.util.Scanner;
class vote
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int a=sc.nextInt();
        if(a>=18)
        {
            System.out.println("eligible");
        }
        else{
            System.out.println("not eligible");
        }
    }

}