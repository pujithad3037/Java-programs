class rotate
{
    public static void main(String[] args)
    {
        String s1="abcd";
        String s2="dabc";
        if(s1.length()==s2.length() && (s1+s1).contains(s2))
        {
            System.out.println("yes");
        }
        else
        {
             System.out.println("no");
        }
    }
}