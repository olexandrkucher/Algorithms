package graph.beans;

public abstract class Graph<E> {

    protected int vertexCount;

    protected Graph(int vertexCount) {
        this.vertexCount = vertexCount;
    }

    public abstract void createEdge(final int x, final int y);
    public abstract void printAdjacencyList();
    public abstract E represent();
    public abstract void buildGraph();

    public int getVertexCount() {
        return vertexCount;
    }
}
