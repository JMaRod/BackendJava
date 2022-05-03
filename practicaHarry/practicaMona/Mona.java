package practicaMona;


public class Mona {

    String nombre;
    int id;
    String colorPiel;
    String colorCara;
    String colorOjos;


    public Mona(){}

    public Mona(String nombre, int id, String colorPiel, String colorCara, String colorOjos){

        this.nombre = nombre;
        this.id = id;
        this.colorPiel = colorPiel;
        this.colorCara = colorCara;
        this.colorOjos = colorOjos;

    }

    public String getNombre(){ return nombre; }
    public int getId(){ return id; }
    public String getColorPiel(){ return colorPiel; }
    public String getColorCara(){ return colorCara; }
    public String getColorOjos(){ return colorOjos; }

    public boolean setNombre(String nombre){

        if (!nombre.isEmpty()) {
            this.nombre = nombre;
            return true;
        }
        return false;
    }

    public boolean setId(int id){

        if ( id >= 1 ){
            this.id = id;
            return  true;
        }
        return false;
    }

    public boolean setColorPiel(String colorPiel){

        if (!colorPiel.isEmpty()) {
            this.colorPiel = colorPiel;
            return true;
        }
        return false;
    }

    public boolean setColorCara(String colorCara){

        if (!colorCara.isEmpty()) {
            this.colorCara = colorCara;
            return true;
        }
        return false;
    }

    public boolean setColorOjos(String colorOjos){

        if (!colorOjos.isEmpty()) {
            this.colorOjos = colorOjos;
            return true;
        }
        return false;
    }

    public String showMessage(){

        return ("\nHola soy el Octocat: \t" + nombre +
                            "\nMi id es: \t\t\t\t" + id +
                            "\nMi piel es de color: \t" + colorPiel +
                            "\nMi cara es de color: \t" + colorCara +
                            "\nMis ojos son color: \t" + colorOjos);
    }
}
