import java.util.Arrays;
public class SortArray {
        public static void main(String[] args) {
            int[] arr = {5, 2, 9, 1, 5, 6};
            System.out.println("Original Array: " + Arrays.toString(arr));

            //here we're using bubble sort
            for(int i=0; i<arr.length-1; i++) {
                for(int j=0; j<arr.length-i-1; j++) {
                    if(arr[j] > arr[j+1]) {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }

            System.out.println("Sorted Array: " + Arrays.toString(arr));
        }
    }

