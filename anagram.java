import java.util.Arrays;
class anagram
{
    public static void main(String[] args)
    {
        String str="cbaebabacd";
        String pattern="abc";
        int m=pattern.length();
        char p[]=pattern.toCharArray();
        Arrays.sort(p);
        for(int i=0;i<=str.length()-m;i++)
        {
            String sub=str.substring(i,i+m);
            char s[]=sub.toCharArray();
            Arrays.sort(s);
            if(Arrays.equals(p,s))
            {
                System.out.println(i);
            }
        }
    }
}