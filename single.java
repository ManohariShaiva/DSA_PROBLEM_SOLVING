public class single {

    public static int singleNumber(int[] nums) {
        int result=0;
        for(int num:nums) {
            result=result^num;
        }
        return result;
    }
    public static void mian(String[] args) {
        int[] nums={4,1,2,1,2};
        System.out.println(singleNumber(nums));

    }
    
}
