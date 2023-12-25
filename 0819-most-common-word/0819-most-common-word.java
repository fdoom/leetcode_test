class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase().replaceAll("[^a-z]", " ");
        Map<String, Integer> hash = new HashMap<>();
        for(String s : paragraph.split(" ")) {
            if(s.isBlank()) continue;
            if(hash.get(s) == null)
                hash.put(s, 1);
            else
                hash.put(s, hash.get(s) + 1);
        }
        for(String ban : banned)
            hash.remove(ban);
        
        String answer = "";
        int max = 0;
        for(String key : hash.keySet()) {
            if(max < hash.get(key)) {
                max = hash.get(key);
                answer = key;
            }
        }
        return answer;
    }
}