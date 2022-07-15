public class CheckArray {
    public static void checkArray(int arr[], int i) {
        if (i == arr.length - 1) {
//            System.out.println("Your Array is in order.");
            return;
        }
        if (arr[i] < arr[i + 1] || arr[i] == arr[i + 1]) {

        } else {
            System.out.println("Your Array is not in order.");
        }
        checkArray(arr, i + 1);

    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 5};
        int i = 0;
        checkArray(arr,i);
    }
}
