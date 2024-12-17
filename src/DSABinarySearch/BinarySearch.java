package DSABinarySearch;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            System.out.println("left, righ and mid are : "+ left+" "+right+"  "+mid);
            if (arr[mid] == target) {
                return mid; // Element found at index mid
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
            System.out.println("left, righ and mid are ::: "+ left+" "+right+"  "+mid);
        }
        return -1; // Element not found
    }
    public static int findCeiling(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int ceiling = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return arr[mid]; // Found exact match, return the element
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                ceiling = arr[mid]; // Update ceiling and search in the left half
                right = mid - 1;
            }
        }
        return ceiling;
    }
    public static int findFloor(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int floor = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return arr[mid]; // Found exact match, return the element
            } else if (arr[mid] < target) {
                floor = arr[mid]; // Update floor and search in the right half
                left = mid + 1;
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return floor;
    }
}
