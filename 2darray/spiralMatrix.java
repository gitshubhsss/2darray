public class spiralMatrix {
    public static void main(String[] args) {
        int matrix[][] = { { 1,2,3,4 }, { 5,6,7,8 }, {9,10,11,12 }};

        int total_number_of_rows=matrix.length;
        int total_number_of_cols=matrix[0].length;

        int n=matrix.length;
        int startRow=0;
        int endRow=total_number_of_rows-1;
        int startCol=0;
        int endCol=total_number_of_cols-1;
        while (startRow<=endRow && startCol<=endCol) {
            //top
            for(int i=startCol;i<=endCol;i++){
                System.out.print(matrix[startRow][i]+" ");
            }

            //right
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }

            //bottom

            for(int i=endCol-1;i>=startCol;i--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrix[endRow][i]+" ");
            }

            //left

            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol==endCol){
                    break;
                }
                    System.out.print(matrix[i][startCol]+" ");
                
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }   
    }
}
