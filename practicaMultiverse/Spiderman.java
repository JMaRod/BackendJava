package practicaMultiverse;

public class Spiderman {

    String nombreHeroe;
    String nombre;
    int tierra;

    public Spiderman(){}
    public Spiderman (String nombreHeroe, String nombre, int tierra){
        this.nombreHeroe = nombreHeroe;
        this.nombre = nombre;
        this.tierra = tierra;
    }

    public boolean setNombreHeroe(String nombreHeroe){
        if (!nombreHeroe.isEmpty()) {
            this.nombreHeroe = nombreHeroe;
            return true;
        }
        return false;
    }

    public boolean setNombre(String nombre){
        if (!nombre.isEmpty()) {
            this.nombre = nombre;
            return true;
        }
        return false;
    }

    public boolean setTierra(int tierra){
        if (tierra >= 0) {
            this.tierra = tierra;
            return true;
        }
        return false;
    }

    public String getNombreHeroe(){ return nombreHeroe; }
    public String getNombre(){ return nombre; }
    public int getTierra(){ return tierra; }

    public String showMessage (){
        return "\n" + nombreHeroe + " pertenece a tierra " + tierra +
                "\nSu verdadero nombre es  " + nombre;
    }

}
