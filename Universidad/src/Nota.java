import javax.xml.transform.Source;
import java.util.Scanner;

public class Nota {
    private Double progresoUno;
    private Double progresoDos;
    private Double progresoTres;
    private Double total;


    public Nota() {
    }

    public Double getProgresoUno() {
        return progresoUno;
    }

    public void setProgresoUno(Double progresoUno) {
        this.progresoUno = progresoUno;
    }

    public Double getProgresoDos() {
        return progresoDos;
    }

    public void setProgresoDos(Double progresoDos) {
        this.progresoDos = progresoDos;
    }

    public Double getProgresoTres() {
        return progresoTres;
    }

    public void setProgresoTres(Double progresoTres) {
        this.progresoTres = progresoTres;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public void setAll(){
        Scanner scan = new Scanner(System.in);

        System.out.print("\n\nIngrese ela nota del primer progreso : ");
        this.setProgresoUno(scan.nextDouble());
        scan.nextLine();

        System.out.print("\nIngrese ela nota del segundo progreso : ");
        this.setProgresoDos(scan.nextDouble());
        scan.nextLine();

        System.out.print("\nIngrese ela nota del tercer progreso : ");
        this.setProgresoTres(scan.nextDouble());
        scan.nextLine();

    }

    public Double calculoTotal(){
        double total;
        total = this.getProgresoUno()*25f/100f+this.getProgresoDos()*35f/100f+this.getProgresoTres()*40f/100f;
//        total = 10;
        return total;
    }

    public void show(){
        System.out.println("\n\nLa nota de primer progreso es : " + getProgresoUno());
        System.out.println("\nLa nota de segundo progreso es : " + getProgresoDos());
        System.out.println("\nLa nota de tercer progreso es : " + getProgresoTres());
        System.out.println("\nLa nota total del semestre es de : " + getTotal());
    }

}









