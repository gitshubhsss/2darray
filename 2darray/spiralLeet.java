import java.util.ArrayList;
import java.util.List;

public class spiralLeet {

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int total_number_of_rows = matrix.length;
        int total_number_of_cols = matrix[0].length;

        int n = matrix.length;
        int startRow = 0;
        int endRow = total_number_of_rows - 1;
        int startCol = 0;
        int endCol = total_number_of_cols - 1;
        while (startRow <= endRow && startCol <= endCol) {
            // printing startrow 1 2 3 4
            for (int i = startCol; i <= endCol; i++) {
                result.add(matrix[startRow][i]);
                // System.out.print(matrix[startRow][i]+" ");
            }

            // print 8 12 16 which means end row
            for (int i = startRow + 1; i <= endRow; i++) {
                result.add(matrix[i][endCol]);
                // System.out.print(matrix[i][endCol]+" ");
            }

            // print the end row 13,14,15

            for (int i = endCol - 1; i >= startCol; i--) {
                result.add(matrix[endRow][i]);
                // System.out.print(matrix[endRow][i]+" ");
            }

            // now print start col with decreasing row

            for (int i = endRow - 1; i > startRow; i--) {
                result.add(matrix[i][startCol]);
                // System.out.print(matrix[i][startCol]+" ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return result;
    }

    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(spiralOrder(matrix));;
    }
}
