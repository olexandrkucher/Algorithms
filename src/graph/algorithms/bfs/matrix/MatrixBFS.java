package graph.algorithms.bfs.matrix;

import graph.algorithms.bfs.BFS;
import graph.beans.Color;
import graph.beans.Graph;

import java.util.ArrayList;
import java.util.List;

public class MatrixBFS extends BFS<int[][]> {

    public MatrixBFS(final Graph<int[][]> graph) {
        super(graph);
    }

    @Override
    public void bfs(final int src) {
        final List<Integer> list = new ArrayList<>();
        final Color[] color = new Color[graph.getVertexCount()];

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