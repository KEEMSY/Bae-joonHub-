import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int totalToday = getTotalDays(today);
        
        HashMap<String, Integer> termsMap = createTermsMap(terms);
        ArrayList<Integer> answerList = findPrivacyExceeded(totalToday, privacies, termsMap);
        
        return convertToArray(answerList);
    }
    
    private int getTotalDays(String today) {
        String[] todaySplit = today.split("\\.");
        int year = Integer.parseInt(todaySplit[0]);
        int month = Integer.parseInt(todaySplit[1]);
        int day = Integer.parseInt(todaySplit[2]);
        
        return year * 12 * 28 + month * 28 + day;
    }
    
    private HashMap<String, Integer> createTermsMap(String[] terms) {
        HashMap<String, Integer> termsMap = new HashMap<>();
        
        for (String term : terms) {
            String[] termSplit = term.split(" ");
            String termKey = termSplit[0];
            int termValue = Integer.parseInt(termSplit[1]) * 28;
            
            termsMap.put(termKey, termValue);
        }
        
        return termsMap;
    }
    
    private ArrayList<Integer> findPrivacyExceeded(int totalToday, String[] privacies, HashMap<String, Integer> termsMap) {
        ArrayList<Integer> answerList = new ArrayList<>();
        
        for (int i = 0; i < privacies.length; i++) {
            String[] privacy = privacies[i].split(" ");
            String privacyKey = privacy[0];
            int tempTotalDays = getTotalDays(privacyKey);
            tempTotalDays += termsMap.get(privacy[1]);
            
            if (tempTotalDays <= totalToday) {
                answerList.add(i + 1);
            }
        }
        
        return answerList;
    }
    
    private int[] convertToArray(ArrayList<Integer> answerList) {
        int[] answer = new int[answerList.size()];
        
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}
