package graph.beans.graph;

import graph.beans.SimpleArrayListMultimap;
import graph.beans.Vertex;

import java.util.stream.Collectors;

public abstract class ListGraph extends Graph<SimpleArrayListMultimap<Integer, Vertex>> {

    protected SimpleArrayListMultimap<Integer, Vertex> list;

    public ListGraph(int vertexCount) {
        super(vertexCount);
        list = new SimpleArrayListMultimap<>();
    }

    @Override
    public void printAdjacencyList() {
        for (int i = 0; i < vertexCount; i++) {
            System.out.print(i + ": ");
            if(null != list.get(i)) {
                System.out.println(list.get(i).stream().map(ver -> String.valueOf(ver.getKey())).collect(Collectors.joining(", ")));
            } else {
                System.out.println();
            }
        }
        System.out.println();
    }

    @Override
    public SimpleArrayListMultimap<Integer, Vertex> represent(){
        return list;
    }
}
