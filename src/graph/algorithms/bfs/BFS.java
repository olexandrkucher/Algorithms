package graph.algorithms.bfs;

import graph.beans.Color;
import graph.beans.Graph;

import java.util.ArrayList;
import java.util.List;

public abstract class BFS<E> {

    protected static final int INFINITY = Integer.MAX_VALUE;
    protected static final int NIL = Integer.MIN_VALUE;

    protected int[] d; // distance from the source s
    protected int[] pi; // predecessor or parent of vertex
    protected Color[] color; // color of vertex
    protected Graph<E> graph;
    protected List<Integer> list; // FIFO queue of gray vertices

    /**
     * @param graph - graph
     */
    public BFS(Graph<E> graph) {
        this.graph = graph;
        this.list = new ArrayList<>();
        this.d = new int[graph.getVertexCount()];
        this.pi = new int[graph.getVertexCount()];
        this.color = new Color[graph.getVertexCount()];
    }

    public abstract void bfs(final int src);

    /**
     * prints out the vertices on a shortest path from @param start to @param finish
     */
    public void printPath(final int start, final int finish){
        if (start == finish){
            System.out.print(start);
        } else if (pi[finish] == NIL) {
            System.out.println("no path from " + start + " to " + finish + " exists");
        } else {
            printPath(start, pi[finish]);
            System.out.print(" -> " + finish);
        }
    }
}
