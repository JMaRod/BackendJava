package practicaMultiverse;

public class SpiderMan958 extends Spiderman implements Movimiento{

    public SpiderMan958(String nombreHeroe, String nombre, int tierra){
        super(nombreHeroe, nombre, tierra);
    }

    @Override
    public String desplazamiento() {
        return"Llega a la batalla apoyanose en sus extremidades roboticas";
    }

    @Override
    public String ataque() {
        return"Ataca a sus oponentes con sus extremidades roboticas";
    }

    @Override
    public String defensa() {
        return"Genera una onda sonica para aturdir a sus oponentes";
    }
}
