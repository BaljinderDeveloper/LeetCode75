package Array_String.Easy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Prog4_605_CanPlaceFlowers {
    public static void main(String[] args) {
//        int[] flowerbed = {1,0,0,0,0,0,1};
//        int[] flowerbed = {0,0,0,0};
//        int[] flowerbed = {0};
        int[] flowerbed = {1,0,0,0,0,0,1};
        int n = 2;

        Prog4_605_CanPlaceFlowers obj = new Prog4_605_CanPlaceFlowers();
        System.out.println(obj.canPlaceFlowers(flowerbed,n));
    }
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0, flag = 0;
        List<Integer> list = new ArrayList<>();
        list.add(0);
        for(int i : flowerbed){
            list.add(i);
        }
        list.add(0);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            if(it.next() == 0){
                count++;
                if(count == 3){
                    flag++;
                    count = 1;
                }
            }else{
                count = 0;
            }
        }
        return flag >= n;
//        for(int i : flowerbed){
//            if(i == 0){
//                count++;
//                if(count == 3){
//                    flag++;
//                    count = 1;
//                }
//            }else{
//                count = 0;
//            }
//        }
//        if(flowerbed.length == 1 && flowerbed[0] == 0){
//            flag++;
//        }
//        if(flowerbed.length > 1 && flowerbed.length < 5){
//            if(flowerbed[0] == 0 && flowerbed[1] == 0){
//                flag++;
//            }
//            if (flowerbed[flowerbed.length-1] == 0 && flowerbed[flowerbed.length-2] == 0 && flowerbed.length !=2) {
//                flag++;
//            }
//        }
//        return flag >= n;
    }
}