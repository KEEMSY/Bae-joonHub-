import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        int index = 0;
        while (index < progresses.length) {
            int days = (int) Math.ceil((100 - progresses[index]) / (double) speeds[index]);
            int count = 0;
            for (int i = index; i < progresses.length; i++) {
                if (progresses[i] + speeds[i] * days >= 100) {
                    count++;
                    index++;
                } else {
                    break;
                }
            }
            answer.add(count);
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
