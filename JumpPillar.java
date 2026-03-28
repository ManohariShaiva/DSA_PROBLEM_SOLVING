public class JumpPillar {
    public static boolean canJump(int [] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i>max)
            {
                return false;
            }
            max= Math.max(max,i+nums[i]);
            if(max>=nums.length-1){
                return true;
            }

        }
        return true;
    }
    public static void main(String [] args) {
        int [] nums={1,0,0,1,3,3};
        boolean result = canJump(nums);
        System.out.println(result);

        }

    }

