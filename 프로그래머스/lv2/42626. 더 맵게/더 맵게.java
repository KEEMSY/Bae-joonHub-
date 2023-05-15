import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int scov : scoville) {
            minHeap.add(scov);
        }

        while (minHeap.peek() < K) {
            if (minHeap.size() == 1) {
                return -1;
            }

            int check = minHeap.poll() + minHeap.poll() * 2;

            answer++;
            minHeap.add(check);
        }
        return answer;
    }
}
