package Array_String.Medium;

public class Prog1_151_ReverseWordsinaString {
    public static void main(String[] args) {
//        String s = "the sky is blue";
//        String s = "   hello world  ";
        String s = "a good    example";
        Prog1_151_ReverseWordsinaString obj = new Prog1_151_ReverseWordsinaString();
        System.out.println(obj.reverseWords(s));
    }
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        StringBuffer sb = new StringBuffer();
        for(int i = str.length-1; i >= 0; i--){
            if(!(str[i].equals(""))){
                sb.append(str[i].trim());
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
