public class transpose {
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{4,5,6,4}};

        int total_number_of_rows=matrix.length;
        int total_number_of_cols=matrix[0].length;

        int transpose[][]=new int[total_number_of_cols][total_number_of_rows];

        for(int row=0;row<total_number_of_rows;row++){
            for(int col=0;col<total_number_of_cols;col++){
                transpose[col][row]=matrix[row][col];
            }
        }

        for(int row=0;row<total_number_of_cols;row++){
            for(int col=0;col<total_number_of_rows;col++){
                System.out.print(transpose[row][col]+" ");
            }
            System.out.println();
        }
    }
}
