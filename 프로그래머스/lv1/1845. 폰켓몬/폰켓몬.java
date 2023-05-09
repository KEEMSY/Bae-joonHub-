import java.util.Arrays;
import java.util.HashSet;

public class Solution {

    public int solution(int[] nums) {
        int n = nums.length / 2;

        int count = (int) Arrays.stream(nums)
                .distinct()
                .count();

        return Math.min(count, n);
    }
}