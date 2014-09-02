package graph.representation.matrixGraph;

import graph.representation.Graph;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class MatrixGraph extends Graph {

    private int[][] matrix;

    public MatrixGraph(int vertexCount) {
        super(vertexCount);
        matrix = new int[this.vertexCount][this.vertexCount];
    }

    @Override
    public void createEdge(final int x, final int y){
        matrix[x][y] = 1;
        matrix[y][x] = 1;
    }

    @Override
    public void printAdjacencyList(){
        for (int i = 0; i < this.vertexCount; i++) {
            System.out.println(vectorToCollection(matrix[i]).stream().map(Object::toString).collect(Collectors.joining(" ")));
        }
    }

    private Collection<Integer> vectorToCollection(final int[] vector){
        final Collection<Integer> collection = new ArrayList<>();
        for (int i : vector) {
            collection.add(i);
        }
        return collection;
    }
}
