package DSABinarySearch;

public class BinearySearchRecap {

    static int binarySearch(int[] num, int target){
        int left =0;
        int right=num.length;
        System.out.println("left, right, mid are: "+ left+"  "+ right);
        while(left<=right){
        //for(int i=0; i<num.length;i++){
            System.out.println("entering while loop");
            int mid=left+(right-left)/2;
            if(num[mid]==target)
                return mid;
            else if(num[mid]<target)
                left=mid+1;
            else right =mid-1;
        }
        return -1;
    }
    static int findCeiling(int[] num, int target){
        int left=0;
        int right = num.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            System.out.println("left, right, mid are: "+ left+"  "+ right);
            if(num[mid]==target)
                return num[mid];
            else if(num[mid]<target)
                left=mid+1;
            else right =mid-1;
        }
        return -1;
    }

}
