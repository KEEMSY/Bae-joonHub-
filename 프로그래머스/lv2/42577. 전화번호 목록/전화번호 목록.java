import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true; 
        Set<String> prefixes = new HashSet<>();
        
        for (String phoneNumber : phone_book) {
            prefixes.add(phoneNumber);
        }
        
        for (String phoneNumber : phone_book) {
            for (int i = 1; i < phoneNumber.length(); i++) {
                String prefix = phoneNumber.substring(0, i);
                if (prefixes.contains(prefix)) {
                    return false;
                }
            }
        }
        return answer;
    }
}