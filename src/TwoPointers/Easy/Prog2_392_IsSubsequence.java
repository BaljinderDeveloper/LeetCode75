package TwoPointers.Easy;

import java.util.ArrayList;
import java.util.List;

public class Prog2_392_IsSubsequence {
    public static void main(String[] args) {
//        String s = "adc";
        String s = "axc";
        String t = "ahbgdc";
        Prog2_392_IsSubsequence obj = new Prog2_392_IsSubsequence();
        System.out.println(obj.isSubsequence(s,t));
    }
    public boolean isSubsequence(String s, String t) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            for(int j = 0; j < t.length(); j++){
                if(s.charAt(i) == t.charAt(j)){
                    list.add(j);
                }
            }
        }
        System.out.println(list);
        int flag = 0;
        if(list.size() == s.length()){
            for(int i = 0; i < list.size()-1; i++){
                if(list.get(i) > list.get(i+1)){
                    flag = 1;
                }
            }
        }
        return (flag == 1)? false : true;
    }
}
