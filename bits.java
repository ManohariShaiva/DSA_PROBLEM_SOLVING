public class bits {
    public static int [] countBits(int n){
        int [] ans = new int[n+1];

        for( int i =0 ; i<=n ; i++){
            ans[i] = countOnes(i);
        }
      return ans;
    }

    public static int countOnes(int num){

        int count = 0;
        while( num>0){
            count+= (num & 1);
            num = num>>1;
        }
        return count;

    }

    public static void main(String[] args) {
        int n = 5;
        int [] result =countBits( n);
        for(int x: result){
            System.out.println(x + " ");
        }

        
    }
    
}