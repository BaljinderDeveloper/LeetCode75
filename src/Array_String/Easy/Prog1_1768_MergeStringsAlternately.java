package Array_String.Easy;

public class Prog1_1768_MergeStringsAlternately {
    public static void main(String[] args) {
        String str1 = "1234", str2 = "pqrstuv";

        StringBuffer sb = new StringBuffer();

        int size = str1.length()+str2.length();
        for(int i = 0; i < size; i++){
            if(i < str1.length())
                sb.append(str1.charAt(i));
            if(i < str2.length())
                sb.append(str2.charAt(i));
        }
        System.out.println(sb);
    }
}
