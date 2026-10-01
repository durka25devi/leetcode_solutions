class Solution {
    static int merge(int[] nums,int low,int mid,int high,int count){

        int j=mid+1;
        for(int i=low;i<=mid;i++){
            while(j<=high && nums[i]>(long)2*nums[j]){
                j++;
                
            }
            count+=j-(mid+1);
        }
        ArrayList<Integer> temp=new ArrayList();
        int left=low;
        int right=mid+1;

        while(left<=mid && right<=high){
            if(nums[left]<=nums[right]){
                temp.add(nums[left]);
                left++;

            }
            else{
                temp.add(nums[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(nums[left++]);
        }
        while(right<=high){
            temp.add(nums[right++]);
        }

        for(int i=low;i<=high;i++){
            nums[i]=temp.get(i-low);
        }

        return count;

    }

    static int mergesort(int[] nums, int low, int high, int count){

        if(low>=high) return count;
        int mid=low+(high-low)/2;

        count=mergesort(nums,low,mid,count);
        count=mergesort(nums,mid+1,high,count);
        count=merge(nums,low,mid,high,count);

        return count;

    }

    public int reversePairs(int[] nums) {
       return mergesort(nums,0,nums.length-1,0);
        
        
        
    }
    
}