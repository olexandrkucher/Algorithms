package graph.algorithms.dfs.list;

import graph.beans.ListGraph;
import graph.beans.SimpleArrayListMultimap;
import graph.beans.Vertex;

public class ListDirectedGraph extends ListGraph {

    public ListDirectedGraph(int vertexCount) {
        super(vertexCount);
        list = new SimpleArrayListMultimap<>();
    }

    @Override
    public void createEdge(int x, int y) {
        list.put(x, new Vertex(y));
    }

    @Override
    public void buildGraph() {
        System.out.println("Figure 22.4                    ");
        System.out.println("u --> v     w     0 --> 1     2");
        System.out.println("|   % |   / |     |   % |   / |");
        System.out.println("|  /  |  /  |     |  /  |  /  |");
        System.out.println("v /   v %   v     v /   v %   v");
        System.out.println("x <-- y     z<    3 <-- 4     5<");
        System.out.println("            |_|               |_|\n");

        createEdge(0, 1);
        createEdge(0, 3);
        createEdge(1, 4);
        createEdge(2, 4);
        createEdge(2, 5);
        createEdge(3, 1);
        createEdge(4, 3);
        createEdge(5, 5);
    }
}