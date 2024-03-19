package claseteoria;

import java.util.InputMismatchException;

public class ClaseTeoria {

    public static void main(String[] args) {
        Auto a1 = new Auto(4, 15);
        Escena e1 = new Escena(a1);

        try {
            e1.jugar();
        } catch (InputMismatchException a) {

            System.out.println("Solo se pueden ingresar datos numericos");
            e1.jugar();
        }

    }

}
