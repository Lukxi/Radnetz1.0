public class Main {

    public static void main(String[] args) {
        Graph g = new Graph(10);
        g.knotenHiinzuefuzegen(new Ortschaft("Grafenau", 1, "Baer"));

        g.adjazenmatrixAusgeben();
    }

}
