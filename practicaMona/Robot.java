package practicaMona;

public class Robot extends Mona{

    public Robot(String nombre, int id, String coloPiel, String colorCara, String colorOjos){
        super(nombre, id, coloPiel, colorCara, colorOjos);
    }

    @Override
    public String showMessage() {

        return super.showMessage() +
                "\nSoy un octocat tipo robot y estoy programado para conquistar" +
                "\na los humanos, jajajaja, no es cierto me programaron para " +
                "\nhacerte reir, espero que nos la pasemos bien juntos";
    }
}
