package graph.algorithms.bfs;

import graph.beans.Color;
import graph.beans.graph.Graph;

/** Cormen, Leiserson, Rivest, Stein. Introduction to Algorithms, 2nd Ed.
 * Chapter 22. Elementary Graph Algorithms
 * 22.2 Breadth-first search
 * adjacency-matrix representation
 */
public class MatrixBFS extends BFS<int[][]> {

    public MatrixBFS(final Graph<int[][]> graph) {
        super(graph);
    }

    @Override
    public void bfs(final int src) {
        for(int i = 0; i < graph.getVertexCount(); i++) {
            if (i != src) {
                color[i] = Color.WHITE;
                d[i] = INFINITY;
                pi[i] = NIL;
            }
        }
        color[src] = Color.GRAY;
        d[src] = 0;
        pi[src] = NIL;

        list.add(src);
        while(!list.isEmpty()) {
            final int u = list.remove(0);
            for(int v = 0; v < graph.getVertexCount(); v++) {
                if(graph.represent()[u][v] == 1) {
                    if (color[v] == Color.WHITE) {
                        color[v] = Color.GRAY;
                        d[v] = d[u] + 1;
                        pi[v] = u;
                        list.add(v);
                    }
                }
            }
            color[u] = Color.BlACK;
        }
    }
}