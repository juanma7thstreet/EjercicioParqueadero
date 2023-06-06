import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Parqueadero parqueadero = new Parqueadero();

        int opcion = 0;

        while (opcion != 7) {

            System.out.println("\n1. Ingresar un carro al parqueadero");
            System.out.println("2. Dar salida a un carro del parqueadero");
            System.out.println("3. Informar los ingresos del parqueadero");
            System.out.println("4. Consultar la cantidad de puestos disponibles");
            System.out.println("5. Avanzar el reloj del parqueadero");
            System.out.println("6. Cambiar la tarifa del parqueadero");
            System.out.println("7. Salir");
            System.out.println("Seleccione una opción:\n");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Ingresa un carro al parqueadero
                    System.out.println("Ingrese la placa del carro:");
                    String placa = scanner.next();
                    System.out.println("Ingrese la hora de llegada del carro:");
                    int horaLlegada = scanner.nextInt();

                    Carro carro = new Carro(placa, horaLlegada);
                    parqueadero.entrarCarro(placa);
                    System.out.println("Carro ingresado al parqueadero.");
                    break;

                case 2:
                    // Da salida a un carro del parqueadero
                    System.out.println("Ingrese la placa del carro:");
                    String placaSalida = scanner.next();

                    parqueadero.sacarCarro(placaSalida);
                    System.out.println("Carro retirado del parqueadero.");
                    break;

                case 3:
                    // Informa los ingresos del parqueadero
                    int ingresos = parqueadero.darMontoCaja();
                    System.out.println("Ingresos del parqueadero: $ " + ingresos);
                    break;

                case 4:
                    // Consulta la cantidad de puestos disponibles
                    int puestosDisponibles = parqueadero.calcularPuestosLibres();
                    System.out.println("Puestos disponibles: " + puestosDisponibles);
                    break;

                case 5:
                    // Avanza el reloj del parqueadero
                    parqueadero.avanzarHora();
                    System.out.println("Reloj del parqueadero avanzado.");
                    break;

                case 6:
                    // Cambia la tarifa del parqueadero
                    System.out.println("Ingrese la nueva tarifa del parqueadero:");
                    int nuevaTarifa = scanner.nextInt();
                    parqueadero.cambiarTarifa(nuevaTarifa);
                    System.out.println("Tarifa del parqueadero cambiada.");
                    break;

                case 7:
                    // Sale del programa

                    break;

                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida del menú.");
                    break;
            }
        }
    }
}