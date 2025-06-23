class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> c= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            Integer ci=c.get(nums[i]);
            if(ci !=null){
                return new int[]{i, ci};
            }
            c.put(target - nums[i],i);
        }
        return null;
    }
}