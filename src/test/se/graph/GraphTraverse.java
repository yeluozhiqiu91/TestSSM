package se.graph;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by wang on 2018/1/27.
 */
public class GraphTraverse {
    public static void WidePriority(GraphNode node){
        if(node==null){
            return;
        }
        Queue<GraphNode> queue=new ArrayDeque<GraphNode>();
        queue.add(node);
        while (node!=null||!queue.isEmpty()){
            GraphNode node1=queue.poll();
            System.out.println(node1);
            node1.setVisited(true);
            int visitedCount=0;
            for(GraphNode node2:node.getGraphNodes()){
                if(node2.isVisited){

                }
            }
        }
    }
}
