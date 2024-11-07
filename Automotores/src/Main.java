public class Main {
    public static void main(String[] args) {
        //constructor mismo nombre que la clase con mayúscula
        Automovil bmw = new Automovil(); //creación objetos en base a clase Automovil
        bmw.setMarca("BMW");
        bmw.setCilindraje(2.2f);
        bmw.setColor("Negro");
        bmw.setModelo("i220");

        System.out.println("bmw.getMarca() = " + bmw.getMarca());
        System.out.println("bmw.getModelo() = " + bmw.getModelo());
        System.out.println("bmw.getColor() = " + bmw.getColor());
        System.out.println("bmw.getCilindraje() = " + bmw.getCilindraje());


        
    }
}