public class Split{
    public static int SplitArray(int[] nums, int k){
        int left = 0;
        int right = 0;
        for(int num:nums){
            left = Math.max(left, num);
            right+=num;
        }
        
    
    while(left<right){
        int mid = left + (right-left)/2;
        if(canSplit(nums, k, mid)){
            right = mid;
        }else{
            left = mid+1;
        }
    }
        return left;
    
    }
    public static boolean canSplit(int[] nums, int k, int maxSum){
        int currentSum = 0;
        int subarrays =1;
        for(int num:nums){
            if(currentSum+num>maxSum){
                subarrays++;
                currentSum = num;
                if(subarrays>k){
                    return false;
                }
            }
            else{
                currentSum+=num;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int k = 2;
        System.out.println(SplitArray(nums, k));
    }
}