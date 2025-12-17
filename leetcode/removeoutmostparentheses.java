class Solution {
    public String removeOuterParentheses(String s) {

        StringBuilder result = new StringBuilder();
        int balance = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (balance > 0) {
                    result.append(c);
                }
                balance++;
            } else { // c == ')'
                balance--;
                if (balance > 0) {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "(()())(())";
        System.out.println(sol.removeOuterParentheses(s)); 
    }
}

