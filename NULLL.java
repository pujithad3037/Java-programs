class NULLL
{
    public static void main(String[] args)
    {
        try{
        String str=null;
        System.out.println("Length of string: " + str.length());
    } catch(NullPointerException e)
    {
        System.out.println("NullPointerException occured: "+e.getMessage());
    }

    }
}