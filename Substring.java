import java.util.HashSet;

public class Substring {
    public static int lengthoflongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();

        int left=0;
        int maxLen=0;
        for(int right=0;right<s.length();right++) {
            char current=s.charAt(right);
            while(set.contains(current)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(current);
            maxLen = Math.max(maxLen,right-left + 1);
        }
        return maxLen;
    }

     
        public static void main(String[] args) {
        String s="aci";
        System.out.println(lengthoflongestSubstring(s));
    }
}
    

