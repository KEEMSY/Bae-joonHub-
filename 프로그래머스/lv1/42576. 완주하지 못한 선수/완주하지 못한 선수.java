import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hs = new HashMap<String, Integer>();
        
        for(String person: participant) {
            hs.put(person, hs.getOrDefault(person, 0) + 1);
        }
        
        for(String person: completion) {
            hs.put(person, hs.get(person) - 1);
        }
        
        for(Map.Entry<String, Integer> entrySet: hs.entrySet()) {
            if (entrySet.getValue() != 0) answer = entrySet.getKey();
        }
        
        return answer;
    }
}
