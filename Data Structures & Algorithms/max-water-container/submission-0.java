class Solution {
    public int maxArea(int[] heights) {
        int low=0;
        int high=heights.length-1;
        int length;
        int width;
        int maxwater=0;
        while(low<high){
            width =high-low;
            length = Math.min(heights[high],heights[low]);
            maxwater= Math.max(length*width,maxwater);
        if (heights[low]<heights[high]){
            low++;
            }
            else{
            high--;
            }
        }
        return maxwater;
    }
}


