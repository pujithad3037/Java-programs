import java.util.Scanner;
class addmatrix
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array size:");
        int n=sc.nextInt();
        int arr1[][]=new int[n][n];
        int arr2[][]=new int[n][n];
        int arr3[][]=new int[n][n];
        System.out.println("enter first array:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("enter second array:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr3[i][j]=arr1[i][j]-arr2[i][j];
            }
        }
        System.out.print("sum of matrix:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
    }
}