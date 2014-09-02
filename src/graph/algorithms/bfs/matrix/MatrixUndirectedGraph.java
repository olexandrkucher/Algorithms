package graph.algorithms.bfs.matrix;

import graph.beans.MatrixGraph;

public class MatrixUndirectedGraph extends MatrixGraph {

    public MatrixUndirectedGraph(int vertexCount) {
        super(vertexCount);
    }

    @Override
    public void createEdge(final int x, final int y){
        matrix[x][y] = 1;
        matrix[y][x] = 1;
    }

    @Override
    public void buildGraph() {
        System.out.println("Figure 22.3                                 ");
        System.out.println("r --- s     t --- u      0 --- 1     2 --- 3");
        System.out.println("|     |   / |   / |      |     |   / |   / |");
        System.out.println("|     |  /  |  /  |      |     |  /  |  /  |");
        System.out.println("|     | /   | /   |      |     | /   | /   |");
        System.out.println("v     w --- x --- y      4     5 --- 6 --- 7\n");

        createEdge(0, 4);
        createEdge(0, 1);
        createEdge(1, 5);
        createEdge(5, 2);
        createEdge(5, 6);
        createEdge(6, 2);
        createEdge(6, 3);
        createEdge(6, 7);
        createEdge(3, 2);
        createEdge(3, 7);
    }
}