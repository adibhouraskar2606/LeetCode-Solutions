class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        if(matrix == null || matrix.length == 0){
            return true;
        }
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                if(!check(matrix,i,j)){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean check(int [][] matrix, int i, int j){
        int number = matrix[i][j];
        while(i<matrix.length && j<matrix[0].length){
            if(matrix[i][j] != number){
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
}