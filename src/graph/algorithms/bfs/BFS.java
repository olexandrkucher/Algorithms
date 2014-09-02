package graph.algorithms.bfs;

import graph.beans.Graph;

public abstract class BFS<E> {

    protected static final int INFINITY = Integer.MAX_VALUE;
    protected static final int NIL = Integer.MIN_VALUE;

    protected int[] d;
    protected int[] pi;
    protected Graph<E> graph;

    public BFS(Graph<E> graph) {
        this.graph = graph;
        this.d = new int[graph.getVertexCount()];
        this.pi = new int[graph.getVertexCount()];
    }

    public abstract void bfs(final int src);

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
