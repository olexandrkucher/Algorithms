package graph.representation.listGraph;

import graph.representation.Graph;

import java.util.stream.Collectors;

public class ListGraph extends Graph {

    private SimpleArrayListMultimap<Integer, Vertex> list;

    protected ListGraph(int vertexCount) {
        super(vertexCount);
        list = new SimpleArrayListMultimap<>();
    }

    @Override
    protected void createEdge(int x, int y) {
        list.put(x, new Vertex(y));
        list.put(y, new Vertex(x));
    }

    @Override
    protected void printAdjacencyList() {
        for (int i = 0; i < vertexCount; i++) {
            System.out.print(i + ": ");
            System.out.println(list.get(i).stream().map(ver -> String.valueOf(ver.getKey())).collect(Collectors.joining(", ")));
        }
    }
}
