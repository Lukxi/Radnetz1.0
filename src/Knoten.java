public class Knoten {

   private Datenelement daten;
   public boolean besucht = false;

   public Knoten(Datenelement daten){
       this.daten = daten;
   }

    public Datenelement getDaten() {
        return daten;
    }

    public void setBesucht(boolean besucht) {
        this.besucht = besucht;
    }

    public boolean isBesucht() {
        return besucht;
    }
}
