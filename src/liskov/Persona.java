package liskov;

public abstract class Persona {
    private String nombre;
    private String apellidos;
    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    public abstract void pagar();
}
