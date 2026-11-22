import java.util.Scanner;
class twodarray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows:");
        int n=sc.nextInt();
         System.out.println("enter number of columns:");
         int m=sc.nextInt();
        int arr[][]=new int[n][m];
         System.out.println("enter 2d array:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}