import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Universidad uni = new Universidad();

        uni.setAll();

        Estudiante est = new Estudiante();

        est.setAll();

        Curso c = new Curso();

        c.setAll();

        Materia m = new Materia();

        m.setAll();

        Nota n = new Nota();

        n.setAll();

        uni.show();

        est.show();

        c.show();

        m.show();

        n.setTotal(n.calculoTotal());

        n.show();


    }
}






