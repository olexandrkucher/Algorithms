package main;

import graph.algorithms.dfs.DFS;
import graph.algorithms.dfs.list.ListDFS;
import graph.algorithms.dfs.list.ListDirectedGraph;
import graph.algorithms.dfs.matrix.MatrixDFS;
import graph.algorithms.dfs.matrix.MatrixDirectedGraph;
import graph.beans.Graph;
import graph.beans.SimpleArrayListMultimap;
import graph.beans.Vertex;

public class DFSTest {

    public static final int VERTEX_COUNT = 6;

    public static void main(String[] args) {

        System.out.println("Matrix Graph");
        final Graph<int[][]> mGraph = new MatrixDirectedGraph(VERTEX_COUNT);
        mGraph.buildGraph();
        mGraph.printAdjacencyList();

        final DFS mDfs = new MatrixDFS(mGraph);
        mDfs.dfs();
        System.out.println("\n");


        System.out.println("List Graph");
        final Graph<SimpleArrayListMultimap<Integer, Vertex>> lGraph = new ListDirectedGraph(VERTEX_COUNT);
        lGraph.buildGraph();
        lGraph.printAdjacencyList();

        final DFS lDfs = new ListDFS(lGraph);
        lDfs.dfs();
        System.out.println();
    }
}
