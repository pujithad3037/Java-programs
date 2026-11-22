import java.util.*;
class STACK_OPE
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter prefix expression (space separated)");
        String expr=sc.nextLine();
        String[] tokens=expr.split(" ");
        Stack<Integer>stack=new Stack<>();
        for(String token:tokens)
        {
            if(token.matches("\\d+"))
            {
                stack.push(Integer.parseInt(token));
            }
            else{
                int b=stack.pop();
                int a=stack.pop();
                switch(token)
                {
                    case "+": stack.push(a+b); break;
                    case "-": stack.push(a-b); break;
                    case "*": stack.push(a*b); break;
                    case "/" : stack.push(a/b); break;
                }
            }
        }
        System.out.println("result:"+stack.pop());
    }
}