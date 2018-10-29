package chapter1.chapter1_5;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class UF {
    private int[] id;
    private int count;

    public UF(int N){
        count = N;
        id = new int[N];
        for(int i = 0;i < N;i++){
            id[i] = i;
        }
    }

    public int count(){
        return count;
    }

    public boolean connected(int p,int q){
        return quickUnionFind(p) == quickUnionFind(q);
    }

    public int quickFind(int p){
        return id[p];
    }

    public int quickUnionFind(int p){
        while (p != id[p]){
            p = id[p];
        }

        return p;
    }

    public void quickFindUnion(int p,int q){
        int pID = quickUnionFind(p);
        int qID = quickUnionFind(q);

        if(pID == qID){
            return;
        }

        for(int i = 0;i < id.length;i++){
            if(id[i] == pID){
                id[i] = qID;
            }
        }
        count--;
    }

    public void quickUnion(int p,int q){
        int pRoot = quickUnionFind(p);
        int qRoot = quickUnionFind(q);
        if(pRoot == qRoot){
            return;
        }
        id[pRoot] = qRoot;
        count--;
    }

    public static void main(String[] args) {
        int N = StdIn.readInt();
        UF uf = new UF(N);
        while(!StdIn.isEmpty()){
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if(uf.connected(p,q)){
                continue;
            }
            uf.quickUnion(p,q);
            StdOut.println(p + " " + q);
        }
        StdOut.println(uf.count() + " components");
    }
}
