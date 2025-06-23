class Solution {
  public int search(int[] nums, int target) {
    int lb=0;
    int ub=nums.length-1;
    while(lb<=ub){
        int mid= (lb+ ub)/2;
        if(nums[mid]==target){
            return mid;
        }
        if(nums[lb]<=nums[mid]){
            if(nums[lb]<=target && target<nums[mid]){
                ub = mid-1;
            }else{
                lb = mid+1;
            }
        }else{
                if(nums[mid]<target && target<=nums[ub]){
                    lb = mid+1;
                }else{
                    ub = mid - 1;
                }
            }
        }
        return -1;
    }
}