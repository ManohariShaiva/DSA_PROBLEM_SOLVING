public class Redundant {

    static class DSU {
        int[] parent;
        DSU(int n) {
            parent=new int[n+1];
            for(int i=1;i<=n;i++) {
                parent[i]=i;

            }
        }
        int find(int x) {
            if(parent[x]!=x) {
                parent[x]=find(parent[x]);

            }
            return parent[x];
        }
        boolean union(int x, int y) {
            int px=find(x);
            int py=find(y);
            if(px==py) {
                return false;
            }
            parent[x]=py;
            return true;
        }
    }

    public static int[] findredundant(int[][] edges) {
        int n=edges.length;
        DSU desu=new DSU(n);
        for(int[] edge:edges) {
            int u=edge[0];
            int v=edge[1];
            if(!dsu.union(u,v)) {
                return edge;
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {



    }
}
