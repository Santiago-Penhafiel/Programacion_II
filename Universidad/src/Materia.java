import java.util.Scanner;

public class Materia {

    private Double nrc;
    private String nombre;

    public Materia() {
    }

    public Materia(Double nrc, String nombre) {
        this.nrc = nrc;
        this.nombre = nombre;
    }

    public Double getNrc() {
        return nrc;
    }

    public void setNrc(Double nrc) {
        this.nrc = nrc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAll(){
        Scanner scan = new Scanner(System.in);

        System.out.print("\n\nIngrese el nombre de la materia : ");
        this.setNombre(scan.nextLine());

        System.out.print("\nIngrese el NRC de la materia : ");
        this.setNrc(scan.nextDouble());
        scan.nextLine();
    }

    public void show(){
        System.out.println("\n\nEl NRC de la materia es : " + getNrc());
        System.out.println("\nEl nombre de la materia es : " + getNombre());
    }
}










