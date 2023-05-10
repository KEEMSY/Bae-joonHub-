import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        List<Integer> answerList = new ArrayList<Integer>();
        
        for (int num : arr) {
            if (answerList.isEmpty() || answerList.get(answerList.size() - 1) != num) {
                answerList.add(num);
            }
        }

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}
