package basic.study25;

/**
 * @author songkg7
 * @version 1.0.0
 * @since 2021/06/08 8:10 오후
 */
public class UndirectedGraph {

    private int count;
    private int[][] vertexMatrix;

    public UndirectedGraph(int count) {
        this.count = count;
        vertexMatrix = new int[count][count];
    }

    public void addEdges(int from, int to, int weight) {
        vertexMatrix[from][to] = weight;
        vertexMatrix[to][from] = weight;
    }

    public int[][] getVertexMatrix() {
        return vertexMatrix;
    }
}
