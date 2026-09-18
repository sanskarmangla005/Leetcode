class Solution {
    public String removeOuterParentheses(String s) {
        int count=0;
        String s1="";
        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)=='('){
                if(count>0){
                s1+=s.charAt(i);
                }
                count++;
            }
            
            else{
                count--;
                if(count>0){
                    s1+=s.charAt(i);
                }
            }            
        }
        return s1;
    }
}