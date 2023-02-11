package segregacion;

import jdk.jshell.spi.ExecutionControl;

public class ProcesoAutomatizado implements Proceso {

    @Override
    public void Iniciar() {
        System.out.println("Iniciando proceso automatizado..,");
    }

    @Override
    public void Finalizar() {
        System.out.println("Finalizando proceso automatizado");
    }
}
