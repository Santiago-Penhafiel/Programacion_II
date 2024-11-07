import java.util.Scanner;

public class Estudiante {
    private  String nombre;
    private String apellido;
    private Double edad;
    private String carrera;
    private Double idBanner;

    public Estudiante(){

    }

    public Estudiante(String nombre, String apellido, Double edad, String carrera, Double idBanner) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.carrera = carrera;
        this.idBanner = idBanner;
    }

    public Double getIdBanner() {
        return idBanner;
    }

    public void setIdBanner(Double idBanner) {
        this.idBanner = idBanner;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getEdad() {
        return edad;
    }

    public void setEdad(Double edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setAll(){
        Scanner scan = new Scanner(System.in);

        System.out.print("\n\nIngrese el nombre del estudiante : ");
        this.setNombre(scan.nextLine());

        System.out.print("\nIngrese el apellido del estudiante : ");
        this.setApellido(scan.nextLine());

        System.out.print("\nIngrese la edad del estudiante : ");
        this.setEdad(scan.nextDouble());
        scan.nextLine();

        System.out.print("\nIngrese la carrera del estudiante : ");
        this.setCarrera(scan.nextLine());

        System.out.print("\nIngrese el ID Banner del estudiante : ");
        this.setIdBanner(scan.nextDouble());
        scan.nextLine();
    }

    public void show(){
        System.out.println("\n\nEl nombre del estudiante es "+this.getNombre()+" "+getApellido());
        System.out.println("\nEl estudiante tiene "+this.getEdad()+" años");
        System.out.println("\nEl estudiante estudia "+this.getCarrera());
        System.out.println("\nEl ID Banner del estudiante es "+this.getIdBanner());
    }

}
