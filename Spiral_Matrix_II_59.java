class Solution {
    public int[][] generateMatrix(int n) {
        int [][] finalMatrix = new int[n][n];
        int minCol = 0,minRow = 0, maxCol = n-1, maxRow = n-1, value=1;
        while(value<=n*n){
            for(int i = minRow; i<=maxRow; i++){
                finalMatrix[minRow][i] = value;
                System.out.println("minRow " +minRow+" i : "+i);
                value++;
            }
            for(int i = minCol+1; i<=maxCol; i++){
                finalMatrix[i][maxCol] = value;
                System.out.println("maxCol " +maxCol+" i : "+i);
                value++;
            }
            for(int i = maxRow-1; i>=minRow; i--){
                finalMatrix[maxRow][i] = value;
                System.out.println("maxRow " +maxRow+" i : "+i);
                value++;
            }
            for(int i = maxCol-1; i>=minCol+1; i--){
                finalMatrix[i][minCol] = value;
                System.out.println("minCol " +minCol+" i : "+i);
                value++;
            }
            minCol++;
            minRow++;
            maxCol--;
            maxRow--;
        }
        return finalMatrix;
    }
}