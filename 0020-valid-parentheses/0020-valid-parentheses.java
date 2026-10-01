class Solution {
    public boolean isValid(String s) {
        int n =s.length();
        if(n<2) return false;
        Deque<Character>st=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            if(st.isEmpty()&&(s.charAt(i)==')'||s.charAt(i)=='}'||s.charAt(i)==']')){
                return false;
            }
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i)==')' && st.peek()!='('){
                return false;
            }
            else if(s.charAt(i)==']' && st.peek()!='['){
                return false;
            }
            else if(s.charAt(i)=='}' && st.peek()!='{'){
                return false;
            }
            else st.pop();
             
        }
        return st.isEmpty();
    }
}