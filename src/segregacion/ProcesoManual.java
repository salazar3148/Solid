package segregacion;

public class ProcesoManual implements Proceso, ProcesoFuncion{
    @Override
    public void Iniciar() {
        System.out.println("Iniciando Proceso...");
    }
    @Override
    public void Suspender() {
        System.out.println("Suspendiendo Proceso");
    }

    @Override
    public void Reanudar() {
        System.out.println("Reanudando Proceso");
    }
    @Override
    public void Finalizar() {
        System.out.println("Finalizando Proceso...");
    }
}
