public class Graph {

    public Knoten[] knotenfeld;
    private int anzahlKnoten;
    private int maxAnzahl;
    int[][] adjazenmatrix;

    public Graph(int maxAnzahlKnoten){
        adjazenmatrix = new int[maxAnzahlKnoten][maxAnzahlKnoten];
        anzahlKnoten=0;
        maxAnzahl = maxAnzahlKnoten;
        matrixVorbelegen();
    }

    private void matrixVorbelegen(){
        for (int i= 0; i < maxAnzahl; i++){
            for (int a = 0; a < maxAnzahl; a++){
                if (i == a){
                    adjazenmatrix[i][a] = 0;
                }
                adjazenmatrix[i][a] = 0;
            }
        }
    }

    private void adjazenmatrixAusgeben(){

        for (int i = 0; i<maxAnzahl; i++){
            for (int a = 0; i< maxAnzahl;i++)
                System.out.println(adjazenmatrix[i][a]);
        }
    }

    private void knotenAusgeben(){

        for (int i = 0; i<anzahlKnoten; i++){
            knotenfeld[i].getDaten().ausgeben();
        }
    }

}
