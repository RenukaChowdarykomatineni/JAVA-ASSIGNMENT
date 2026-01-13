public class QUESTION8 {

    // Method to find maximum element
    static int findMax(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Main method to test findMax
    public static void main(String[] args) {
        int[] numbers = {12, 45, 7, 89, 34};

        int result = findMax(numbers);
        System.out.println("Largest element: " + result);
    }
}
