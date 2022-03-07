package View;
import java.util.Scanner;

public class HospitalUI {

    public static final String[] MONTHS = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    public static void showMenu() {

        System.out.println();
        System.out.println("Bienvenido a mis citas");    
        System.out.println("Selecciona una opcion deseada");
        
        int response = 0;
        do {
            System.out.println(" 1. Doctor");
            System.out.println(" 2. Paciente");
            System.out.println(" 0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println(" Doctor");
                    break;
                case 2:
                    response = 0;
                    showPatientMenu();
                    break;
                case 0:
                    System.out.println(" Gracias por su visita");
                    break;
                default:
                    System.out.println(" Seleccione una opcion correcta");
                    break;
            }
            
        } while (response != 0);
    }

    public static void showPatientMenu() {

        int response = 0;
        do {
            System.out.println("Paciente");
            System.out.println(" 1. Libro de citas");
            System.out.println(" 2. Mis citas");
            System.out.println(" 0. Retornar a menu principal");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println(":: Libro de citas");
                    for (int i = 0; i < MONTHS.length; i++) {
                        System.out.println(" " + i + ". " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println(":: Mis citas");
                    break;
                case 0:
                    System.out.println(" Gracias por su visita");
                    break;
                default:
                    System.out.println(" Seleccione una opcion correcta");
                    break;
            }
            
        } while (response != 0);
    }

}


