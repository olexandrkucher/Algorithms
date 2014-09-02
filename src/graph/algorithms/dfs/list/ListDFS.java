package graph.algorithms.dfs.list;

import graph.algorithms.dfs.DFS;
import graph.beans.Color;
import graph.beans.Graph;
import graph.beans.SimpleArrayListMultimap;
import graph.beans.Vertex;

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
