package practicaMona;

public class Storm extends Mona{

    String disfraz;
    String accesorio;

    public Storm(String nombre, int id, String disfraz, String accesorio){
        super.setNombre(nombre);
        super.setId(id);
        this.disfraz = disfraz;
        this.accesorio = accesorio;
    }

    @Override
    public String showMessage() {
        return "\nMi nombre es: \t" + nombre +
                "\nMi id es: \t\t" + id +
                "\nEsos son todos lo datos que te puedo dar, si quieres algo mas" +
                "\nse lo puede preguntar al jefe Darth Vader directamente,"+
                "\ncomo un soldado " + disfraz + " siempre llevo mi " + accesorio;
    }
}
