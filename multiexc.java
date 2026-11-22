class multiexc
{
    public static void main(String[] args)
    {
        try
        {
            int arr[]={10,20,30};
            System.out.println(arr[5]);
        } catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("array index is out of bounds.");
        }
        try{
            int num=Integer.parseInt("abc");
            System.out.println("Number: "+num);
        }
        catch(NumberFormatException e)
        {
            System.out.println("Invalid number format.");
        }
        System.out.println("program continue after exception handling.");
    }
}