package practicaMultiverse;

public class Spiderwoman extends Spiderman implements Movimiento{

    public Spiderwoman(String nombreHeroe, String nombre, int tierra){
        super(nombreHeroe, nombre, tierra);
    }

    @Override
    public String desplazamiento() {
        return"Llega al combate volando";
    }

    @Override
    public String ataque() {
        return"Ataca con su rayo venenoso, con lo que deja a sus enemigos aturdidos ";
    }

    @Override
    public String defensa() {
        return"Confunde a sus enemigos usando sus feromonas";
    }
}
