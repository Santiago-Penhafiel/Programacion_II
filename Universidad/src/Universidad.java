import java.util.Scanner;

public class Universidad {
    private String nombre;
    private String ubicacion ;
    private Double telefono  ;
    private String correo;

    public Universidad(){

    }

    public Universidad(String nombre, String ubicacion, Double telefono, String correo) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Double getTelefono() {
        return telefono;
    }

    public void setTelefono(Double telefono) {
        this.telefono = telefono;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setAll(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la Universidad : ");
        this.setNombre(scan.nextLine());

        System.out.print("\nIngrese la dirección : ");
        this.setUbicacion(scan.nextLine());

        System.out.print("\nIngrese el número de teléfono : ");
        this.setTelefono(scan.nextDouble());

        scan.nextLine();

        System.out.print("\nIngrese el correo de la universidad "+this.getNombre()+" : " );
        this.setCorreo(scan.nextLine());
    }

    public void show(){
        System.out.println("\n\nEl nombre de la universidad es "+this.getNombre());
        System.out.println("\nLa ubicacion de la universidad es "+this.getUbicacion());
        System.out.println("\nEl telefono de la universidad es "+this.telefono);
        System.out.println("\nEl correo de la universidad es "+this.getCorreo());
    }




}
