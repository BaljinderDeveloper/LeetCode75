package PrefixSum.Easy;

public class Prog2_724_FindPivotIndex {
    public static void main(String[] args) {
//        int[] nums = {1,7,3,6,5,6};
//        int[] nums = {1,2,3};
        int[] nums = {2,1,-1};
        Prog2_724_FindPivotIndex obj = new Prog2_724_FindPivotIndex();
        System.out.println(obj.pivotIndex(nums));
    }
    public int pivotIndex(int[] nums) {
        int LHS = 0, RHS = 0, pIndex = 0, flag = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < i; j++){
                LHS += nums[j];
            }
            for(int j = i+1; j < nums.length; j++){
                RHS += nums[j];
            }
            System.out.println("LHS="+LHS+"RHS="+RHS);
            if(LHS == RHS){
                pIndex = i;
                flag = 1;
                break;
            }
            LHS = RHS = 0;
            if(flag == 0){
                pIndex = -1;
            }
        }
        return pIndex;
    }
}
