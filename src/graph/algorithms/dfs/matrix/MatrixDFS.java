package graph.algorithms.dfs.matrix;

import graph.algorithms.dfs.DFS;
import graph.beans.Color;
import graph.beans.Graph;

/** Cormen, Leiserson, Rivest, Stein. Introduction to Algorithms, 2nd Ed.
 * Chapter 22. Elementary Graph Algorithms
 * 22.3 Depth-first search
 * adjacency-matrix representation
 */
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
