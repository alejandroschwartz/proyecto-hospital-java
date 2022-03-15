package View;
import Model.Doctor;
import Model.Patient;
import java.util.ArrayList;
import java.util.Scanner;

public class HospitalUI {

    public static final String[] MONTHS = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    public static Doctor doctorLogged;
    public static Patient patientLogged;

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
                    response = 0;
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    authUser(2);
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

    private static void authUser(int userType) {
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Juliana", "juli@mail.com", "Endocrinología"));
        doctors.add(new Doctor("Delfina", "delfi@mail.com", "Clínico"));
        doctors.add(new Doctor("Angela", "angi@mail.com", "Pediatra"));
    
        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Alejandro", "ale@email.com", "Posadas", "03513022", "06/07/93", 74, 1.95, "RH+"));
        patients.add(new Patient("Jorge", "jorgito@email.com"));
        patients.add(new Patient("Juan Cruz", "juan@email.com"));

        boolean emailCorrect = false;
        do {
            System.out.println("Insert your email: [ale@email.com]");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            if(userType == 1) {
                for (Doctor d: doctors) {
                    if (d.getEmail().equals(email)) {
                        emailCorrect= true;
                        doctorLogged = d;
                    }
                }
            } else if (userType == 2) {
                for (Patient p: patients) {
                    if (p.getEmail().equals(email)) {
                        emailCorrect= true;
                        patientLogged = p;
                        showPatientMenu();
                    }
                }
            }

        } while (!emailCorrect);
    }

}
