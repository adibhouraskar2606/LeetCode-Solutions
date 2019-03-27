class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for(int i = 0; i<A.length; i++){
            int [] temp = new int[A[0].length];
            int index = 0;
            for(int j = A[0].length-1; j>=0; j--){
                temp[index] = A[i][j];
                index++;
            }
            A[i] = temp;
        }
        for(int i = 0; i<A.length; i++){
            for(int j = 0; j<A[0].length; j++){
                if(A[i][j] == 0){
                    A[i][j] = 1;
                }else{
                    A[i][j] = 0;
                }
            }
        }
        return A;
    }
}