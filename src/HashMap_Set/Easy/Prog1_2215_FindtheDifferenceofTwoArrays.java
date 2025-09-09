package HashMap_Set.Easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Prog1_2215_FindtheDifferenceofTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
//        int[] nums1 = {1,2,3,3};
        int[] nums2 = {2,4,6};
//        int[] nums2 = {1,1,2,2};
        Prog1_2215_FindtheDifferenceofTwoArrays obj = new Prog1_2215_FindtheDifferenceofTwoArrays();
        System.out.println(obj.findDifference(nums1,nums2));
    }
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int i : nums1){
            set1.add(i);
        }
        for(int i : nums2){
            if(!set1.contains(i)){
                set2.add(i);
            }
        }
        for(int i : nums2){
            if(set1.contains(i)){
                set1.remove(i);
            }
        }
        List<List<Integer>> list = new ArrayList<>();
        list.add(set1.stream().toList());
        list.add(set2.stream().toList());

        return list;
    }
}
