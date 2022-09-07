package com.ecifics.algorithm.graph.union;

/**
 * @author Ecifics
 * @Description 基于路劲压缩的并查集算法
 * @date 9/7/2022-9:54 AM
 */
public class UnionFindByCompressed {

    private int[] root;

    public UnionFindByCompressed(int n) {
        root = new int[n];
        for (int i = 0; i < n; ++i) {
            root[i] = i;
        }
    }

    public int find(int x) {
        if (x == root[x]) {
            return x;
        }

        // 递归将x的父节点修改为根节点
        return root[x] = find(root[x]);
    }

    public void union(int x, int y) {
        int rootX = root[x];
        int rootY = root[y];
        if (rootX != rootY) {
            root[rootY] = rootX;
        }
    }

    public boolean isConnected(int x, int y) {
        return find(x) == find(y);
    }

    public static void main(String[] args) {
        UnionFindByCompressed uf = new UnionFindByCompressed(10);

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
