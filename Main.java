import java.util.Date;
import Model.Doctor;
import Model.Patient;
// import View.HospitalUI;

public class Main {

    public static void main(String[] args) {

        Doctor myDoctor0 = new Doctor("Juliana", "juli@mail.com", "Clinico");
            myDoctor0.addAvailableAppointment(new Date(), "9:00 am");
            myDoctor0.addAvailableAppointment(new Date(), "11:00 am");
            myDoctor0.addAvailableAppointment(new Date(), "4:00 pm");
        Doctor myDoctor1 = new Doctor("Delfi", "delfi@mail.com", "Clinico");
        Doctor myDoctor2 = new Doctor("Angela", "angela@mail.com", "Clinico");
        myDoctor0.showDataUser();
        
        System.out.println();
        System.out.println(myDoctor0);
        System.out.println(myDoctor1);
        System.out.println(myDoctor2);

        Patient patient0 = new Patient("Alejandro", "ale@mail.com", "Posadas", "03513022", "06/07/93", 74, 1.95, "RH+");
        Patient patient1 = new Patient("Jorge", "jorge@mail.com");
        Patient patient2 = new Patient("Juan", "juan@mail.com");
        
        System.out.println();
        System.out.println(patient0);
        System.out.println(patient1);
        System.out.println(patient2);
 
        // HospitalUI.showMenu();
    }

}