package liskov;

public class Adulto extends Persona{

    private String cedula;
    private String tarjeta;
    public Adulto(String cedula, String nombre, String apellidos, String tarjeta) {
        super(nombre, apellidos);
        this.cedula = cedula;
        this.tarjeta = tarjeta;
    }
    @Override
    public void pagar() {
        System.out.println("Mi cedula es: "+ cedula + ", pago con la tarjeta: " + tarjeta);
    }
}
