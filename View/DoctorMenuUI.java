package View;
import java.util.Scanner;

public class DoctorMenuUI {
    public static void showDoctorMenu() {

        int response = 0;
        do {
            System.out.println("Doctor");
            System.out.println("Bienvenido " + HospitalUI.doctorLogged.getName());
            System.out.println(" 1. Citas disponibles");
            System.out.println(" 2. Mis citas");
            System.out.println(" 0. Cerrar sesión");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println(":: Libro de citas");
                    break;
                case 2:
                    System.out.println(":: Mis citas");
                    break;
                case 0:
                    HospitalUI.showMenu();
                    break;
                default:
                    System.out.println(" Seleccione una opcion correcta");
                    break;
            }
            
        } while (response != 0);
    }

    private static void showAddAvailableAppointmentMenu() {
        int response = 0;
        do {
            System.out.println();
            System.out.println(":: Agregrar cita disponible");
            System.out.println(":: Seleccionar mes");
            
            for (int i = 0; i < HospitalUI.MONTHS.length ; i++) {
                int j = i + 1;
                System.out.println(j + ". " + HospitalUI.MONTHS[i]);
            }

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            if (response > 0 && response < HospitalUI.MONTHS.length) {
                int monthSelected = response;
                System.out.println(monthSelected + ". " + HospitalUI.MONTHS[monthSelected]);

                System.out.println("Inserta la fecha disponible: [dd/mm/yyyy]");
                String date = sc.nextLine();

                System.out.println("Tu fecha es:" + date);
                System.out.println(" 1. Correcto");
                System.out.println(" 2. Cambiar");

            } else if (response == 0) {
                showDoctorMenu();
            }

        } while (response != 0);
    }
}
