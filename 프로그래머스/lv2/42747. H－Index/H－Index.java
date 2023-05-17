import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations); 
        int n = citations.length; 
        
        for (int i = n - 1; i >= 0; i--) {
            int h = n - i; 

            if (citations[i] >= h && (i == 0 || citations[i - 1] <= h)) {
                return h; 
            }
        }

        return 0;  
    }
}
