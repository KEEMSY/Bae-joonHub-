import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer;
        
        int totalToday = getTotalDays(today);
        
        HashMap<String, Integer> termsMap = new HashMap<>();
        for (String term : terms) {
            String[] termSplit = term.split(" ");
            termsMap.put(termSplit[0], Integer.parseInt(termSplit[1]) * 28);
        }
        
        List<Integer> answerList = new ArrayList<>();
        for (int i = 0; i < privacies.length; i++) {
            String[] privacy = privacies[i].split(" ");
            int tempTotalDays = getTotalDays(privacy[0]);
            tempTotalDays += termsMap.get(privacy[1]);
            
            if (tempTotalDays <= totalToday) {
                answerList.add(i + 1);
            }
        }
        
        answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
    
    private int getTotalDays(String today) {
        int totalDays = 0;
        
        String[] todaySplit = today.split("\\.");
        totalDays += Integer.parseInt(todaySplit[0]) * 12 * 28;
        totalDays += Integer.parseInt(todaySplit[1]) * 28;
        totalDays += Integer.parseInt(todaySplit[2]);
        
        return totalDays;
    }
}
