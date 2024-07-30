public class diagonalSum {

    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int total_number_of_rows = mat.length;
        int total_number_of_cols = mat[0].length;

        for (int row = 0; row < total_number_of_rows; row++) {
            for (int col = 0; col < total_number_of_cols; col++) {
                if (row == col) {
                    sum = sum + mat[row][col];
                }
                else if(row+col==mat.length-1){
                    sum=sum+mat[row][col];
                }
            }
        }
        return sum;
        // int startCol = total_number_of_cols - 1;
        // int startRow = 0;
        // for (int row = startRow; row < total_number_of_rows; row++) {

        //     if (row != startCol) {
        //         sum2 = sum2 + mat[row][startCol];
        //     }
        //     startCol--;
        // }
        // int diagonalsum = 0;
        // diagonalsum = sum + sum2;
        
    }

    public static void main(String[] args) {
        int mat[][] = { { 1,1,1,1 }, { 1,1,1,1 }, {1,1,1,1 } };
        System.out.println(diagonalSum(mat));

    }
}
