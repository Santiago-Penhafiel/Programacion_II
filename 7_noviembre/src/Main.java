import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[3]; //declaracion de un array

        System.out.println(array.length); //.length para la magnitud de un array

        array[0] = 1;
        array[1] = 2;
        array[2] = -1;

        System.out.println("array[0] = " + array[0]);

        array[0] = Integer.valueOf("2");
        System.out.println("array[0] = " + array[0]);

        String[] productos = new String[3];
        productos[0]  = "Memoria";
        productos[1] = "Samsung S2-3";
        productos[2] = "Airpods";

        for (int i = 0 ; i < 3 ; i++){
            System.out.println("productos[i] = " + productos[i]);
        }

        System.out.println();
        Arrays.sort(productos);

//        Arrays.sort(productos);
        for (int i = 0 ; i < 3 ; i++){
            System.out.println("productos[i] = " + productos[i]);
        }



        //System.out.println("productos[0] = " + productos[0]);


        // LISTAS

        List<String> listaColores = new ArrayList<>(); //creacion de una lista

        // creacion mediante clase Arrays
        String[] nombres = {"Arturo", "Daniel", "Pamela"};
        List<String> listaNombres = Arrays.asList(nombres);


        listaColores.add("Verde");
        listaColores.add("Amarillo");

        // construir lista a partir de otra
        List<String> listaElementos = new ArrayList<>(listaColores);

        listaElementos.addAll(listaNombres);

        listaNombres.forEach(System.out::println); // imprime todos los elementos de una lista o arreglo
        listaNombres.forEach(nombre -> System.out.println("[" + nombre + "]")); // imprime con formato

        ListIterator<String> iterador = listaNombres.listIterator();
        while(iterador.hasNext()){
            System.out.println("Nombre : " + iterador.next());
        }

        System.out.println();

        while(iterador.hasPrevious()){
            System.out.println("Nombre : " + iterador.previous());
        }

        ListIterator<String> elementosIterator = listaElementos.listIterator();

        while (elementosIterator.hasNext()){
            System.out.println("Elementos : " + elementosIterator.next());
        }

        System.out.println();

        while (elementosIterator.hasPrevious()){
            System.out.println("Elementos : " + elementosIterator.previous());
        }

    }
}











