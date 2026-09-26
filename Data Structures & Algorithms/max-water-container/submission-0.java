class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int l = 0 , r = n-1;
        int maxSoFar = Integer.MIN_VALUE;
        while(l<r){
            int length = Math.min(height[l],height[r]);
            int width = r-l;
            int area = length*width;
            maxSoFar = Math.max(maxSoFar, area);
            if(height[l]<=height[r]) l++;
            else r--;
        }
        return maxSoFar;
    }
}
