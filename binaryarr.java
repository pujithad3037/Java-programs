import java.util.Scanner;
class binaryarr
{
    static int binarySearch(int arr[],int l,int r,int x)
    {
        if(l>r)
        return -1;
        int id=l+(r-1)/2;
        if(arr[mid]==x)
        return mid;
        if(arr[mid]>x)
        return binarySearch(arr,l,mid-1,x);     
        return binarySearch(arr,mid+1,r,x);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=
    }
}