
public class Bubble {

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] ={34, 12, 24, 9, 5};

        System.out.println("Array Before Bubble Sort");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        bubbleSort(arr);

        System.out.println("Array After Bubble Sort");
        for(int i=0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Array Bubble Sort Reverse");
        for (int counter = arr.length - 1 ;counter >= 0; counter--) {
            System.out.print(arr[counter] + " ");
        }
    }
}