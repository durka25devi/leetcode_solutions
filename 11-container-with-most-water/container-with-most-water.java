class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max=0;
        
        while(left<right){
            int height_ , width;
            width=right-left;
            height_= Math.min(height[left],height[right]);
            if((width*height_)>max) max=width*height_;
            if(height[left]<height[right]) left++;
            else right--;


        }
        return max;

        
    }
}