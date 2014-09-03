package graph.beans.graph;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public abstract class MatrixGraph extends Graph<int[][]> {

    protected int[][] matrix;

    public MatrixGraph(int vertexCount) {
        super(vertexCount);
        matrix = new int[this.vertexCount][this.vertexCount];
    }

    @Override
    public void printAdjacencyList(){
        for (int i = 0; i < this.vertexCount; i++) {
            System.out.println(vectorToCollection(matrix[i]).stream().map(Object::toString).collect(Collectors.joining(" ")));
        }
        System.out.println();
    }

    private Collection<Integer> vectorToCollection(final int[] vector){
        final Collection<Integer> collection = new ArrayList<>();
        for (int i : vector) {
            collection.add(i);
        }
        return collection;
    }

    @Override
    public int[][] represent(){
        return matrix;
    }
}
