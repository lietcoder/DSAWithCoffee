package leetcode.leetcode_1211;
import java.util.*;
public class ThreeSum_15 {
    static List<ArrayList<Integer>> threeSum(int[] nums){
        List<List<Integer>> threeSumList = new ArrayList<>();
        System.out.println("Input string is: "+ Arrays.toString(nums));
        for(int i=0; i<nums.length;i++){ //{-1,0,1,2,-1,-4};
            for(int j=i+1; j<nums.length;j++) {
                for(int k=j+1; k<nums.length;k++) {
                    if (nums[i]+nums[j]+nums[k]==0) {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                        System.out.println("Triplet is: "+ triplet);
                        triplet.sort(Integer::compareTo);
                        if(!threeSumList.contains(triplet))
                            threeSumList.add(triplet);
                    }
                }
            }

        }
        System.out.println("Three sum triplets are: "+ threeSumList);
        return null;
    }
   static HashSet<List<Integer>> arryToSetList(int[] nums){
        HashSet<List<Integer>> hlist = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, Arrays.stream(nums).boxed().toArray(Integer[]::new));
       System.out.println("list is: "+ list );
       hlist.add(list);
       return hlist;

   }

    public static void main(String[] args) {
        int[] nums = new int[] {-1,0,1,2,-1,-4};
        threeSum(nums);

    }
}
