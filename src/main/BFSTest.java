package main;

import graph.algorithms.bfs.BFS;
import graph.algorithms.bfs.ListBFS;
import graph.beans.graph.ListUndirectedGraph;
import graph.algorithms.bfs.MatrixBFS;
import graph.beans.graph.MatrixUndirectedGraph;
import graph.beans.graph.Graph;
import graph.beans.SimpleArrayListMultimap;
import graph.beans.Vertex;

public class BFSTest {

    public static final int VERTEX_COUNT = 8;

    public static void main(String[] args) {
        final int src = 1;
        final int finish = 7;

        System.out.println("Matrix Graph");
        final Graph<int[][]> mGraph = new MatrixUndirectedGraph(VERTEX_COUNT);
        mGraph.buildGraph();
        mGraph.printAdjacencyList();

        final BFS mBfs = new MatrixBFS(mGraph);
        mBfs.bfs(src);
        mBfs.printPath(src, finish);
        System.out.println("\n");


        System.out.println("List Graph");
        final Graph<SimpleArrayListMultimap<Integer, Vertex>> lGraph = new ListUndirectedGraph(VERTEX_COUNT);
        lGraph.buildGraph();
        lGraph.printAdjacencyList();

        final BFS lBfs = new ListBFS(lGraph);
        lBfs.bfs(src);
        lBfs.printPath(src, finish);
        System.out.println();
    }
}
