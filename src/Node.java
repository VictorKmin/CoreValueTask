import java.util.ArrayList;

public class Node {

    //
    private int distanceFromSource = 999;
    //
    private boolean visited;
    private ArrayList<Edge> edges = new ArrayList<Edge>();

    public int getDistanceFromSource() {
    return distanceFromSource;
}

    public void setDistanceFromSource(int distanceFromSource) {
        this.distanceFromSource = distanceFromSource;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public ArrayList<Edge> getEdges() {
        return edges;
    }

    public void setEdges(ArrayList<Edge> edges) {
        this.edges = edges;
    }

}