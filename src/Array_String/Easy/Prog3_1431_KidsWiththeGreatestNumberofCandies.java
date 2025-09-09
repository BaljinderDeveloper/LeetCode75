package Array_String.Easy;

import java.util.*;

public class Prog3_1431_KidsWiththeGreatestNumberofCandies {
    public static void main(String[] args) {

        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        Prog3_1431_KidsWiththeGreatestNumberofCandies obj = new Prog3_1431_KidsWiththeGreatestNumberofCandies();

        System.out.println(obj.kidsWithCandies(candies,extraCandies));
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Integer> list = new ArrayList<>();
        for(int i : candies){
            list.add(i);
        }
        Collections.sort(list);
        int max = list.getLast();

        List<Boolean> blist = new ArrayList<>();
        for(int i : candies){
            if(i + extraCandies >= max){
                blist.add(true);
            }else{
                blist.add(false);
            }
        }
        return blist;
    }
}
