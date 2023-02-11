package segregacion;

public class Main {
    public static void main(String[] args) {
        ProcesoAutomatizado procesoAutomatizado = new ProcesoAutomatizado();
        procesoAutomatizado.Iniciar();
        procesoAutomatizado.Finalizar();
        System.out.print("\n");
        ProcesoManual procesoManual = new ProcesoManual();
        procesoManual.Iniciar();
        procesoManual.Suspender();
        procesoManual.Reanudar();
        procesoManual.Finalizar();
    }
}
