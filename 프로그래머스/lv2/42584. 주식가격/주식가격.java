class Solution {
    public int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];

        for (int i = 0; i < n - 1; i++) {
            int currentPrice = prices[i];
            int time = 0;

            for (int j = i + 1; j < n; j++) {
                if (prices[j] >= currentPrice) {
                    time++;
                } else {
                    time++;
                    break;
                }
            }

            answer[i] = time;
        }

        answer[n - 1] = 0;  

        return answer;
    }
}
