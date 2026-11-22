class foundd
{
    public static void main(String[] args)
    {
        try{
            int arr[]={1,2,3};
            System.out.println("Element at index 3: " +arr[3]);
        } catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException occured:"+e.getMessage());
        }
    }
}