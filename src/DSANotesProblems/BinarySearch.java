package DSANotesProblems;

public class BinarySearch {
    static int binarySearch(int[] i, int target){  ///1, 2,3,4,5,6,7, tartet=4
        int start =0; int end=i.length-1;
        int mid=start+end/2;
        System.out.println("mid and element are: "+mid+ "   "  +i[mid]);
        if (i[mid]==target) {
            System.out.println("Target is at middle index: "+mid);
            return mid;
        }
        if(i[mid]<target) {
            System.out.println("Search in left half");
            return binarySearch1(i, start, mid, target);
        }
        else if(i[mid]>target) {
            System.out.println("Search in right half");
            return binarySearch1(i, mid+1, end, target);
        }
        return 0;
    }
    static int binarySearch1(int[] in, int start, int end, int target){
        for( start=0;start<end;start++){
            if(in[start]==target)
                return start;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] i={1, 2,3,4,5,6,7}; int target=4; int target1=5;
        System.out.println("Binary search: element found at index: "+ binarySearch1(i,0, i.length-1 , target));
        System.out.println("Binary search: element found at index: "+ binarySearch1(i,0, i.length-1, target1));

        System.out.println("Binary search: element found at index: "+ binarySearch(i , target));
        System.out.println("Binary search: element found at index: "+ binarySearch(i, target1));
    }
}
