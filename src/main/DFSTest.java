package main;

import graph.algorithms.dfs.DFS;
import graph.algorithms.dfs.ListDFS;
import graph.beans.graph.*;
import graph.algorithms.dfs.MatrixDFS;
import graph.beans.SimpleArrayListMultimap;
import graph.beans.Vertex;

public class DFSTest {

    public static final int DIRECTED_VERTEX_COUNT = 6;
    public static final int UNDIRECTED_VERTEX_COUNT = 8;

    public static void main(String[] args) {

        System.out.println("Directed Matrix Graph");
        final Graph<int[][]> mGraph = new MatrixDirectedGraph(DIRECTED_VERTEX_COUNT);
        mGraph.buildGraph();
        mGraph.printAdjacencyList();

        DFS mDfs = new MatrixDFS(mGraph);
        mDfs.dfs();
        System.out.println("\n");


        System.out.println("Directed List Graph");
        final Graph<SimpleArrayListMultimap<Integer, Vertex>> lGraph = new ListDirectedGraph(DIRECTED_VERTEX_COUNT);
        lGraph.buildGraph();
        lGraph.printAdjacencyList();

        DFS lDfs = new ListDFS(lGraph);
        lDfs.dfs();
        System.out.println();

        System.out.println("Undirected Matrix Graph");
        final Graph<int[][]> umGraph = new MatrixUndirectedGraph(UNDIRECTED_VERTEX_COUNT);
        umGraph.buildGraph();
        umGraph.printAdjacencyList();

        mDfs = new MatrixDFS(umGraph);
        mDfs.dfs();
        System.out.println("\n");


        System.out.println("Undirected List Graph");
        final Graph<SimpleArrayListMultimap<Integer, Vertex>> ulGraph = new ListUndirectedGraph(UNDIRECTED_VERTEX_COUNT);
        ulGraph.buildGraph();
        ulGraph.printAdjacencyList();

        lDfs = new ListDFS(ulGraph);
        lDfs.dfs();
        System.out.println();
    }
}
