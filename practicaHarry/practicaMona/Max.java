package practicaMona;

public class Max extends Mona{

    String adornoCabeza;

    public Max(String nombre, int id, String coloPiel, String colorCara, String colorOjos,
               String adornoCabeza) {
        super(nombre, id, coloPiel, colorCara, colorOjos);
        this.adornoCabeza = adornoCabeza;
    }

    @Override
    public String showMessage() {
        return super.showMessage() +
                "\nSoy un octocat que le gusta ponerse un " + adornoCabeza +
                "\nen la cabeza y caminar con las manos en lugar de los pies";
    }
}
