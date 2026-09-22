class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        int count = 1; int maxCount = 0;
        if(nums.length==0) return 0;
        for(int i=1;i<nums.length;i++){
            // set.insert(nums[i]);

            if(nums[i]-1 == nums[i-1]){
                count++;
            }else if(nums[i] == nums[i-1]){
                continue;
            }else{
                maxCount = Math.max(count,maxCount);
                                count = 1;  // important

            }
        }
        return Math.max(count, maxCount);
        
    }
}
