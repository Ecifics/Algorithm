package com.ecifics.algorithm.graph.union;

/**
 * @author Ecifics
 * @Description 基于路劲压缩的按秩合并优化
 * @date 9/7/2022-10:04 AM
 */
public class UnionFindPremium {

    private int[] root;

    private int[] rank;

    public UnionFindPremium(int n) {
        root = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; ++i) {
            root[i] = i;
            rank[i] = 1;
        }
    }

    public int find(int x) {
        if (x == root[x]) {
            return x;
        }

        return root[x] = find(root[x]);
    }

    public void union(int x, int y) {
        int rootX = root[x];
        int rootY = root[y];
        if (rootX != rootY) {
            int rankX = rank[rootX];
            int rankY = rank[rootY];
            if (rankX > rankY) {
                root[rootY] = rootX;
            }

            if (rankX == rankY) {
                root[rootY] = rootX;
                rank[rootX]++;
            }

            if (rankX < rankY) {
                root[rootX] = rootY;
            }
        }
    }

    public boolean isConnected(int x, int y) {
        return find(x) == find(y);
    }

    public static void main(String[] args) {
        UnionFindPremium uf = new UnionFindPremium(10);

        uf.union(1, 2);
        uf.union(2, 5);
        uf.union(5, 6);
        uf.union(6, 7);
        uf.union(3, 8);
        uf.union(8, 9);
        System.out.println(uf.isConnected(1, 5)); // true
        System.out.println(uf.isConnected(5, 7)); // true
        System.out.println(uf.isConnected(4, 9)); // false
        // 1-2-5-6-7 3-8-9-4
        uf.union(9, 4);
        System.out.println(uf.isConnected(4, 9)); // true
    }
}
