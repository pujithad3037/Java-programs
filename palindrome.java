class palindrome
 {
    public static void main(String[] args)
     {
   String s = "babad";
        String longest = "";
        for (int i = 0; i < s.length(); i++)
         {
            for (int j = i + 1; j <= s.length(); j++) 
            {
                String sub = s.substring(i, j);

                if (isPalindrome(sub) && sub.length() > longest.length())
                 {
                    longest = sub;
                }
            }
        }
        System.out.println("Longest Palindrome: " + longest);
    }
    static boolean isPalindrome(String str) 
    {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--)
         {
            rev = rev + str.charAt(i);
        }
        return str.equals(rev);
    }
}