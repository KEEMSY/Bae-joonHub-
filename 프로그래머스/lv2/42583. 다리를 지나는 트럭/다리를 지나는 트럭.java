import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int currentWeight = 0;
        Queue<Integer> bridge = new LinkedList<>();
        Queue<Integer> truckQueue = new LinkedList<>();

        for (int truckWeight : truck_weights) {
            truckQueue.offer(truckWeight);
        }

        for (int i = 0; i < bridge_length; i++) {
            bridge.offer(0);
        }

        while (!truckQueue.isEmpty()) {
            int currentTruck = truckQueue.peek();

            if (currentWeight + currentTruck - bridge.peek() <= weight) {
                currentWeight += currentTruck - bridge.poll();
                bridge.offer(truckQueue.poll());
            } else {
                currentWeight -= bridge.poll();
                bridge.offer(0);
            }

            answer++;
        }

        answer += bridge_length;

        return answer;
    }
}
