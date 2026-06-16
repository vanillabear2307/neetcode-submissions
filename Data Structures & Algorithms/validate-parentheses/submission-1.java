class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack=new ArrayDeque<>();
        char[] para=s.toCharArray();
        for(int i=0;i<para.length;i++){
            if(para[i]=='('||para[i]=='['||para[i]=='{')
            stack.push(para[i]);
            else{
            if (stack.isEmpty()) {
            return false;
            }
            char top=stack.pop();
            if (para[i] == ')' && top != '(') return false;
            if (para[i] == ']' && top != '[') return false;
            if (para[i] == '}' && top != '{') return false;
        }
        }
        return stack.isEmpty();
    }
}
