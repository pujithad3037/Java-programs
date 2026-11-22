import java.util.Scanner;
class nestedforloopp
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                System.out.println("A");
                else
                System.out.println("B");
            }
            System.out.println();

        }
    }
}