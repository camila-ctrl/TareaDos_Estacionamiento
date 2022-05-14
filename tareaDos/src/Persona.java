public class Persona {
    String nombre;
    int cuentaCorriente = 0;

    public Persona(String string) {
        this.nombre = string;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCuentaCorriente() {
        return cuentaCorriente;
    }

    public void setCuentaCorriente(int cuentaCorriente) {
        this.cuentaCorriente += cuentaCorriente;
    }
}