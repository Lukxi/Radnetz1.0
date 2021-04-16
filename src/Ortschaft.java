public class Ortschaft extends Datenelement{

    private String name;
    private int uebernachtungsplaetze;
    private String sehenswuerdigkeiten;

    public Ortschaft(String name, int uebernachtungsplaetze, String sehenswuerdigkeiten){
        this.name = name;
        this.sehenswuerdigkeiten = sehenswuerdigkeiten;
        this.uebernachtungsplaetze = uebernachtungsplaetze;
    }

    @Override
    public void ausgeben() {
        System.out.println(name);
    }


}
