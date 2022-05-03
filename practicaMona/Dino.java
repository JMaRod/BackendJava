package practicaMona;

public class Dino extends Mona{

    String disfraz;

    public Dino(String nombre, int id, String coloPiel, String colorCara, String colorOjos,
                String disfraz){
        super(nombre, id, coloPiel, colorCara, colorOjos);
        this.disfraz=disfraz;
    }

    @Override
    public String showMessage() {
        return super.showMessage() +
                "\nMe gusta usar mi " + disfraz + "para jugar a que soy" +
                "\nun gran animal que destruye todo a su paso";
    }
}
