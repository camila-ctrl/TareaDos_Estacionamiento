//INTEGRANTES: Mathias Sellanes y Camila Pérez
public class Auto {
    static final String CHEVROLET = "CHEVROLET";
    static final String FIAT = "FIAT";
    static final String PEUGEOT = "PEUGEOT";
    static final String FORD = "FORD";
    static final String BMW = "BMW";
    static final String AUDI = "AUDI";
    
    String marca;
    String placa;
    Persona propietario;

    public Auto(String marca, String placa, Persona propietario) {
        this.marca = marca;
        this.placa = placa;
        this.propietario = propietario;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
	public String getPlaca() {
        return placa;
    }
    
	public void setPlaca(String placa) {
        this.placa = placa;
    }
    
	public Persona getPropietario() {
        return propietario;
    }
    
	public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

}
