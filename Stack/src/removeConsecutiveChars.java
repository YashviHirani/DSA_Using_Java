import java.util.Stack;

public class removeConsecutiveChars {
    public String removeConsecutiveCharacter(String s) {

        if (s.isEmpty()) return "";
        int size = s.length();
        Stack<Character> st1 = new Stack<>();
        StringBuilder ans = new StringBuilder();
        char curr =  s.charAt(0);
        st1.push(curr);
        ans.append(curr);
        int peek;
        for(int i = 1; i<size; i++){
            peek = st1.peek();
            curr = s.charAt(i);
            if(curr!=peek){
                st1.push(curr);
                ans.append(curr);
            }
        }
        return ans.toString();
    }
}
