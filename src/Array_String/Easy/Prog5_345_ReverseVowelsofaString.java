package Array_String.Easy;

import java.util.ArrayList;
import java.util.List;

public class Prog5_345_ReverseVowelsofaString {
    public static void main(String[] args) {
        String s = "IceCreAm";
        Prog5_345_ReverseVowelsofaString obj = new Prog5_345_ReverseVowelsofaString();
        System.out.println(obj.reverseVowels(s));
    }
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        List<Character> list = new ArrayList<>();
        for(char c : ch){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                list.add(c);
            }
        }
        int x = 0;
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < ch.length; i++){
            if(x < list.size() && ch[i] == list.get(x)){
                ch[i] = list.get(list.size()-1-x);
                x++;
            }
            sb.append(ch[i]);
        }
        return sb.toString();
    }
}