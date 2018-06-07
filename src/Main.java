public class Main {

    public static void main(String[] args) {
        Edge[] edges = {
                new Edge(0, 2, 1),
                new Edge(0, 3, 4),
                new Edge(0, 4, 2),
                new Edge(1, 3, 5),
                new Edge(1, 5, 2),
                new Edge(1, 7, 3),
                new Edge(2, 4, 2),
                new Edge(4, 6, 5),
                new Edge(5, 7, 1)
        };

        Calculate c = new Calculate(edges);
        c.calculateDistances();
        c.printResult();
    }



}