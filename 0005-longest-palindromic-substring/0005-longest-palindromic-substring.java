class Solution {
    int left, len;
    private void sol(String s, int l, int r) {
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        if(len < r - l - 1) {
            left = l + 1;
            len = r - l - 1;
        }
    }
    public String longestPalindrome(String s) {
        if(s.length() == 1) return s;
        for(int i = 0; i < s.length() - 1; i++) {
            sol(s, i, i + 1);
            sol(s, i, i + 2);
        }
        return s.substring(left, left + len);
    }
}