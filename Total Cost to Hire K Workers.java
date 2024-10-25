import java.util.*;

class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        int len = costs.length;
        Comparator<Integer[]> cmp = (Integer[] A, Integer[] B) -> {
            int diff = A[0] - B[0];
            if (diff != 0) return diff;
            return A[1] - B[1];
        };
        PriorityQueue<Integer[]> heap = new
            PriorityQueue<Integer[]>(cmp);
        

        int doubled = candidates * 2;
        long result = 0;
        if (len <= doubled) {
            for (int i = 0; i < len; i++) {
                Integer[] item = { costs[i], 0 };
                heap.offer(item);
            }
            for (int i = 0; i < k; i++) {
                Integer[] top = heap.poll();
                result += top[0];
            }
        } else {
            for (int i = 0; i < candidates; i++) {
                Integer[] item = { costs[i], 0 };
                heap.offer(item);
            }
            for (int i = len - candidates; i < len; i++) {
                Integer[] item = { costs[i], 1 };
                heap.offer(item);
            }


            int index = 0;
            for (int i = candidates - 1, j = len - candidates;
                i < j && index < k; index++) {
                Integer[] top = heap.poll();
                result += top[0];
                

                if (top[1] == 0) {
                    i++;
                    if (i < j) {
                        Integer[] item = { costs[i], 0 };
                        heap.offer(item);
                    }
                } else {
                    j--;
                    if (i < j) {
                        Integer[] item = { costs[j], 1 };
                        heap.offer(item);
                    }
                }
            }

            int rmg = k - index;
            for (int i = 0; i < rmg; i++) {
                Integer[] top = heap.poll();
                result += top[0];
            }
        }


        return result;
    }
}