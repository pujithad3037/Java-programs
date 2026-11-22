import java.util.*;
class selection
{
    public static void main(String args[])
    {
        int arr[] = {23,78,45,8,32,56};
        int n = arr.length;
        for(int i=0;i<n-1;i++)
        {
            int min = i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j] < arr[min])
                {
                    min = j;
                }
            }
             int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println("Sorted array:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}


