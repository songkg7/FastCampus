package basic.study25;

import java.util.stream.IntStream;

/**
 * @author songkg7
 * @version 1.0.0
 * @since 2021/06/09 12:46 오후
 */
class MyGraph {

    private int count; // node count
    private int[][] vertexMatrix;  // matrix 로 그래프 표시
    private int[] distance;  // 가장 가까운 거리
    private boolean[] visited;
    private static int UNLIMITED = 999999999;  // 초기값

    public MyGraph(int count) {
        this.count = count;
        vertexMatrix = new int[count][count];
        distance = new int[count];
        visited = new boolean[count];
    }

    public void addEdges(int from, int to, int weight) {
        vertexMatrix[from][to] = weight;
        vertexMatrix[to][from] = weight;
    }

    public void calcShortestPath(int from) {

        IntStream.range(0, count).forEach(i -> distance[i] = UNLIMITED);

        visited[from] = true;
        distance[from] = 0;

        IntStream.range(0, count).filter(i -> visited[from] && vertexMatrix[from][i] != 0)
            .forEach(i -> distance[i] = vertexMatrix[from][i]);

        for (int i = 0; i < count - 1; i++) {

            int min = UNLIMITED;
            int minIndex = -1;

            for (int j = 0; j < count; j++) {
                if (!visited[j] && distance[j] != UNLIMITED) {
                    if (distance[j] < min) {
                        min = distance[j];
                        minIndex = j;
                    }
                }
            }

            visited[minIndex] = true;
            for (int j = 0; j < count; j++) {
                if (!visited[j] && vertexMatrix[minIndex][j] != 0) {
                    if (distance[j] > distance[minIndex] + vertexMatrix[minIndex][j]) {
                        distance[j] = distance[minIndex] + vertexMatrix[minIndex][j];
                    }
                }
            }

        }

    }

    public void showDistance(int from) {
        IntStream.range(0, count)
            .mapToObj(i -> from + " 노드로부터 " + i + " 노드의 최단 거리는 : " + distance[i])
            .forEach(System.out::println);
    }

}

public class ShortestPath {

    public static void main(String[] args) {
        MyGraph graph = new MyGraph(6);
        graph.addEdges(0, 1, 1);
        graph.addEdges(0, 2, 4);
        graph.addEdges(1, 2, 2);
        graph.addEdges(2, 3, 1);
        graph.addEdges(3, 4, 8);
        graph.addEdges(3, 5, 3);
        graph.addEdges(4, 5, 4);

        graph.calcShortestPath(0);
        graph.showDistance(0);

    }

}



