
import java.util.ArrayList;

public class Estacionamiento {
    static String nombre;
    static int cantLugares;
    static int precioIngreso;
    static int precioNoche;
    static ArrayList<Auto> lugares = new ArrayList<Auto>();
    static ArrayList<Persona> clientes = new ArrayList<Persona>();

    static void inicializar(String nombre, int cantLugares, int precioIngreso, int precioNoche) {
        Estacionamiento.nombre = nombre;
        Estacionamiento.cantLugares = cantLugares;
        Estacionamiento.precioIngreso = precioIngreso;
        Estacionamiento.precioNoche = precioNoche;

        System.out.println("───────────────────────────────────────────────────────────");
        System.out.println("¡Bienvenido al estacionamiento: " + Estacionamiento.nombre + "!");
        System.out.println("───────────────────────────────────────────────────────────");
        System.out.println("Características de " + Estacionamiento.nombre + ":");
        System.out.println("- Cantidad de lugares disponibles: " + Estacionamiento.cantLugares);
        System.out.println("- Precio de ingreso: " + Estacionamiento.precioIngreso);
        System.out.println("- Precio de noche: " + Estacionamiento.precioNoche);
        System.out.println("────────────────────────────────────────────────────────────");
        System.out.println("");
    }

    static void entra(Auto auto) {
        if (lugares.contains(auto)) {
            System.out.println("Detectamos algo raro... el auto con placa " + auto.getPlaca()
                    + " está intentando entrar, pero ya está dentro del estacionamiento :O ");
            System.out.println("");
        } else {

            if (Estacionamiento.lugares.size() < Estacionamiento.cantLugares) {
                Estacionamiento.lugares.add(auto);
                if (!clientes.contains(auto.getPropietario())) {
                    Estacionamiento.clientes.add(auto.getPropietario());
                }
                auto.getPropietario().setCuentaCorriente(Estacionamiento.precioIngreso);
                System.out.println("¡NUEVO CLIENTE!");
                System.out.println("El auto de " + auto.getPropietario().getNombre() + " (placa: " + auto.getPlaca()
                        + ") ha entrado al estacionamiento.");
                System.out.println("(Lugares ocupados: " + Estacionamiento.lugares.size() + " / "
                        + Estacionamiento.cantLugares + ")");
                System.out.println("");

            } else {
                System.out.println("NO HAY LUGARES DISPONIBLES");
                System.out.println("El auto de " + auto.getPropietario().getNombre() + " (placa: " + auto.getPlaca()
                        + ") no ha podido ingresar al estacionamiento.");
                System.out.println("");

            }
        }
    }

    static void sale(Auto auto) {
        if (lugares.contains(auto)) {
            lugares.remove(auto);
            System.out.println("¡NOS VEMOS PRONTO " + auto.getPropietario().getNombre() + "!");
            System.out.println("El auto de " + auto.getPropietario().getNombre() + " (placa: " + auto.getPlaca()
                    + ")  ha salido del estacionamiento.");
            System.out.println("");
        } else {
            System.out.println("Detectamos algo raro... el auto con placa " + auto.getPlaca()
                    + " está intentando salir, pero no está dentro del estacionamiento :O ");
            System.out.println("");
        }

    }

    static void nuevoDia() {
        System.out.println("────────────────────────────────────────────────────────────");
        System.out.println("¡Nuevo día!");
        System.out.println("────────────────────────────────────────────────────────────");
        if (lugares.size() != 0) {
            System.out.println("Los autos que están dentro del estacionamiento son:");
            for (Auto auto : lugares) {
                System.out.println(
                        "-> Placa: " + auto.getPlaca() + " - Propietario: " + auto.getPropietario().getNombre());
                auto.getPropietario().setCuentaCorriente(Estacionamiento.precioNoche);
            }
            System.out.println("────────────────────────────────────────────────────────────");
            System.out.println("");
        }
    }

    static void calcular() {
        if (clientes.size() == 0) {
            System.out.println("────────────────────────────────────────────────────────────");
            System.out.println("");
            System.out.println("Sentimos informarle que...");
            System.out.println("No tuvo clientes en el estacionamiento en ningun momento.");
            System.out.println("¡Le deseamos suerte en la próxima!");
            System.out.println("");
            System.out.println("────────────────────────────────────────────────────────────");
            System.out.println("");
        } else {
            System.out.println("");
            System.out.println("────────────────────────────────────────────────────────────");
            System.out.println("¡Hora del reporte de sus clientes!");
            System.out.println("────────────────────────────────────────────────────────────");
            for (Persona cliente : clientes) {
                System.out.println(
                        "- El cliente " + cliente.getNombre() + " debe " + cliente.getCuentaCorriente() + " pesos");
            }
            System.out.println("────────────────────────────────────────────────────────────");
            System.out.println("");
        }
    }
}