public class sum {
    public static double findsumSortedArrays(int[] nums1, int[] nums2) {

        int mergedMatrix[] = new int[nums1.length + nums2.length];

        // now insertign the first array in merged sort

        for (int i = 0; i < nums1.length; i++) {
            mergedMatrix[i] = nums1[i];
        }

        // now inserting the second nums in merged matrix

        for (int i = 0; i < nums2.length; i++) {
            mergedMatrix[nums1.length + i] = nums2[i];
        }

        // now will sort the matrix array
        int n = mergedMatrix.length;

        // sorting the merge matix

        int i = 0;
        while (i < mergedMatrix.length) {
            // consider the 1 element and minimum element
            int minIndex = i;

            for (int j = i + 1; j < mergedMatrix.length; j++) {
                if (mergedMatrix[minIndex] > mergedMatrix[j]) {
                    minIndex = j;
                }
            }
            int temp = mergedMatrix[minIndex];
            mergedMatrix[minIndex] = mergedMatrix[i];
            mergedMatrix[i] = temp;
            i++;
        }

        // code to print the return the median of the two arrays
        double sum = 0;
        int start = 0;
        int end = n;
        double count_of_middleelemnts = 0;
        while (start < end) {
            if (n > 2 && n % 2 == 0) {
                int startIndex=end/2-1;
                for (int j = startIndex; j <=end/2; j++) {
                    sum = sum + mergedMatrix[j];
                    System.out.println("inside the loop"+mergedMatrix[j]);
                    count_of_middleelemnts++;
                }
                break;
            } else if (n > 2 && n % 2 == 1) {
                int index = n / 2;
                return mergedMatrix[index];
            } else {
                sum = sum + mergedMatrix[start];
                count_of_middleelemnts++;
            }
            start++;
        }
        double meadean = 0;
        System.out.println("sum : "+sum);
        System.out.println("cout_of_middleelements : "+count_of_middleelemnts);
        meadean = sum / count_of_middleelemnts;
        return meadean;

        // int integerPart = (int) meadean;
        // double fractionalPart = meadean - integerPart;

        // If fractional part is greater than 0.5, round up to the next whole number
        // if (fractionalPart > 0.5) {
        //     return Math.ceil(meadean);
        // } else {
        //     // Otherwise, round up to the nearest 0.5 if fractional part > 0
        //     if (fractionalPart > 0 && fractionalPart<0.5) {
        //         return Math.floor(meadean );
        //     } else if(fractionalPart==0.5){
        //         return meadean;
        //     }
        //     else
        //     {
        //         return meadean;
        //     }
            
        // }

    }

    public static void main(String[] args) {
        int[] nums1 = { 1,2,3};
        int[] nums2 = { 2,4};

        System.out.println(findsumSortedArrays(nums1, nums2));
        ;
    }
}
