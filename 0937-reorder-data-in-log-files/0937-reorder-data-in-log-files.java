class Solution {
    public String[] reorderLogFiles(String[] logs) {
        List<String> digit = new ArrayList<>();
        List<String> letter = new ArrayList<>();

        for(String log : logs) {
            if(log.split(" ")[1].matches("[0-9]+"))
                digit.add(log);
            else
                letter.add(log);
        }
        Collections.sort(letter, (a, b) -> {
            String[] s1 = a.split(" ");
            String[] s2 = b.split(" ");
            
        int compared = Comparator.comparing((String[] arr) -> arr[1])
                                .thenComparing(arr -> arr[2])
                                .thenComparingInt(arr -> arr.length)
                                .thenComparing(arr -> arr[0])
                                .compare(s1, s2);
        return compared;
        });

        letter.addAll(digit);
        return letter.toArray(new String[0]);
    }
}