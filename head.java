import java.util.Scanner;
class head
{
    static void printNumbers(int n)
    {
        if(n==0)
        return;
        printNumbers(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER N:");
        int n=sc.nextInt();
        printNumbers(n);
    }
}