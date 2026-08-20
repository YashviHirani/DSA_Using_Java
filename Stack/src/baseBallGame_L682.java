import java.util.Stack;

public class baseBallGame_L682 {
    public int calPoints(String[] operations) {

        Stack<Integer> st1 = new Stack<>();
        int temp1 = 0;
        int temp2 = 0;

        for(String s : operations){

            switch (s) {
                case "C" -> st1.pop();
                case "D" -> st1.push(st1.peek() * 2);
                case "+" -> {
                    temp1 = st1.pop();
                    temp2 = st1.peek();
                    st1.push(temp1);
                    st1.push(temp1 + temp2);
                }
                default -> st1.push(Integer.parseInt(s));
            }
        }
        temp1 = 0;
        while (!st1.isEmpty()){
            temp1+=st1.pop();
        }
        return temp1;
    }

    public static void main(String[] args) {

    }
}
