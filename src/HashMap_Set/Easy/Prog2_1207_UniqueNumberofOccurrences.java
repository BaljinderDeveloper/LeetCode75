package HashMap_Set.Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Prog2_1207_UniqueNumberofOccurrences {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3};
//        int[] arr = {1,2};
//        int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};
        Prog2_1207_UniqueNumberofOccurrences obj = new Prog2_1207_UniqueNumberofOccurrences();
        System.out.println(obj.uniqueOccurrences(arr));
    }
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else {
                map.put(i,1);
            }
        }
        System.out.println(map);
        List<Integer> list = new ArrayList<>();
        for(int i : map.values()){
            list.add(i);
        }
        for(int i = 0; i < list.size(); i++){
            for(int j = i+1; j < list.size(); j++){
                if(list.get(i).equals(list.get(j))){
                    return false;
                }
            }
        }
        return true;
    }
}
