package graph.beans.graph;

import graph.beans.SimpleArrayListMultimap;
import graph.beans.Vertex;

public class ListUndirectedGraph extends ListGraph {

    public ListUndirectedGraph(int vertexCount) {
        super(vertexCount);
        list = new SimpleArrayListMultimap<>();
    }

    @Override
    public void createEdge(int x, int y) {
        list.put(x, new Vertex(y));
        list.put(y, new Vertex(x));
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