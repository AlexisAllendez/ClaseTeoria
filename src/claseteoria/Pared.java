package claseteoria;

public class Pared {

    private int posX;
    private int posY;

    public Pared() {
        posX=(int)(Math.random()*80);
        posY=(int)(Math.random()*22);
        
        System.out.println("Posicion de la pared " + posX +" , " + posY);
        
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

}
