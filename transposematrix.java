import java.util.Scanner;
class transposematrix
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter rows:");
        int rows=sc.nextInt();
        System.out.println("enter cols:");
        int cols=sc.nextInt();
        int arr[][]=new int[rows][cols];
        int tran[][]=new int[cols][rows];
        System.out.println("enter matrix:");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                arr[i][j]=sc.nextInt();
                }
        }
        System.out.println("you entered matrix:");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                tran[j][i]=arr[i][j];
            }
        }
        System.out.println("transpose matrix:");
        for(int i=0;i<cols;i++)
        {
            for(int j=0;j<rows;j++)
            {
                System.out.print(tran[i][j]+" ");
            }
            System.out.println();
        }
    }
}