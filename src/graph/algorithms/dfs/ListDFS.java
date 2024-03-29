package graph.algorithms.dfs;

import graph.beans.Color;
import graph.beans.graph.Graph;
import graph.beans.SimpleArrayListMultimap;
import graph.beans.Vertex;

/** Cormen, Leiserson, Rivest, Stein. Introduction to Algorithms, 2nd Ed.
 * Chapter 22. Elementary Graph Algorithms
 * 22.3 Depth-first search
 * adjacency-list representation
 */
public class ListDFS extends DFS<SimpleArrayListMultimap<Integer, Vertex>> {

    public ListDFS(Graph<SimpleArrayListMultimap<Integer, Vertex>> graph) {
        super(graph);
    }

    @Override
    protected void dfsVisit(final int u) {
        color[u] = Color.GRAY;
        time++;
        d[u] = time;
        System.out.print("(" + u + " ");
        if(null != graph.represent().get(u)) {
            graph.represent().get(u).stream().filter(v -> color[v.getKey()] == Color.WHITE).forEach(v ->{
                pi[v.getKey()] = u;
                dfsVisit(v.getKey());
            });
        }
        color[u] = Color.BlACK;
        time++;
        f[u] = time;
        System.out.print(u + ") ");
    }
}
