class Solution {
    public int calPoints(String[] ops) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i=0;i<ops.length;i++){
        if(ops[i].equals("+")){
        int one=stack.pop();
        int newtop=one+stack.peek();
        stack.push(one);
        stack.push(newtop);
        }
        else if(ops[i].equals("D")){
            stack.push(stack.peek()*2);
        }
        else if(ops[i].equals("C")){
            stack.pop();
        }
        else{
            stack.push(Integer.parseInt(ops[i]));        
            }
        }
        int total=0;
        for(int nums: stack){
            total+=nums;
        }
        return total;
    }
}