
import java.util.ArrayList;

public class Estacionamiento {
    static int cantLugares;
    static int precioIngreso;
    static int precioNoche;
    static ArrayList<Auto> lugares;

    static void inicializar(int cantLugares, int precioIngreso, int precioNoche) {
        Estacionamiento.cantLugares = cantLugares;
        Estacionamiento.precioIngreso = precioIngreso;
        Estacionamiento.precioNoche = precioNoche;

        Estacionamiento.lugares = new ArrayList(cantLugares);
        System.out.println("--------------------------------------------");
        System.out.println("¡Bienvenido al estacionamiento!");
        System.out.println("--------------------------------------------");
        System.out.println("Propiedades del estacionamiento:");
        System.out.println("- Cantidad de lugares disponibles: " + Estacionamiento.cantLugares);
        System.out.println("- Precio de ingreso: " + Estacionamiento.precioIngreso);
        System.out.println("- Precio de noche: " + Estacionamiento.precioNoche);
        System.out.println("--------------------------------------------");
        System.out.println("");
    }

    static void entra(Auto auto) {
        if (Estacionamiento.lugares.size() < Estacionamiento.cantLugares) {
            Estacionamiento.lugares.add(auto);
            auto.getPropietario().setCuentaCorriente(Estacionamiento.precioIngreso);

            System.out.println("¡NUEVO CLIENTE!");
            System.out.println("El auto de " + auto.getPropietario().getNombre() + " con placa " + auto.getPlaca() + " ha entrado al estacionamiento.");
            System.out.println("");

        } else {
            System.out.println("NO HAY LUGARES DISPONIBLES");
            System.out.println("El auto de " + auto.getPropietario().getNombre() + " con placa " + auto.getPlaca() + " no ha podido ingresar al estacionamiento.");
            System.out.println("");

        }
    }

    static void sale(Auto auto) {
        lugares.remove(auto);
        System.out.println("¡NOS VEMOS PRONTO " + auto.getPropietario().getNombre() + "!");
        System.out.println("El auto de " + auto.getPropietario().getNombre() + " con placa " + auto.getPlaca() + " ha salido del estacionamiento");
        System.out.println("");

    }

    static void nuevoDia() {
        System.out.println("--------------------------------------------");
        System.out.println("             ¡Nuevo día!");
        System.out.println("--------------------------------------------");

        System.out.println("Encontramos en la noche a:");                 
        for(Auto auto: lugares) {
            System.out.println(auto.getPlaca() + " - " + auto.getPropietario().getNombre());
            auto.getPropietario().setCuentaCorriente(Estacionamiento.precioNoche);
        }
    }

    static void calcular() {
        for (Auto auto : lugares) {
            System.out.println("El cliente " + auto.getPropietario().getNombre() + " debe " + auto.getPropietario().getCuentaCorriente() + " pesos");
        }
    }
}