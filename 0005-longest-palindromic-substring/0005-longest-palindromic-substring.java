class Solution {
    public String longestPalindrome(String s) {
        int max = 0;
        String answer = "";
        for(int i = 0; i < s.length(); i++) {
            char start = s.charAt(i);
            for(int j = i + 1; j <= s.length(); j++) {
                if(start != s.charAt(j - 1) || max >= j - i) continue;
                String temp = s.substring(i, j);
                StringBuilder sb = new StringBuilder(temp);
                if(temp.equals(sb.reverse().toString())) {
                    max = temp.length();
                    answer = temp;
                }
            }
        }
        return answer;
    }
}