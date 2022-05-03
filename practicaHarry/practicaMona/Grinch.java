package practicaMona;

public class Grinch extends Mona{

    String adornoCabeza;
    String ropa;

    public Grinch(String nombre, int id, String colorPiel, String colorCara, String colorOjos,
                 String adornoCabeza, String ropa) {
        super(nombre, id, colorPiel, colorCara, colorOjos);
        this.adornoCabeza = adornoCabeza;
        this.ropa = ropa;

    }

    @Override
    public String showMessage() {
        return super.showMessage() +
                "\nMe quiero robar la navidad y molestar a todos en villa quien" +
                "\nEn esta noche me voy a disfrazar con  \n" + adornoCabeza +
                ", " + ropa;
    }
}
