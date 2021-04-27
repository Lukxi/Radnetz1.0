public class Graph {

    public Knoten[] knotenfeld;
    private int anzahlKnoten;
    private int maxAnzahl;
    public int[][] adjazenmatrix;

    public Graph(int maxAnzahlKnoten){
        adjazenmatrix = new int[maxAnzahlKnoten][maxAnzahlKnoten];
        knotenfeld = new Knoten[maxAnzahlKnoten];
        anzahlKnoten=0;
        maxAnzahl = maxAnzahlKnoten;
        matrixVorbelegen();
    }


    public void matrixVorbelegen() {
        for (int i = 0; i < maxAnzahl; i = i + 1) {
            for (int j = 0; j < maxAnzahl; j = j + 1) {
                if (i == j) {
                    adjazenmatrix[i][j] = 0;
                } else {
                    adjazenmatrix[i][j] = -1;
                }
            }
        }
    }


    public void adjazenmatrixAusgeben(){
        System.out.println(" ");
        System.out.println("Die Adjazenzenmatrix lautet:");

        for (int i = 0; i<  maxAnzahl; i++) {
            for (int a = 0; a < maxAnzahl; a++){
                System.out.print(adjazenmatrix[i][a] + ",");
        }
        System.out.println(" ");
        }
    }

    public void knotenAusgeben(){

        for (int i = 0; i<anzahlKnoten; i++){
            knotenfeld[i].getDaten().ausgeben();
        }
    }

    public int knotenHiinzuefuzegen(Datenelement datenelement){

        if (anzahlKnoten < knotenfeld.length) {
            Knoten k = new Knoten(datenelement);
            knotenfeld[anzahlKnoten] = k;
            anzahlKnoten++;
            return anzahlKnoten;
        }else {
            System.out.println("Es wurde kein Knoten erzeugt, da der Graph schon die max. Anzahl an Knoten enthält!");
            return -1;
        }
    }

    public void kanteHinzufuegen(int start, int Ziel, int bewertung){

        if (start > maxAnzahl || Ziel > maxAnzahl){
            System.out.println("Start oder Zielwert nicht gefunden!");
        }else
            adjazenmatrix[start][Ziel] = bewertung;

    }

    public void kanteLoeschen(int start, int Ziel){

        if (start > maxAnzahl || Ziel > maxAnzahl){
            System.out.println("Start oder Zielwert nicht gefunden!");
        }else
            adjazenmatrix[start][Ziel] = -1;


    }

    public void tiefensucheStarten(int startKnotenNR){
        for (int i = 0; i<anzahlKnoten;i++){
                knotenfeld[i].setBesucht(false);
        }
        if (startKnotenNR >= 0 && startKnotenNR<anzahlKnoten){
            tiefensucheDurchführen(startKnotenNR);
        }
    }

    public void tiefensucheDurchführen(int knotenNR){
        knotenfeld[knotenNR].setBesucht(true);
        knotenfeld[knotenNR].getDaten().ausgeben();
        for (int j = 0; j < anzahlKnoten; j++){
            if (adjazenmatrix[knotenNR][j] > 0 && !(knotenfeld[j].isBesucht())){
                tiefensucheDurchführen(j);
            }
        }
    }
}
