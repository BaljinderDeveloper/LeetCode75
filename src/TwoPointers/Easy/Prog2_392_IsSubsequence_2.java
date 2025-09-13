package TwoPointers.Easy;

public class Prog2_392_IsSubsequence_2 {
    public static void main(String[] args) {
        String s = "";
        String t = "ahbgdc";
        Prog2_392_IsSubsequence_2 obj = new Prog2_392_IsSubsequence_2();
        System.out.println(obj.isSubsequence(s,t));
    }
    public boolean isSubsequence(String s, String t) {
        int s_pointer = 0;
        int t_pointer = 0;

        if(s.isEmpty())
            return true;

        while(t_pointer < t.length()){
            if(s.charAt(s_pointer) == t.charAt(t_pointer)){
                s_pointer++;
                if(s_pointer == s.length())
                    return true;
            }
            t_pointer++;
        }
        return false;
    }
}
