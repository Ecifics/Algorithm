package com.ecifics.algorithm.graph.union;

/**
 * @author Ecifics
 * @Description 此种并查集实现方法find时间复杂度O(n),union时间复杂度O(H),H为树的高度
 * 此时root值为其父节点值而不是根节点值，根节点的索引值和其数组值相同
 * @date 9/6/2022-8:16 PM
 */
public class QuickUnion {

    private int[] root;

    public QuickUnion(int n) {
        root = new int[n];
        for (int i = 0; i < n; ++i) {
            root[i] = i;
        }
    }

    public int find(int x) {
        // 根节点值和其索引值相同
        while (x != root[x]) {
            x = root[x];
        }

        return x;
    }

    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        // 如果x和y的根节点不同，则将y的根节点值调整为x的根节点
        if (rootX != rootY) {
            root[rootY] = root[x];
        }
    }

    public boolean isConnected(int x, int y) {
        return find(x) == find(y);
    }

    public static void main(String[] args) {
        QuickUnion uf = new QuickUnion(10);

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
