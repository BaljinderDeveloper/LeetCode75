package TwoPointers.Easy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Prog1_283_MoveZeroes {
    public static void main(String[] args){
        int[] nums = {0,1,0,3,12};
//        int[] nums = {0};
        List<Integer> list = new ArrayList<>();
        List<Integer> zlist = new ArrayList<>();
        for(int i : nums){
            if(i != 0){
                list.add(i);
            }else {
                zlist.add(i);
            }
        }
        Iterator<Integer> it = zlist.iterator();
        while(it.hasNext()){
            list.add(it.next());
        }
        System.out.println(list);
//        uncomment code below if you want to run it on LeetCode compiler
//        int i = 0;
//        while(i < nums.length){
//            nums[i] = list.get(i);
//            i++;
//        }
    }
}
