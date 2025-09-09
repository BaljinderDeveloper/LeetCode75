package PrefixSum.Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Prog1_1732_FindtheHighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
//        int[] gain = {-4,-3,-2,-1,4,3,2};
        Prog1_1732_FindtheHighestAltitude obj = new Prog1_1732_FindtheHighestAltitude();
        System.out.println(obj.largestAltitude(gain));
    }
    public int largestAltitude(int[] gain) {
        List<Integer> altitude = new ArrayList<>();
        altitude.add(0);
        int i = 0;
        while(i < gain.length){
            altitude.add(altitude.get(i)+gain[i]);
            i++;
        }
        System.out.println(altitude);
        return Collections.max(altitude);
    }
}
