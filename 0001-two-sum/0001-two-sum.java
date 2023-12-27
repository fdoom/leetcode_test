class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] answer = new int[2];
        int diff;
        for(int i = 0; i < nums.length; i++) {
            diff = target - nums[i];
            if(map.containsKey(diff)) {
                answer[0] = map.get(diff);
                answer[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return answer;
    }
}