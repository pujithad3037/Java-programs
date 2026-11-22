class multicatch
{
    public static void main(String[] args)
    {
        try{
            int result=10/0;
            System.out.println("Result: " + result);
        } catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occured: " + e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException occured: "+e.getMessage());
        }
        catch(NullPointerException e)
        {
            System.out.println("NullPointerException occured: "+e.getMessage());
        } catch(Exception e)
        {
            System.out.println("Exception occured: "+e.getMessage());
        }
    }
}