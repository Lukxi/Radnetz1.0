/**
 * Diese Klasse gibt das konkrete Radnetz als Testbeispiel an.
 */
class Test
{
    //Für Testzwecke darf auf den Graphen selbst zugegriffen werden.
    public  Graph radnetz;

    //Konstruktor
    Test()
    {
        radnetz = new Graph(20);

        //Zu Testzwecken werden die ersten sieben Knoten fest angegeben.
        //Die Rueckgabewerte bezeichnen den Index des Knotens.
        int a = radnetz.knotenHiinzuefuzegen(new Ortschaft("Altdorf", 100, "Marktplatz"));
        int f = radnetz.knotenHiinzuefuzegen(new Ortschaft("Fischbach", 80, "Fischspezialitaeten"));
        int w = radnetz.knotenHiinzuefuzegen(new Ortschaft("Weiler", 20, "Naturbad"));
        int z = radnetz.knotenHiinzuefuzegen(new Ortschaft("Ziegelstein", 200, "Heimatmuseum"));
        int b = radnetz.knotenHiinzuefuzegen(new Ortschaft("Burg", 50, "Historische Burg"));
        int n = radnetz.knotenHiinzuefuzegen(new Ortschaft("Neustadt", 80, "Einkaufszentrum"));
        int r = radnetz.knotenHiinzuefuzegen(new Ortschaft("Rain", 50, "Klettergarten"));

        //Zu Testzwecken werden Kanten zwischen obigen Knoten festgelegt.
        radnetz.kanteHinzufuegen(a,f,20);
        radnetz.kanteHinzufuegen(a,w,15);
        radnetz.kanteHinzufuegen(f,a,10);
        radnetz.kanteHinzufuegen(f,w,10);
        radnetz.kanteHinzufuegen(w,f,25);
        radnetz.kanteHinzufuegen(w,z,5);
        radnetz.kanteHinzufuegen(z,f,15);
        radnetz.kanteHinzufuegen(z,b,20);
        radnetz.kanteHinzufuegen(b,z,5);
        radnetz.kanteHinzufuegen(b,f,15);
        radnetz.kanteHinzufuegen(z,n,15);
        radnetz.kanteHinzufuegen(n,r,20);
        radnetz.kanteHinzufuegen(r,b,25);
        radnetz.tiefensucheStarten(z);
        radnetz.pfadAusgeben();
    }

    public Graph getRadnetz() {
        return radnetz;
    }

    //Alles ausgeben
    void ausgeben()
    {
        radnetz.knotenAusgeben();
        radnetz.adjazenmatrixAusgeben();

    }

    public static void main(String[] args) {
        Test test = new Test();
    }

}
