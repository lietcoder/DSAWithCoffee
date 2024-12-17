package DSALinearSearch;

public class SearchElementInRange {
    public static int searchInRange(int[] in, int start, int end, int target){
        if((start>in.length) || end>in.length)
            return -1;
        for(int i=start;i<end; i++){
            if(in[i]==target)
                return i;
        }
        return 0;
    }
}
