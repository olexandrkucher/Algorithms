package graph.algorithms.dfs;

import graph.beans.Color;
import graph.beans.Graph;

public abstract class DFS<E> {

    protected static final int NIL = Integer.MIN_VALUE;

    protected int time;
    protected int[] d;
    protected int[] f;
    protected int[] pi;
    protected Color[] color;
    protected Graph<E> graph;

    public DFS(Graph<E> graph) {
        this.graph = graph;
        this.d = new int[graph.getVertexCount()];
        this.f = new int[graph.getVertexCount()];
        this.pi = new int[graph.getVertexCount()];
        this.color = new Color[graph.getVertexCount()];
    }

    protected abstract void dfsVisit(final int u);

    public void dfs() {
        for(int u = 0; u < graph.getVertexCount(); u++) {
            color[u] = Color.WHITE;
            pi[u] = NIL;
        }
        time = 0;
        for(int u = 0; u < graph.getVertexCount(); u++) {
            if(color[u] == Color.WHITE) {
                dfsVisit(u);
                System.out.println();
            }
        }
    }
}