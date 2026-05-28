class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') stack.push('(');
            if (s.charAt(i) == '[') stack.push('[');
            if (s.charAt(i) == '{') stack.push('{');

            if (s.charAt(i) == ')') {
                if (stack.isEmpty() || stack.pop() != '(') return false;
            }
            if (s.charAt(i) == ']') {
                if (stack.isEmpty() || stack.pop() != '[') return false;
            }
            if (s.charAt(i) == '}') {
                if (stack.isEmpty() || stack.pop() != '{') return false;
            }
        }
        return stack.isEmpty();
    }
}