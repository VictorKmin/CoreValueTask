public class Edge {

    private int fromNodeIndex;
    private int toNodeIndex;
    private int length;

    public Edge(int fromNodeIndex, int toNodeIndex, int length) {
        this.fromNodeIndex = fromNodeIndex;
        this.toNodeIndex = toNodeIndex;
        this.length = length;
    }

    public int getFromNodeIndex() {
        return fromNodeIndex;
    }

    public int getToNodeIndex() {
        return toNodeIndex;
    }

    public int getLength() {
        return length;
    }

    public int getNeighIndex(int nodeIndex) {
        if (fromNodeIndex == nodeIndex) {
            return toNodeIndex;
        } else {
            return fromNodeIndex;
        }
    }
}