import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Musica escaces = new Musica("rock","Escaces de verde","Los peripatéticos");



        BufferedReader br;
        br = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Ingrese el nuevo artista : ");
        String nombre = br.readLine();
        escaces.setArtista(nombre);

        System.out.println("escaces.getArtista() = " + escaces.getArtista());




        //escacez.setArtista(art);




    }
    
}