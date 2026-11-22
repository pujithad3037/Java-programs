class aexceptionn
{
    public static void main(String[] args)
    {
        try
        {
            int result=10/0;
            System.out.println("Result: "+result);
        }
        catch(Arithemeticexception e)
        {
            System.out.println("Arithemeticexception occured:"+e.getMessage());
            
        }
    }
}