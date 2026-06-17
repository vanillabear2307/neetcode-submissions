class Solution {
    public int evalRPN(String[] token) {
        Deque<Integer> n=new ArrayDeque();
         int a,b,s;
        for(int i=0;i<token.length;i++){
            if(token[i].equals("+")){
                a=n.pop();
                b=n.pop();
                s=a+b;
                n.push(s);
            }
            else if(token[i].equals("-")){
                a=n.pop();
                b=n.pop();
                s=b-a;
                n.push(s);
            }
            else if(token[i].equals("*")){
                a=n.pop();
                b=n.pop();
                s=a*b;
                n.push(s);
            }
            else if(token[i].equals("/")){
                a=n.pop();
                b=n.pop();
                s=b/a;
                n.push(s);
            }
            else {
                n.push(Integer.parseInt(token[i]));
            }
        }
        return n.peek();
    }
}
