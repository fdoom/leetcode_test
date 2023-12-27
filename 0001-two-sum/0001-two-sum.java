class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] answer = new int[2];
        for(int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i]))
                map.put(nums[i], i);
            
            int diff = target - nums[i];
            if(map.containsKey(diff) && map.get(diff) != i) {
                answer[0] = map.get(diff);
                answer[1] = i;
                break;
            }
        }
        return answer;
    }
}