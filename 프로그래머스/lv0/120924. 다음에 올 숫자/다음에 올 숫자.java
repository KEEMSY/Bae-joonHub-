class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int lastElement = common[common.length - 1];

        if (isArithmeticSequence(common)) {
            int commonDifference = common[1] - common[0];
            answer = lastElement + commonDifference;
        } else {
            int commonRatio = common[1] / common[0];
            answer = lastElement * commonRatio;
        }

        return answer;
    }

    private boolean isArithmeticSequence(int[] sequence) {
        int commonDifference = sequence[1] - sequence[0];
        for (int i = 1; i < sequence.length; i++) {
            if (sequence[i] - sequence[i - 1] != commonDifference) {
                return false;
            }
        }
        return true;
    }
}
