import java.util.ArrayList;

public class Calculate {

    private Node[] nodes;
    private int countOfNodes;
    private Edge[] edges;

    public Calculate(Edge[] edges) {
        this.edges = edges;
        countOfNodes = howMuchNodes(edges);
        nodes = new Node[countOfNodes];

        for (int i = 0; i < countOfNodes; i++) {
            nodes[i] = new Node();
        }

        for (int edgeToAdd = 0; edgeToAdd < edges.length; edgeToAdd++) {
            nodes[edges[edgeToAdd].getFromNodeIndex()].getEdges().add(edges[edgeToAdd]);
        }
    }
    private int howMuchNodes(Edge[] edges) {
        int noOfNodes = 0;

        for (int i = 0; i<edges.length; i++) {
            if (edges[i].getToNodeIndex() > noOfNodes) {
                noOfNodes = edges[i].getToNodeIndex();
            }
            else {
                noOfNodes = edges[i].getFromNodeIndex();
            }
        }

        noOfNodes++;
        return noOfNodes;
    }

    public void calculateDistances() {

        nodes[0].setDistanceFromSource(0);

        for (int nodeIndx = 0; nodeIndx < nodes.length; nodeIndx++) {

            ArrayList<Edge> currentNodeEdges = nodes[nodeIndx].getEdges();

            for (int edgeNumber = 0; edgeNumber < currentNodeEdges.size(); edgeNumber++) {
                int neighIndex = currentNodeEdges.get(edgeNumber).getNeighIndex(nodeIndx);

                if (nodes[neighIndex].isVisited() == false) {
                    int totalLength = nodes[nodeIndx].getDistanceFromSource() + currentNodeEdges.get(edgeNumber).getLength();

                    if (totalLength < nodes[neighIndex].getDistanceFromSource()) {
                        nodes[neighIndex].setDistanceFromSource(totalLength);
                    }
                }
            }
            nodes[nodeIndx].setVisited(true);
        }
    }

    public void printResult() {
        System.out.println("Number of nodes = " + countOfNodes);
        System.out.println("Number of edges = " + edges.length);
        System.out.println();

        for (int i = 0; i < nodes.length; i++) {
            System.out.println("The shortest distance from node 0 to node " + i + " is " + nodes[i].getDistanceFromSource());
        }
    }
}