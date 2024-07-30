public class diagonalSumOn {
    public static void main(String[] args) {
            int matrix[][]={{1,1,1,1}, { 1,1,1,1 }, { 1,1,1,1 }};

            int endRow=matrix.length-1;
            int endCol=matrix[0].length-1;
            int diasum=0;
            int col=0;
            int row=0;
            int countInteration=0;
            while (row<=endRow && col<=endCol) {
                
                if(row==col){
                    diasum=diasum+matrix[row][col];
                }
                else if(row+col==endRow){
                    diasum=diasum+matrix[row][col];
                }

                if(col==endCol){
                    col=0;
                    row++;
                }else{
                    col++;
                }
                countInteration++;
            }
            System.out.println("diagonal sum is : "+diasum);
            System.out.println("number of iteration is :"+countInteration);
    }
}
