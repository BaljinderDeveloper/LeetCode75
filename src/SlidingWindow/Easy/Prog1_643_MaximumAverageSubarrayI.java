package SlidingWindow.Easy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Prog1_643_MaximumAverageSubarrayI {
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
//        int[] nums = {5};
        int k = 4;
//        int k = 1;
//        (12-5-6+50)/4=51/4=12.75
        Prog1_643_MaximumAverageSubarrayI obj = new Prog1_643_MaximumAverageSubarrayI();
        System.out.println(obj.findMaxAverage(nums,k));
    }
    public double findMaxAverage(int[] nums, int k) {
        List<Integer> sumList = new ArrayList<>();
        final int n = k;
        int loops = nums.length-k+1;
        int i = 0, sum = 0;

        for(int x = 0; x < loops; x++){
            i = x;
//            System.out.println("k="+k+"x="+x+"i="+i);
            while(i < k){
                sum += nums[i];
                i++;
            }
            sumList.add(sum);
            k++;
            sum = 0;
        }
        double max = sumList.get(0);
        Iterator<Integer> it = sumList.iterator();
        while(it.hasNext()){
            int current = it.next();
            if(current > max){
                max = current;
            }
        }
        return max/n;
    }
}
