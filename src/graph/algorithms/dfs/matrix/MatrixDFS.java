package graph.algorithms.dfs.matrix;

import graph.algorithms.dfs.DFS;
import graph.beans.Color;
import graph.beans.Graph;

public class MatrixDFS extends DFS<int[][]> {

    public MatrixDFS(Graph<int[][]> graph) {
        super(graph);
    }

    @Override
    protected void dfsVisit(final int u) {
        color[u] = Color.GRAY;
        time++;
        d[u] = time;
        System.out.print("(" + u + " ");
        for (int v = 0; v < graph.getVertexCount(); v++){
            if (graph.represent()[u][v] == 1) {
                if (color[v] == Color.WHITE) {
                    pi[v] = u;
                    dfsVisit(v);
                }
            }
        }
        color[u] = Color.BlACK;
        time++;
        f[u] = time;
        System.out.print(u + ") ");
    }
}
