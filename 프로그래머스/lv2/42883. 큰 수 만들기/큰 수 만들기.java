import java.util.Stack;

class Solution {
    public String solution(String number, int k) {
        Stack<Character> stack = new Stack<>();

        for (char digit : number.toCharArray()) {
            while (!stack.isEmpty() && stack.peek() < digit && k > 0) {
                stack.pop();
                k--;
            }
            stack.push(digit);
        }

        while (k > 0) {
            stack.pop();
            k--;
        }

        StringBuilder largestNumber = new StringBuilder();
        for (char digit : stack) {
            largestNumber.append(digit);
        }

        return largestNumber.toString();
    }
}
