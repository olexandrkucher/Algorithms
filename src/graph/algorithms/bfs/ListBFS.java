package graph.algorithms.bfs;

import graph.beans.Color;
import graph.beans.graph.Graph;
import graph.beans.SimpleArrayListMultimap;
import graph.beans.Vertex;

/** Cormen, Leiserson, Rivest, Stein. Introduction to Algorithms, 2nd Ed.
 * Chapter 22. Elementary Graph Algorithms
 * 22.2 Breadth-first search
 * adjacency-list representation
 */
public class ListBFS extends BFS<SimpleArrayListMultimap<Integer, Vertex>> {

    public ListBFS(final Graph<SimpleArrayListMultimap<Integer, Vertex>> graph) {
        super(graph);
    }

    @Override
    public void bfs(int src) {
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
            if(null != graph.represent().get(u)) {
                graph.represent().get(u).stream().filter(v -> color[v.getKey()] == Color.WHITE).forEach(v -> {
                    color[v.getKey()] = Color.GRAY;
                    d[v.getKey()] = d[u] + 1;
                    pi[v.getKey()] = u;
                    list.add(v.getKey());
                });
            }
            color[u] = Color.BlACK;
        }
    }
}