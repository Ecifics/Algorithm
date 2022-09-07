package com.ecifics.algorithm.graph;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ecifics
 * @Description TODO
 * @date 9/6/2022-6:44 PM
 */
public class Graph {

    // 用于表示各个定点
    private List<String> vertixList;

    // 用于保存当前图中边的数量
    private int numOfEdges;

    // 邻接数组
    private int[][] edges;

    // 初始化图，此时还没有边
    public Graph(int numOfVertix) {
        vertixList = new ArrayList<>();
        numOfEdges = 0;
        edges = new int[numOfVertix][numOfVertix];
    }

    // 插入边
    public void insertEdge(int vertix1, int vertix2, int weight) {
        if (edges[vertix1][vertix2] == 0) {
            ++numOfEdges;
        }
        edges[vertix1][vertix2] = weight;
        edges[vertix2][vertix1] = weight;
    }

    // 插入节点
    public void insertVertix(String vertix) {
        vertixList.add(vertix);
    }
}
