import java.net.Inet4Address;
import java.util.*;

public class topKELe {
        class Pair {
            int num;
            int freq;
            Pair(int num, int freq) {
                this.num = num;
                this.freq = freq;
            }
        }

        public ArrayList<Integer> topKFreq(int[] arr, int k) {
            HashMap<Integer, Integer> hm1 = new HashMap<>();
            for (int i : arr) {
                hm1.put(i, hm1.getOrDefault(i, 0) + 1);
            }

            // min-heap: worst element (lowest priority) on top
            // lower freq is worse; on tied freq, smaller num is worse
            PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) ->
                    a.freq != b.freq ? a.freq - b.freq : a.num - b.num
            );

            for (int key : hm1.keySet()) {
                int val = hm1.get(key);
                if (pq.size() < k) {
                    pq.add(new Pair(key, val));
                } else {
                    Pair worst = pq.peek();
                    boolean candidateBeatsWorst =
                            val > worst.freq || (val == worst.freq && key > worst.num);
                    if (candidateBeatsWorst) {
                        pq.poll();
                        pq.add(new Pair(key, val));
                    }
                }
            }

            ArrayList<Integer> al1 = new ArrayList<>();
            while (!pq.isEmpty()) {
                al1.add(pq.poll().num);
            }
            Collections.reverse(al1);
            return al1;
        }
    }