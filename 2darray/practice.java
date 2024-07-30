public class practice{
    public static void main(String[] args) {
       

         // Variables for the first division
         double num1 = 5;
         double num2 = 2;
         double result = num1 / num2;
         // Print result with one decimal place
         System.out.printf("%.1f%n", result); // Output: 2.5
         
         // Variables for the second division
         double num3 = 7;
         double num4 = 4;
         double result2 = num3 / num4;
 
         // Determine if the result should be rounded up
         double finalResult2;
         if (result2 % 1 >= 0.5) {
             // Round up
             finalResult2 = Math.ceil(result2);
         } else {
             // Print with one decimal place
             finalResult2 = Math.floor(result2 * 10) / 10;
         }
 
         // Print the final result with one decimal place
         System.out.printf("%.1f%n", finalResult2); // Output: 2.0

    }
}