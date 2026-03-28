public class Toll {
    public static boolean check(char[][] way, String path) {
        int rows=way.length;
        int cols=way[0].length;
        for(int i=0; i<rows; i++){
            for(int j =0 ;j<cols;j++){
                if(dfs(way, path, i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean dfs(char[][] way, String path, int i, int j, int index ) {
        if(index==path.length()) {
            return true;
    }
    //input Constraints
    if(i<0 || j<0 || i>=way.length || j>=way[0].length || way[i][j] != path.charAt(index)) {
        return false;
    }
    char temp = way[i][j];
    way[i][j]='#';
    boolean found = dfs(way,path,i+1,j,index+1)||dfs(way,path,i-1,j,index+1)||dfs(way,path,i,j+1,index+1)||dfs(way,path,i,j-1,index+1);
    way[i][j] = temp;
    return found;
  
    }

    public static void main(String[] args){
        char[][] way={
            {'A', 'B', 'C', 'D'},
            {'F', 'F', 'C', 'R'},
            {'G', 'I', 'O', 'N'}
        };
        System.out.println(check(way,"ABCCFC"));
    }
}