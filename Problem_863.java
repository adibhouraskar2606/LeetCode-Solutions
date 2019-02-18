class Solution {
    public int[][] transpose(int[][] A) {
        System.out.println(A.length);
        System.out.println(A[0].length);
        int [][] transpose = new int[A[0].length][A.length];
        for(int i = 0; i<A[0].length; i++){
            for (int j = 0; j<A.length; j++){
                System.out.println(A[j][i]);
                transpose[i][j] = A[j][i];
            }
        }
        return transpose;
    }
}