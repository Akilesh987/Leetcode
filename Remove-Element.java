class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;
        int i=0;int j=0;
        while(j<nums.length){
            if(nums[j]==val){
                j++;
            }else{
                nums[i]=nums[j];
                i++;
                j++;
            }
        }
        return i;
    }
}