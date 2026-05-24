class Solution {
    public boolean isPalindrome(String s) {
    int n = s.length(); 
    StringBuilder candidate = new StringBuilder();
        for (int i = 0; i < n; i++){
            if (Character.isLetterOrDigit(s.charAt(i)))
                candidate.append(Character.toLowerCase(s.charAt(i)));
        }

int m = candidate.length();
for (int i = 0; i < m / 2; i++) {
    if (candidate.charAt(i) != candidate.charAt(m - i - 1))
        return false;
}
    return true; 
    }
}
