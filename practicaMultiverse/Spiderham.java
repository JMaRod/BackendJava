package practicaMultiverse;

public class Spiderham extends Spiderman implements Movimiento{

    public Spiderham(String nombreHeroe, String nombre, int tierra){
        super(nombreHeroe, nombre, tierra);
    }

    @Override
    public String desplazamiento() {
        return"Llega a la batalla columpiandose con sus teleranias";
    }

    @Override
    public String ataque() {
        return"Lanza telaranias para enredar a sus enemigos";
    }

    @Override
    public String defensa() {
        return"Se defiende esquivando los ataques que detecta con su sentido " +
                "aracnido";
    }
}
