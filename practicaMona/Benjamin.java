package practicaMona;

public class Benjamin extends Mona{

    String adornoCabeza;
    String ropa;
    String accesorio;

    public Benjamin(String nombre, int id, String colorPiel, String colorCara, String colorOjos,
                    String adornoCabeza, String ropa, String accesorio){
        super(nombre, id, colorPiel, colorCara, colorOjos);
        this.adornoCabeza = adornoCabeza;
        this.ropa = ropa;
        this.accesorio = accesorio;
    }

    @Override
    public String showMessage() {
        return super.showMessage() +
                "\nSoy muy curioso y me gusta explorar el cielo, para eso " +
                "\nuso mi " + accesorio + ", me gusta vestirme bien con mi " + ropa +
                "\ny en la cabeza me pongo mi linda " + adornoCabeza;
    }
}
