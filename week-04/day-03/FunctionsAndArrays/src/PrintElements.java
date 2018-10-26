public class PrintElements {
    public static void main(String[] args) {
        int[] numbers = {4, 5, 6, 7};
        System.out.print("The elements of our array are : ");
        for (int i = 0; i <numbers.length ; i++) {
            System.out.print(numbers[i] + ", ");
        }
    }
}
