package se.graph;

import java.util.List;

/**
 * Created by wang on 2018/1/27.
 */
public class GraphNode {
    String data;
    List<GraphNode> graphNodes;
    boolean isVisited;

    public GraphNode(String data, List<GraphNode> graphNodes, boolean isVisited) {
        this.data = data;
        this.graphNodes = graphNodes;
        this.isVisited = isVisited;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<GraphNode> getGraphNodes() {
        return graphNodes;
    }

    public void setGraphNodes(List<GraphNode> graphNodes) {
        this.graphNodes = graphNodes;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    @Override
    public String toString() {
        return data;
    }
}
