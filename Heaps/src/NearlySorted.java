import java.util.PriorityQueue;

public class NearlySorted {
    public void nearlySorted(int[] arr, int k) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue();
        int j = 0;
        for(int i = 0; i<arr.length; i++){
            pq.add(arr[i]);
            if(pq.size()>k) arr[j++] = pq.poll();
        }
        while (!pq.isEmpty()) {
            arr[j++] = pq.poll();
        }
    }
}
