import java.util.Scanner;
class revpyramid
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows");
        int rows=sc.nextInt();
        for(int i=rows;i>=1;i--)
        {
            for(int sp=1;sp<=rows-i;sp++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}