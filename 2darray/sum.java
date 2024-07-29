public class sum {
    public static double findsumSortedArrays(int[] nums1,int []nums2) {

        int mergedMatrix[]=new int [nums1.length+nums2.length]; 

        //now insertign the first array in merged sort

        for(int i=0;i<nums1.length;i++){
            mergedMatrix[i]=nums1[i];
        }

        //now inserting the second nums in merged matrix

        for(int i=0;i<nums2.length;i++){
            mergedMatrix[nums1.length+i]=nums2[i];
        }

        //now will sort the matrix array
        int n=mergedMatrix.length;

        for(int i=0;i<n;i++){
            int maxIndex=i;

            for(int j=i+1;j<n;j++){
                if(mergedMatrix[maxIndex]>mergedMatrix[j]){
                    maxIndex=j;
                }
            }
        }
        // int n=nums.length;
        // int sum=0;
        // int start=0;
        // int end=n;
        // int count_of_middleelemnts=0;
        // while (start<end) {
        //     if(n>2){
        //         for(int i=1;i<=end-2;i++){
        //             sum=sum+nums[i];
        //             System.out.println("inside the loop");
        //             count_of_middleelemnts++;
        //         }
        //         break;
        //     }else{
        //         sum=sum+nums[start]; 
        //         System.out.println("elese loop");

        //     }
        //     start++;
        // }
        // double meadean=0;
        // if(count_of_middleelemnts>=1){
        //     meadean =sum/count_of_middleelemnts;
        // }else{
        //     meadean=sum/1;
        // }
        
        // return meadean;

    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2};
        int[] nums2 = {1, 2};

        System.out.println(findsumSortedArrays(nums1,nums2));;
    }
}
