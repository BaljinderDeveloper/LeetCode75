package TwoPointers.Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Prog2_392_IsSubsequence {
    public static void main(String[] args) {
//        String s = "adc";
//        String s = "acd";
//        String s = "abc";
//        String s = "axc";
//        String s = "bb";
//        String s = "aza";
        String s = "aza";
//        String t = "ahbgdc";
        String t = "abzba";
//        String t = "abzba";

        Prog2_392_IsSubsequence obj = new Prog2_392_IsSubsequence();
        System.out.println(obj.isSubsequence(s,t));
    }
    static int count = 0;
    public boolean isSubsequence(String s, String t) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            while(count < t.length()){
                if(Objects.equals(s.charAt(i), t.charAt(count))){
                    list.add(count);
                    break;
                }
                count ++;
            }
        }
        System.out.println(list);
        if(list.size() != s.length())
            return false;
        int flag = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) >= list.get(j)) {
                    flag = 1;
                }
            }
        }
        return (flag == 1) ? false : true;
    }
}
