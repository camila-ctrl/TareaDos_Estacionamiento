public class Main {
    public static void main(String args[]) {
        
        Estacionamiento.inicializar(2, 60, 180);
        
        Persona juan = new Persona("Juan");
        Persona ana = new Persona("Ana");
        Persona felipe = new Persona("Felipe");


        Auto juanAuto1 = new Auto(Auto.MERCEDEZ_BENZ, "BCF-235", juan);
        Auto anaAuto1 = new Auto(Auto.FIAT, "BRF-535", ana);
        Auto felipeAuto1 = new Auto(Auto.PEUGEOT, "BFD-124", felipe);
        Auto felipeAuto2 = new Auto(Auto.MERCEDEZ_BENZ, "BFD-125", felipe);

        
        Estacionamiento.entra(juanAuto1);
        Estacionamiento.entra(anaAuto1);

        // Estacionamiento.entra(felipeAuto1);
        
        // Estacionamiento.sale(juanAuto1);
        // Estacionamiento.nuevoDia();
        
        // Estacionamiento.entra(felipeAuto2);


        // Estacionamiento.entra(juanAuto1);


        Estacionamiento.calcular();        
        
    }
}