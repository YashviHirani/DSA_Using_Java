import java.util.PriorityQueue;

class KClosestInASortedArray {
    class Pair{
        int num;
        int diff;
        Pair(int num,int diff){
            this.num = num;
            this.diff = diff;
        }
    }
    int[] printKClosest(int[] arr, int k, int x) {
        // code here
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b)-> a.diff != b.diff ? b.diff - a.diff : a.num - b.num); // used lambda func here
        int size;
        int diff1 = 0;
        for(int i : arr){
            size = pq.size();
            diff1 = Math.abs(i-x);
            if(size>=k){
                if(!pq.isEmpty() && pq.peek().diff>=diff1 && diff1!=0) {
                    pq.poll();
                    pq.add(new Pair(i, diff1));
                }
            }
            else{
                pq.add(new Pair(i,diff1));
            }
        }
        int [] ans = new int[k];
        while(!pq.isEmpty()){
            ans[--k] = pq.poll().num;
        }
        return ans;
    }
}
