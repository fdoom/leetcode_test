class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase().replaceAll("[^0-9a-zA-Z]", "");
        boolean check = true;
        for(int i = 0; i < str.length() / 2; i++) {
            if(str.charAt(i) != str.charAt(str.length() - i - 1)) {
                check = false;
                break;
            }
        }
        return check;
    }
}