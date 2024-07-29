import java.util.Scanner;

public class target{
    public static boolean searchMatrix(int[][] matrix, int target) {
        int total_number_of_rows=matrix.length;
        int total_number_of_columns=matrix[0].length;
        int row=0;
        int col=total_number_of_columns-1;
        
        while (row<total_number_of_rows && col>=0) {
            //will start from the last column and 1st row it self
            if(matrix[row][col]==target){
                //if we found the element on 0th row and 3rd col will return true
                return true;
            }
            else if(target<matrix[row][col]){
                //if the element is less than the element which is present on 0th row and 3rd col will decrease the 
                //col by 1;
                col--;
            }
            else{
                //if the element is greater than the current element will increse the row by 1
                row++;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int matrix [][]=new int [3][4];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers");
        int total_number_of_rows=matrix.length;
        int total_number_of_columns=matrix[0].length;

        //accepting the array{}
        int row=0;
        while (row<total_number_of_rows) {
            
            for(int col=0;col<total_number_of_columns;col++){
                matrix[row][col]=sc.nextInt();
            }
            row++;
        }
        int target=3;
        System.out.println(searchMatrix(matrix,target));

    }
}