class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder newStr = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                newStr.append(Character.toLowerCase(c));
            }
        }
        char[] c1 = newStr.toString().toCharArray();
            for(int i=0;i<c1.length;i++){
                if(c1[i]!=c1[c1.length-1-i])
                return false;
            }
            return true;
}
}