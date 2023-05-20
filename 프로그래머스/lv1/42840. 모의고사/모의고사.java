import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        int[] scores = new int[3];
        int blister1 = 0, blister2 = 0, blister3 = 0;
        int[] blisterPattern1 = {1, 2, 3, 4, 5};
        int[] blisterPattern2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] blisterPattern3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == blisterPattern1[blister1]) {
                scores[0]++;
            }
            if (answers[i] == blisterPattern2[blister2]) {
                scores[1]++;
            }
            if (answers[i] == blisterPattern3[blister3]) {
                scores[2]++;
            }
            
            blister1 = (blister1 + 1) % blisterPattern1.length;
            blister2 = (blister2 + 1) % blisterPattern2.length;
            blister3 = (blister3 + 1) % blisterPattern3.length;
        }
        
        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));
        
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxScore) {
                result.add(i + 1); 
            }
        }
        
        int[] finalResult = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            finalResult[i] = result.get(i);
        }
        
        return finalResult;
    }
}
