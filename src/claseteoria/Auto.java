
package claseteoria;

import javax.swing.JOptionPane;


public class Auto {

    private int posX;
    private int posY;
    private boolean chocado;

    public Auto(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
        this.chocado=false;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public boolean isChocado() {
        return chocado;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public void setChocado(boolean chocado) {
        this.chocado = chocado;
    }
    
    public void moverArriba() {
        if(!chocado && posY > 0){
            posY -= 1;
            System.out.println("La posición (X,Y) es: " + posX +" "+ posY);
        }else{
            JOptionPane.showMessageDialog(null,"No se puede mover");
        }
    }

    public void moverAbajo() {
        if(!chocado && posY < 22){
            posY += 1;
            System.out.println("La posición (X,Y) es: " + posX +" "+ posY);
        }else{
            JOptionPane.showMessageDialog(null,"No se puede mover");
        }
    }

    public void moverIzquierda() {
        if(!chocado && posX > 0){
            posX -= 1;
            System.out.println("La posición (X,Y) es: " + posX +" "+ posY);
        }else{
            JOptionPane.showMessageDialog(null,"No se puede mover");
        }
    }

    public void moverDerecha() {
        if(!chocado && posX < 80){
            posX += 1;
           System.out.println("La posición (X,Y) es: " + posX +" "+ posY);
        }else{
            JOptionPane.showMessageDialog(null,"No se puede mover");
        }
    }

}
