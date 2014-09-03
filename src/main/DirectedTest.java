package main;

import graph.beans.graph.ListDirectedGraph;
import graph.beans.graph.MatrixDirectedGraph;
import graph.beans.graph.Graph;

public class DirectedTest {

    public static final int VERTEX_COUNT = 6;

    public static void main(String[] args) {
        System.out.println("Directed Matrix Graph Representation");
        final Graph mGraph = new MatrixDirectedGraph(VERTEX_COUNT);
        mGraph.buildGraph();
        mGraph.printAdjacencyList();

        System.out.println("Directed List Graph Representation");
        final Graph lGraph = new ListDirectedGraph(VERTEX_COUNT);
        lGraph.buildGraph();
        lGraph.printAdjacencyList();
    }
}