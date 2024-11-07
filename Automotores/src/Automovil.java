public class Automovil {
    //atributos estados
    private String marca;
    private String color;
    private String modelo;
    private Float cilindraje;

    //constructor


    public Automovil() {
    }

    public Automovil(String marca, String color, String modelo, Float cilindraje) {
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
    }

    //metodos - acciones
    public String detalleAuto(){
        String dt = "La marca es -> "+ this.marca +"\n"+
                "El modelo es -> "+ this.modelo+"\n"+
                "El color es -> " + this.color + "\n"+
                "El cilidraje es -> " + this.cilindraje;
        return dt;
    }

    public float consumoCombustible(float km, float gal){
        float kpg;
        kpg = km/gal;
        return kpg;
    }

    public float consumoCombustible(float km){
        float pca;
        pca = km*0.7f;
        return pca;
    }

    /*public String leerMarca(){
        this.marca = marca;
        return marca;
    }

    public String ingresarMarca(String marca){
        this.marca = marca;
        return this.marca;
    }*/

    public Float getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(Float cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}


