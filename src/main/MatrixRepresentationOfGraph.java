package main;

import graph.representation.Graph;
import graph.representation.listGraph.ListGraph;
import graph.representation.matrixGraph.MatrixGraph;

public class MatrixRepresentationOfGraph {


    public static final int VERTEX_COUNT = 8;

    public static void main(String[] args) {
        System.out.println("Matrix Graph Representation");
        final Graph mGraph = new MatrixGraph(VERTEX_COUNT);
        mGraph.buildGraph();
        mGraph.printAdjacencyList();

        System.out.println("List Graph Representation");
        final Graph lGraph = new ListGraph(VERTEX_COUNT);
        lGraph.buildGraph();
        lGraph.printAdjacencyList();
    }
}
