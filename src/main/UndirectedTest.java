package main;

import graph.beans.graph.ListUndirectedGraph;
import graph.beans.graph.MatrixUndirectedGraph;
import graph.beans.graph.Graph;

public class UndirectedTest {

    public static final int VERTEX_COUNT = 8;

    public static void main(String[] args) {
        System.out.println("Undirected Matrix Graph Representation");
        final Graph mGraph = new MatrixUndirectedGraph(VERTEX_COUNT);
        mGraph.buildGraph();
        mGraph.printAdjacencyList();

        System.out.println("Undirected List Graph Representation");
        final Graph lGraph = new ListUndirectedGraph(VERTEX_COUNT);
        lGraph.buildGraph();
        lGraph.printAdjacencyList();
    }
}