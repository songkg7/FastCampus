package basic.study25;

import java.util.Stack;

/**
 * @author songkg7
 * @version 1.0.0
 * @since 2021/06/08 9:02 오후
 */
public class DfsSearch {

    int count;
    boolean[] visited;
    Stack<Integer> stack;
    int[][] matrix;

    public DfsSearch(int count) {
        this.count = count;
        visited = new boolean[count];
        stack = new Stack<>();
    }

    public void dfsTraversal() {
        stack.push(0);
        visited[0] = true;

        while (!stack.isEmpty()) {
            int node = stack.pop();
            System.out.print(node + " ");

            for (int i = 0; i < count; i++) {
                if (matrix[node][i] != 0 && !visited[i]) {

                    stack.push(i);
                    visited[i] = true;

                }
            }
        }
    }

    public static void main(String[] args) {

        int count = 8;
        UndirectedGraph graph = new UndirectedGraph(count);
        graph.addEdges(0, 1, 1);
        graph.addEdges(0, 2, 1);
        graph.addEdges(1, 3, 1);
        graph.addEdges(1, 4, 1);
        graph.addEdges(2, 5, 1);
        graph.addEdges(2, 6, 1);
        graph.addEdges(4, 5, 1);
        graph.addEdges(3, 7, 1);

        DfsSearch dfs = new DfsSearch(count);
        dfs.matrix = graph.getVertexMatrix();

        dfs.dfsTraversal();

    }

}
