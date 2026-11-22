class prefix
{
    public static void main(String[] args)
    {
        String arr[]={"flower","flow","floor","flight"};
        String prefix=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            while(arr[i].indexOf(prefix) != 0)
            {
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
        System.out.println("longest common prefix: "+prefix);
    }
}