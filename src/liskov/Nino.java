package liskov;

public class Nino extends Persona{
    private Adulto acudiente;
    public Nino(String nombre, String apellidos, Adulto acudiente) {
        super(nombre, apellidos);
        this.acudiente = acudiente;
    }
    @Override
    public void pagar() {
        this.acudiente.pagar();
    }
}
