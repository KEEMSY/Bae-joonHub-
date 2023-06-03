class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        for (String word : babbling) {
            word = word.replaceAll("aya|woo|ye|ma", "");
            if (word.isEmpty()) {
                answer++;
            }
        }

        return answer;
    }
}
