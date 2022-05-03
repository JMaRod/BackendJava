package practicaHarry;

public class testPersonaje {

    public static void main(String[] args) {

        neville();
        tom();
        lucius();
        padma();
        ginny();

    }

    public static void neville(){

    Personaje neville = new Personaje("Neville Longbottom", "Masculino", "Gryffindor",
                                "El profesor Severus Snape", "No corporeo");
        System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(neville.showMessage());

    }

    public static void tom(){

        Personaje tom = new Personaje();
        tom.setNombre("Tom Ryddle");
        tom.setGenero("Masculino");
        tom.setCasa("Slytherin");
        tom.setBoggart("Su propia muerte");
        tom.setPatronus("Serpiente");
        System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(tom.showMessage());

    }

    public static void lucius(){

        Personaje lucius = new Personaje("Lucius Malfoy", "Masculino", "Slytherin",
                                        "Lord Voldemort", "No tiene");
        System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(lucius.showMessage());

    }

    public static void padma(){

        Personaje padma = new Personaje();
        padma.setNombre("Padma Patil");
        padma.setGenero("Femenino");
        padma.setCasa("Gryffindor");
        padma.setBoggart("Cobra gigante");
        padma.setPatronus("Desconocido");
        System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(padma.showMessage());

    }

    public static void ginny(){

        Personaje ginny = new Personaje();
        ginny.setNombre("Ginny Weasley");
        ginny.setGenero("Femenino");
        ginny.setCasa("Gryffindor");
        ginny.setBoggart("Volver a ser controlada por Voldemort");
        ginny.setPatronus("Caballo");
        System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(ginny.showMessage());

    }
}
