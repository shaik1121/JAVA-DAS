public class Bubble_sorting {
//    This function is to print the array
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
//        We are going to define an array
        int[] arr = {7, 10, 11, 15, 12, 5, 11, 2};
//        Bubble_Sort Starts:
//        Outer loop is to define number of times the sorting must be done
        for (int i = 0; i < arr.length - 1; i++) {
//            Inner loop helps to check number of times the loop must be executed.
            for (int j = 0; j < arr.length - 1 - i; j++) {
//                This helps to swap the elements.
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[ j ];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArray(arr);
    }
}
// Time complexity for bubble sort is "O(n^2)".
