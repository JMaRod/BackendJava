package practicaMona;

public class Miner extends Mona{

    String adornoCabeza;
    String ropa;
    String accesorio;

    public Miner(String nombre, int id, String colorPiel, String colorCara, String colorOjos,
                 String adornoCabeza, String ropa, String accesorio) {
        super(nombre, id, colorPiel, colorCara, colorOjos);
        this.adornoCabeza = adornoCabeza;
        this.ropa = ropa;
        this.accesorio = accesorio;

    }

    @Override
    public String showMessage() {
        return super.showMessage() +
                "\nMe gusta explorar las cuevas en busca de tesoros" +
                "\nPara poder realizar mi activadad me preparo bien con un \n" + adornoCabeza +
                ", " + ropa + " y mi pepita de " + accesorio + " de la suerte";
    }
}
