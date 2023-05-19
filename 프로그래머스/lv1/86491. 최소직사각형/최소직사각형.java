class Solution {
    public int solution(int[][] sizes) {
        int w = 0;
        int h = 0;
        for (int[] size : sizes) {
            int x = Math.max(size[0], size[1]);
            int y = Math.min(size[0], size[1]);
            w = Math.max(w, x);
            h = Math.max(h, y);
        }
        return w * h;
    }
}
