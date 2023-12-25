class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> answer = new HashMap<>();
        for(String str : strs) {
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String s = String.valueOf(c);

            if(!answer.containsKey(s)) {
                answer.put(s, new ArrayList<>());
                answer.get(s).add(str);
            }
            else answer.get(s).add(str);
        }
        return new ArrayList<>(answer.values());
    }
}