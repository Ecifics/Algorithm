package com.ecifics.algorithm.graph.union;

/**
 * @author Ecifics
 * @Description 按秩合并，秩就是以该节点为根节点的树的高度，合并的时候秩小的合并到秩大的根节点上
 * @date 9/6/2022-8:43 PM
 */
public class UnionFindByRank {

    private int[] root;

    // 记录每个节点的秩
    private int[] rank;

    public UnionFindByRank(int n) {
        root = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; ++i) {
            root[i] = i;
            rank[i] = 1;
        }
    }

    public int find(int x) {
        while (x != root[x]) {
            x = root[x];
        }

        return x;
    }

    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX != rootY) {
            // 获取两个节点的根节点的秩
            int rankX = rank[rootX];
            int rankY = rank[rootY];
            if (rankX > rankY) {
                root[rootY] = rootX;
            }

            if (rankX < rankY) {
                root[rootX] = rootY;
            }

            if (rankX == rankY) {
                root[rootY] = rootX;
                ++rank[rootX];
            }
        }
    }

    public boolean isConnected(int x, int y) {
        return find(x) == find(y);
    }

    public static void main(String[] args) {
        UnionFindByRank uf = new UnionFindByRank(10);

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
