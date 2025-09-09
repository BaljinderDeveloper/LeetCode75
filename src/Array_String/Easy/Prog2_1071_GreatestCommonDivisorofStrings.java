package Array_String.Easy;

public class Prog2_1071_GreatestCommonDivisorofStrings {
    public static void main(String[] args) {

        Prog2_1071_GreatestCommonDivisorofStrings obj = new Prog2_1071_GreatestCommonDivisorofStrings();
        System.out.println(obj.gcdOfStrings("ABABAB","ABAB"));

//        List<Character> list = new ArrayList<>();
//        for(int i = 0; i < str1.length(); i++){
//            for(int j = i; i < str2.length(); i++){
//                if(str1.charAt(i) == str2.charAt(j) && !list.contains(str1.charAt(i))){
//                    list.add(str1.charAt(i));
//                    break;
//                }
//            }
//        }
//        StringBuffer sb = new StringBuffer();
//        Iterator<Character> it = list.iterator();
//        while(it.hasNext()){
//            sb.append(it.next());
//        }
//        System.out.println(sb);
    }
    public String gcdOfStrings(String str1, String str2) {
        // If concatenating in both orders gives different results, there's no common base string
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // GCD of the lengths of the two strings
        int gcdLength = gcd(str1.length(), str2.length());

        // Return substring from 0 to gcdLength
        return str1.substring(0, gcdLength);
    }

    // Helper method to calculate GCD of two integers
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
