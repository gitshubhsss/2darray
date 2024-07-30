public class selection {
    public static void main(String[] args) {
        int numbers[]={5,3,4,2,1};

        int i=0;
        while (i<numbers.length) {
            //consider the 1 element and minimum element
            int minIndex=i;

            for(int j=i+1;j<numbers.length;j++){
                if(numbers[minIndex]>numbers[j]){
                    minIndex=j;
                }
            }
            int temp=numbers[minIndex];
            numbers[minIndex]=numbers[i];
            numbers[i]=temp;
            i++;
        }

        for(int j=0;j<numbers.length;j++){
            System.out.print(numbers[j]+" ");
        }
    }
}
