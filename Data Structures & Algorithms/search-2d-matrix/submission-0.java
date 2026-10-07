class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;
        for(int i=0;i<r;i++){
            if(matrix[i][0]<= target && target<=matrix[i][c-1]){
            int left = 0;
            int right = c-1;

            while(left<=right){
            int mid = (left+right)/2;
            if(matrix[i][mid]==target){
                return true;
            }else if(matrix[i][mid]<target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }

            }
        }
        return false;
    }
}
