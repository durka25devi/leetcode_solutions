class Solution {
    public int findKthLargest(int[] nums, int k) {

        Arrays.sort(nums);

       int ans=nums[(nums.length-1)-k+1];

       return ans;
        
    }
}