import java.util.LinkedList;
import java.util.Queue;

public class WinnerOfTheCircularGame {
    public static int findTheWinner(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i<=n; i++){
            q.add(i);
        }
//        int x;
//        while(q.size()!=1){
//            x = k;
//            while(x>=0){
//                x--;
//                if(x==0){
//                    q.poll();
//                    break;
//                }
//                q.add(q.remove());
//            }
//        }
        while(q.size()>1){
            for(int i = 1; i<=(k-1); i++) q.add(q.remove());
            q.poll();
        }
        return q.peek();
    }
    public static void main(String[] args) {
        System.out.println(findTheWinner(6,5));
    }
}
