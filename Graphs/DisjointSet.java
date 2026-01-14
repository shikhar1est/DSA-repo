package Graphs;

//Two sets are called disjoint sets if they don't have any element in common.
// The disjoint set data structure is used to store such sets.
// It supports following operations:
//
//Merging two disjoint sets to a single set using Union operation.
//Finding representative of a disjoint set using Find operation.
//Check if two elements belong to same set or not. We mainly find representative of both and check if same.


//Intuition: Imagine a school football match where students are forming teams:
//Initially, everyone is alone.
//union(a, b) → put a and b in the same team
//find(x) → tell me which team x belongs to
//KEY RULE-> Each team has a representative(leader).

//Plain DSU(Disjoint Set Union/ Union-Find) is slow due to formation of chains.
//
public class DisjointSet {
    public static class UnionFind{
        private int[] parent;
        public UnionFind(int size){
            parent=new int[size];
            for(int i=0;i<size;i++){ //Initializing the parent array with each number as it's own representative.
                parent[i]=i;
            }
        }
        public int find(int a){ //Function to find the representative of the set that has element 'a'
            if(parent[a]==a) return a;
            return find(parent[a]);
        }
        public void union(int a,int b){
            int sl=find(a);
            int owner=find(b);
            parent[sl]=owner;
        }
    }
    public static void main(String[] args) {
         int size=5;
         UnionFind uf=new UnionFind(size);
         uf.union(1,2);
         uf.union(2,3);
         uf.union(3,4);
         System.out.println(uf.find(1)==uf.find(0));

    }
}
