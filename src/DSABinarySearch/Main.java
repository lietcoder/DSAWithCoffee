package DSABinarySearch;

public class Main {
    public static void main(String[] args) {
//        BinarySearch binarySearch = new BinarySearch();
//        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
//        int target = -118;
//        System.out.println("target found: "+binarySearch.binarySearch(arr, target));
//        System.out.println("Ceiling found: "+binarySearch.findCeiling(arr, target));
//        System.out.println("Floor found: "+binarySearch.findFloor(arr, target));
//        /*output
//            target found: -1
//            Ceiling found: -18
//            Floor found: -1
//        */
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 2;
        BinearySearchRecap binearySearchRecap= new BinearySearchRecap();
        BinarySearch binarySearch = new BinarySearch();
        //System.out.println("binary search reuslt is: "+ binearySearchRecap.binarySearch(arr, target));
        System.out.println("ceiling in binary search is: "+ binearySearchRecap.findCeiling(arr, target));
        System.out.println("floor in binary search is: "+ binarySearch.findFloor(arr, target));



    }
}
