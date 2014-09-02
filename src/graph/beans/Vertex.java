package graph.beans;

public class Vertex {

    protected int key;

    /**
     * @param key - vertex v of edge (u,v)
     */
    public Vertex(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
}
