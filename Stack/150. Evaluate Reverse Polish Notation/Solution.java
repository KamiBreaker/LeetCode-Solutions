class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String token : tokens)
        {
            if(token.equals("+"))
            {
                int op1 = stack.pop();
                int op2 = stack.pop();
                stack.push(op1+op2);
            }
            else  if(token.equals("-"))
            {
                int op1 = stack.pop();
                int op2 = stack.pop();
                stack.push(op2-op1);
            }
            else if(token.equals("/"))
            {
                int op1 = stack.pop();
                int op2 = stack.pop();
                stack.push(op2/op1);
            }
            else if(token.equals("*"))
            {
                int op1 = stack.pop();
                int op2 = stack.pop();
                stack.push(op2*op1);
            }
           else
           {
            stack.push(Integer.parseInt(token)); /* this is something i picked up from geminin*/
           }
        }
        return stack.pop();
        
    }
}