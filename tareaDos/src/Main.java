public class Main {
    public static void main(String args[]) {
        
        Estacionamiento.inicializar("AparClic", 8, 60, 180);
        
        Persona juan = new Persona("Juan");
        Persona ana = new Persona("Ana");
        Persona felipe = new Persona("Felipe");


        Auto juanAuto1 = new Auto(Auto.CHEVROLET, "BCF-235", juan);
        Auto anaAuto1 = new Auto(Auto.FIAT, "BRF-535", ana);
        Auto felipeAuto1 = new Auto(Auto.PEUGEOT, "BFD-124", felipe);
        Auto felipeAuto2 = new Auto(Auto.CHEVROLET, "BFD-125", felipe);

        
        Estacionamiento.entra(juanAuto1);
        Estacionamiento.entra(anaAuto1);

        // Estacionamiento.sale(juanAuto1);
        // Estacionamiento.sale(anaAuto1);
        
        // Estacionamiento.calcular();        

        Estacionamiento.entra(felipeAuto1);
        Estacionamiento.nuevoDia();
        Estacionamiento.entra(felipeAuto2);
        

        Estacionamiento.calcular();        

        
        // Estacionamiento.nuevoDia();
        




        
    }
}