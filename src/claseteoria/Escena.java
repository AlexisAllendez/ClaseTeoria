package claseteoria;

import java.util.Scanner;

public class Escena {

    private Auto autito;
    private Pared pared;

    public Escena(Auto autito) {
        this.autito = autito;
        this.pared = new Pared();

    }

    public boolean numDentroDeRango(int num, int min, int max) {
        
        if (num >= min && num <= max) {
            return true;
        }
        return false;
}
    
    
     public void averiguarSiSeChoco() {
        if (numDentroDeRango(autito.getPosX(), pared.getPosX(), pared.getPosX() + 5)) {
            if (numDentroDeRango(autito.getPosY(), pared.getPosY(), pared.getPosY() + 5)) {
                autito.setChocado(true);
            }
        }
    }

    public void jugar() {

        Scanner leer = new Scanner(System.in);
        System.out.println("Elija una opcion"
                + " A--Izquierda\n"
                + " S--Abajo\n"
                + " W--Arriba\n"
                + " D--Derecha\n"
                + " E--Salir del juego\n");
                //+ " C--Cambiar el auto");
        String opcion = leer.nextLine();

        while (!opcion.equalsIgnoreCase("e")) {
            if (!autito.isChocado()) {
                System.out.println("La posicion de la pared es : " +pared.getPosX()+" , "+pared.getPosY());
                switch (opcion) {
                    case "a":
                        autito.moverIzquierda();
                        
                        break;
                    case "s":
                        autito.moverAbajo();
                        
                        break;
                    case "w":
                        autito.moverArriba();
                        
                        break;
                    case "d":
                        autito.moverDerecha();
                        
                        break;
                    case "e":
                        return;
                        
                        
                            
                }

                averiguarSiSeChoco();
                
                
            } if(autito.isChocado()) {
                System.out.println("El auto esta chocado,¿desea cambiarlo? "
                        + " 1.Cambiarlo "
                        + " 2.no cambiarlo" );
                Scanner leerCambio = new Scanner(System.in);
                int opcionCambio = leerCambio.nextInt();
                

                if (opcionCambio == 1) {
                    autito.setPosX((int)(Math.random()*80));
                    autito.setPosY((int)(Math.random()*22));
                    autito.setChocado(false);
                } else {
                    opcion = "e";
                }
                
            }
            
            System.out.println("Elija una opcion"
                    + " A--Izquierda\n"
                    + " S--Abajo\n"
                    + " W--Arriba\n"
                    + " D--Derecha\n"
                    + " E--Salir del juego\n");
                   // + " C--Cambiar el auto");
            
            opcion = leer.nextLine();

        }

    }

}
