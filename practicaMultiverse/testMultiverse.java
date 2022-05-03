package practicaMultiverse;

public class testMultiverse {

    public static void main(String[] args) {

        spiderham();
        spiderwoman();
        spiderman958();

    }

    public static void spiderham(){

        Spiderham ham = new Spiderham("Spider-ham", "Peter Porker", 8311);
        System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(ham.showMessage());
        System.out.println("Movimiento 1");
        System.out.println(ham.desplazamiento());
        System.out.println("Movimiento 2");
        System.out.println(ham.ataque());
        System.out.println("Movimiento 3");
        System.out.println(ham.defensa());

    }

    public static void spiderwoman(){
        Spiderwoman woman = new Spiderwoman("Spider-woman", "Jessica Drew", 616);
        System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(woman.showMessage());
        System.out.println("Movimiento 1");
        System.out.println(woman.desplazamiento());
        System.out.println("Movimiento 2");
        System.out.println(woman.ataque());
        System.out.println("Movimiento 3");
        System.out.println(woman.defensa());

    }

    public static void spiderman958(){

        SpiderMan958 spider = new SpiderMan958("Spider-Man", "Peter Parker", 958);
        System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(spider.showMessage());
        System.out.println("Movimiento 1");
        System.out.println(spider.desplazamiento());
        System.out.println("Movimiento 2");
        System.out.println(spider.ataque());
        System.out.println("Movimiento 3");
        System.out.println(spider.defensa());
    }
}
