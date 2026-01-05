class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long totalsum =0;
        long negativecount =0;
        long minAbsNum= Integer.MAX_VALUE;
        for(int[] row : matrix ){
            for(int num : row){ //row
                totalsum+=Math.abs(num);
                minAbsNum=Math.min(minAbsNum,Math.abs(num));
                if(num<0){
                    negativecount++;
                }

            }
        }
        if(negativecount % 2==0){
            return totalsum;

        }
        return totalsum -2*minAbsNum;      
    }
}