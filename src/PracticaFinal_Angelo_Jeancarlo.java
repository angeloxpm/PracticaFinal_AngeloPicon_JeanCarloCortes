import java.util.Scanner;
public class PracticaFinal_Angelo_Jeancarlo {
    public static void main(String[] args) {
        menuPrincipal();
    }

    public static void menuPrincipal() {
        final String menuMessage = "Menú \n 1.|Pedir cita \n 2.|Ver cita \n 3.|Sortir";
        Scanner input = new Scanner(System.in);
        int opcio = 0;
        int selectedOption = 0;
        boolean control = false;
        String[] informacion = new String[3];
        opcio = input.nextInt();
        input.nextLine();

        do{
            selectedOption = control(menuMessage, selectedOption, control, 1,3);
            switch (selectedOption){
                case 1:
                    informacion=obtenerInformacion(input);
                    break;
                case 2:
                    mostrarInformacion(informacion);
                    break;
                case 3:
                    System.out.println("Adios");
                    break;
            }

        }while (selectedOption != 3);
    }
    public static int control(String Message, int num, boolean isInt, int MIN, int MAX){
        do{
            Scanner input = new Scanner(System.in);
            System.out.println(Message);
            isInt = input.hasNextInt();
            if(isInt){
                num = input.nextInt();
                input.nextLine();
                if(num < MIN || num > MAX){
                    System.out.println("Introduce un opcion valida");
                }
            }else{
                System.out.println("Introduce un numero entero");
                input.nextLine();
            }
        }while (!isInt || num < MIN || num > MAX);
        return num;
    }
    public static String[] obtenerInformacion(Scanner input) {
        String[] informacion = new String[3];

        // Control de errores del nombre
        do {
            System.out.print("Ingrese su nombre (máximo 15 caracteres): ");
            informacion[0] = input.nextLine();
        } while (informacion[0].length() > 15);

        // Control de errores del teléfono
        do {
            System.out.print("Ingrese su teléfono (mínimo 8 números enteros): ");
            informacion[1] = input.nextLine();
        } while (!informacion[1].matches("[0-9]{8}"));

        int opcion = 0;
        do {
            System.out.println("Seleccione una hora:");
            System.out.println("1. 9:00 AM");
            System.out.println("2. 12:00 PM");
            System.out.println("3. 3:00 PM");
            System.out.print("Ingrese una opción: ");
            opcion = input.nextInt();
        } while (opcion < 1 || opcion > 3);

        switch (opcion) {
            case 1:
                informacion[2] = "9:00 AM";
                break;
            case 2:
                informacion[2] = "12:00 PM";
                break;
            case 3:
                informacion[2] = "3:00 PM";
                break;
            default:
                informacion[2] = "";
        }
        Precios();
        return informacion;
    }

    public static void mostrarInformacion(String[] informacion) {
        System.out.println("La información ingresada es: ");
        System.out.println("Nombre: " + informacion[0]);
        System.out.println("Teléfono: " + informacion[1]);
        System.out.println("Hora elegida: " + informacion[2]);
    }
    public static void Precios() {
        System.out.println("Precios de cortes de pelo");
        System.out.println("1. Corte de pelo básico");
        System.out.println("2. Corte de pelo y lavado:");
        System.out.println("3. Realizar permanente");
        Scanner sc = new Scanner(System.in);
        System.out.print("Seleccione un número de opción para conocer el precio: ");
        int opcion = sc.nextInt();
        double precio = 0;
        switch (opcion) {
            case 1:
                precio = 10;
                System.out.println("El precio del corte es 10€.");
                break;
            case 2:
                precio = 20;
                System.out.println("El precio del corte de pelo y lavado es 20€.");
                break;
            case 3:
                precio= 30;
                System.out.println("El precio de la permanente es 30€.");
                break;
            default:
                System.out.println("La opción seleccionada no es válida.");
                break;
        }
        System.out.println("¿Con que deseas pagar?");
        System.out.println("1.Efectivo");
        System.out.println("2.Tarjeta");
        int metodo = sc.nextInt();
        switch (metodo) {
            case 1:
                metodo= 1;
                if (precio > 0) {
                    System.out.print("Ingrese el dinero del pago: ");
                    double pago = sc.nextDouble();
                    if (pago >= precio) {
                        double cambio = pago - precio;
                        System.out.printf("Pago recibido: %.2f%n", pago);
                        System.out.printf("Cambio: %.2f€n", cambio);
                        System.out.println("Gracias por su compra!");
                    } else {
                        System.out.println("El dinero es insuficiente.");
                    }
                }
                break;
            case 2:
                metodo = 2;
                System.out.println("El pago con tarjeta de crédito se ha realizado con éxito.");
                System.out.println("Gracias por su compra!");
                break;
            default:
                System.out.println("La opción seleccionada no es válida.");
                break;
        }

    }
}