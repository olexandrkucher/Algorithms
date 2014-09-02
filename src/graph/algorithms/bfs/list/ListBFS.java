package graph.algorithms.bfs.list;

import graph.algorithms.bfs.BFS;
import graph.beans.Color;
import graph.beans.Graph;
import graph.beans.SimpleArrayListMultimap;
import graph.beans.Vertex;

import java.util.ArrayList;
import java.util.List;

public class ListBFS extends BFS<SimpleArrayListMultimap<Integer, Vertex>> {

    public ListBFS(final Graph<SimpleArrayListMultimap<Integer, Vertex>> graph) {
        super(graph);
    }

    @Override
    public void bfs(int src) {
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