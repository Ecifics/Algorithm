package com.ecifics.algorithm.graph.union;

/**
 * @author Ecifics
 * @Description 此种并查集实现方法find时间复杂度O(1),union时间复杂度O(n)
 * 此时root数组保存每个节点的根节点值而不是其父节点值
 * @date 9/6/2022-8:03 PM
 */
public class QuickFind {

    private int[] root;

    /**
     * 初始化root数组
     * @param n - 代表一共有n个节点
     */
    public QuickFind(int n) {
        root = new int[n];
        for (int i = 0; i < n; ++i) {
            root[i] = i;
        }
    }

    /**
     * 获取节点x的代表结点
     * @param x
     * @return
     */
    public int find(int x) {
        return root[x];
    }

    /**
     * 连接两个节点
     * @param x
     * @param y
     */
    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        // 如果两个节点的代表节点不同，那么修改其中一个节点以及和它有共同代表节点的值
        if (rootX != rootY) {
            int n = root.length;
            for (int i = 0; i < n; ++i) {
                if (root[i] == rootY) {
                    root[i] = rootX;
                }
            }
        }
    }

    /**
     * 判断两个节点是否连通
     * @param x
     * @param y
     * @return
     */
    public boolean isConnected(int x, int y) {
        return find(x) == find(y);
    }

    public static void main(String[] args) {
        QuickFind uf = new QuickFind(10);

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
