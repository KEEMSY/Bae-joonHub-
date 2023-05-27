import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> clothesCount = new HashMap<>();

        for (String[] cloth : clothes) {
            String type = cloth[1];
            clothesCount.put(type, clothesCount.getOrDefault(type, 0) + 1);
        }

        int combinations = 1;
        for (int count : clothesCount.values()) {
            combinations *= (count + 1);
        }

        return combinations - 1;
    }
}
