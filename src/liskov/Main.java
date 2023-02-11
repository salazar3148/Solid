package liskov;

public class Main {
    public static void main(String[] args) {
        Adulto andres = new Adulto("10014563218", "Andres", "Montoya", "409355004123978");
        Nino max = new Nino("Max", "Montoya", andres);

        System.out.println("Andres Paga:");
        andres.pagar();
        System.out.print("\n");
        System.out.println("Max Paga mediante un adulto responsable:");
        max.pagar();
    }
}
