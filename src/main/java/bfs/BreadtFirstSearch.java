package bfs;

import common.Vertex;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Adrian on 04/06/2017.
 */
public class BreadtFirstSearch {

    /**
     * BFS (BreadtFirstSearch)
     * @param root
     */
    public void bfs(Vertex root) {
        Queue<Vertex> queue = new LinkedList<Vertex>();

        root.setVisited(true);
        queue.add(root);
        while (!queue.isEmpty()) {
            Vertex actualVertex = queue.remove();
            System.out.println(actualVertex + "-");

            for (Vertex vertex : actualVertex.getAdjacenciesList()) {
                if (!vertex.isVisited()) {
                    vertex.setVisited(true);
                    queue.add(vertex);
                }
            }
        }
    }
}
