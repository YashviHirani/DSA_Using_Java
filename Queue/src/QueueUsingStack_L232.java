import java.util.Stack;

class MyQueue {

    static Stack<Integer> st1 = new Stack<>();
    static Stack<Integer> helperStack = new Stack<>();
    static int size;

    public MyQueue() {

    }

    public static void push(int x) {
        st1.push(x);
        size++;
    }

    public static int pop() {
        if(st1.empty()) return -1;
        while(st1.size()>1) helperStack.push(st1.pop());
        int remove = st1.pop();
        while (!helperStack.isEmpty()) st1.push(helperStack.pop());
        size--;
        return remove;
    }

    public static int peek() {
        if(st1.empty()) return -1;
        while(st1.size()>1) helperStack.push(st1.pop());
        int remove = st1.peek();
        while (!helperStack.isEmpty()) st1.push(helperStack.pop());
        return remove;
    }

    public static boolean empty() {
        return size == 0;
    }

    public static void main(String[] args) {
       push(10);
       push(20);
        System.out.println(peek());
        System.out.println(pop());
        System.out.println(empty());
    }
}
