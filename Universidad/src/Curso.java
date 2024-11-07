import java.util.Scanner;

public class Curso {

    private Double paralelo;
    private String horario;
    private Double nrc;

    public Curso() {
    }

    public Curso(Double paralelo, String horario, Double nrc) {
        this.paralelo = paralelo;
        this.horario = horario;
        this.nrc = nrc;
    }

    public Double getParalelo() {
        return paralelo;
    }

    public void setParalelo(Double paralelo) {
        this.paralelo = paralelo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Double getNrc() {
        return nrc;
    }

    public void setNrc(Double nrc) {
        this.nrc = nrc;
    }

    public void setAll(){
        Scanner scan = new Scanner(System.in);

        System.out.print("\n\nIngrese el NRC del curso : ");
        this.setNrc(scan.nextDouble());
        scan.nextLine();

        System.out.print("\nIngrese el paralelo del curso : ");
        this.setParalelo(scan.nextDouble());
        scan.nextLine();

        System.out.print("\nIngrese el tipo de horario del curso : ");
        this.setHorario(scan.nextLine());

    }

    public void show(){
        System.out.println("\n\nEl horario del curso es "+this.getHorario());
        System.out.println("\nEl NRC del curso es "+this.getNrc());
        System.out.println("\nEl paralelo del curso es "+this.getParalelo());
    }

}




