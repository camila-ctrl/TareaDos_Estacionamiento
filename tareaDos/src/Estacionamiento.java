
import java.util.ArrayList;

public class Estacionamiento {
    static int cantLugares;
    static int precioIngreso;
    static int precioNoche;
    static String[] disponibilidad; // Array del estado de los lugares
    static ArrayList<Auto> autosIngresados = new ArrayList<Auto>(); // Array de los propietarios de los lugares

    static void inicializar(int cantLugares, int precioIngreso, int precioNoche) {
        Estacionamiento.cantLugares = cantLugares;
        Estacionamiento.precioIngreso = precioIngreso;
        Estacionamiento.precioNoche = precioNoche;
        Estacionamiento.disponibilidad = new String[cantLugares];
    }

    static void entra(Auto auto) {
        for (int i = 0; i < cantLugares; i++) {
            if (disponibilidad[i] == null) {
                disponibilidad[i] = auto.getPlaca();
                autosIngresados.add(auto);
                auto.propietario.cuentaCorriente += precioIngreso;
                System.out.println("El auto de " + auto.getPropietario().getNombre() + " con placa " + auto.getPlaca()
                        + " se ha entrado al estacionamiento");
                break;
            } else {

            }
        }
    }

    static void sale(Auto auto) {
        for (int i = 0; i < cantLugares; i++) {
            if (auto.placa.equals(disponibilidad[i])) {
                disponibilidad[i] = null;
                autosIngresados.remove(auto);
                System.out.println("El auto de " + auto.getPropietario().getNombre() + " con placa " + auto.getPlaca()
                        + " se ha salido del estacionamiento");
                break;
            }
        }
    }

    static void nuevoDia() {
        for (int i = 0; i < cantLugares; i++) {
            if (disponibilidad[i] != null) {
                for (Auto auto : autosIngresados) {
                    if(auto.placa.equals(disponibilidad[i])) {
                        auto.propietario.cuentaCorriente += precioNoche;
                        System.out.println("La cuenta corriente de " + auto.getPropietario().getNombre() + " con placa " + auto.getPlaca()
                                + " se ha actualizado" + " a " + auto.propietario.cuentaCorriente);
                    }
                }
            }
        }
    }

    static void calcular() {
        for (Auto auto : autosIngresados ) {
            System.out.println("La cuenta corriente de " + auto.getPropietario().getNombre() + " con placa " + auto.getPlaca() + " es " + auto.propietario.cuentaCorriente);
        }
    }
}