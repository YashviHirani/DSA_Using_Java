import java.util.Stack;

public class validParentheses_L20 {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        int size = s.length();
        char peek;
        char curr;
        // ){
        for(int i = 0; i<size; i++){
            curr = s.charAt(i);
            if(!stack.isEmpty()){
                peek = stack.peek();
                if((peek=='(' && curr==')') || (peek=='{' && curr=='}') || (peek=='[' && curr==']')) stack.pop();
                else stack.push(curr);
            }
            else {
                if(curr==')' || curr=='}' || curr==']') return false;
                stack.push(curr);
            }
        }
      return stack.isEmpty();
    }
}
