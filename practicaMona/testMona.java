package practicaMona;

public class testMona {

    public static void main(String[] args) {

        miner();
        grinch();
        max();
        dino();
        benjamin();
        robot();
        storm();

    }

    public static void miner(){

        Miner miner = new Miner("Minertocat", 115, "negro", "crema", "cafe",
                "sombrero vaquero", "overol", "oro");
        System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(miner.showMessage());

    }

    public static void grinch(){

        Grinch grinch = new Grinch("Grinchtocat", 109, "verde", "verde", "rojo",
                                "sombrero rojo", "chaleco de navidad");
        System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(grinch.showMessage());
    }

    public static void max(){

        Max max = new Max("Maxtocat", 108, "cafe claro", "crema", "cafe",
                "rama de arbol adornada");
        System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(max.showMessage());

    }

    public static void dino(){

        Dino dino = new Dino("Dinotocat", 128, "negro", "crema", "cafe",
                             "Disfraz de dinosaurio");
        System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(dino.showMessage());
    }

    public static void benjamin(){

        Benjamin benjamin = new Benjamin("Benjamin Bannekat", 127, "obscura", "obscura", "negro",
                                         "peluca blanca", "traje formal antiguo", "telescopio");
        System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(benjamin.showMessage());
    }

    public static void  robot(){

        Robot robot = new Robot("Robotocat", 92, "gris", "gris", "azules");
        System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(robot.showMessage());
    }

    public static void storm() {

        Storm storm = new Storm("Stormtroopcat", 84, "Stroomtroper", "pistola laser");
        System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(storm.showMessage());

    }
}
