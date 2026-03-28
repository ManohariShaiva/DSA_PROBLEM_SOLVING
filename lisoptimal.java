public class lisoptimal {
        public static int LengthOfLis (int[] nums) {
            if(nums.length==0) {
                return 0;
            } 
            int[] tails=new int[nums.length];
            int size=0;
            for(int num:nums) {
                int left=0,right=size;
                while(left<right) {
                    int mid=(left+right)/2;
                    if(tails[mid]<num) {
                        left=mid+1;

                    }
                    else {
                        right=mid;
                    }
                }
                tails[left]=num;
                if(left==size) {
                    size++;
                }
            }
            return size;
            
    }  
    public static void main(String[]args) {
        
        int[] salaries={10,9,2,5,7,101,18};
        System.out.println(lisoptimal.LengthOfLis(salaries));

    }  
}
