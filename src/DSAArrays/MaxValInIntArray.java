package DSAArrays;

public class MaxValInIntArray {

    int[] arr = {1, 3, 2, 9, 18};
        // work on edge cases here, like array being null
        static int maxRange(int[] arr, int start, int end) {
            if (start > end) {
                return -1;
            }
            if (arr == null) {
                return -1;
            }
            int maxVal = arr[start];
            for (int i = start; i <= end; i++) {
                if (arr[i] > maxVal) {
                    maxVal = arr[i];
                }
            }
            System.out.println("maxValue: "+ maxVal);
            return maxVal;
        }
        static int max(int[] arr) {
            if (arr.length == 0) {
                return -1;
            }
            int maxVal = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > maxVal) {
                    maxVal = arr[i];
                }
            }
            System.out.println("max: "+maxVal);
            return maxVal;
        }
}
