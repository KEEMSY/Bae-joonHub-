class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int w = (brown + yellow) / 3;
		int h = 3; 
		
		while(w >= h) {
			if(w*h == brown + yellow && 2*(w + h) == (brown + 4)) {
				answer[0] = w;
				answer[1] = h;
				break;
			}
			h++;
			w = (brown + yellow) / h;
		}
        
        return answer;
    }
}