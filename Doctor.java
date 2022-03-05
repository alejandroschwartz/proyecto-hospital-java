public class Doctor {

    static int globalId = 1;
    int id;
    String name;
    String email;
    String speciality;

    Doctor(String name, String email, String speciality) {
        this.id = globalId++;
        this.name = name;
        this.email = email;
        this.speciality = speciality;
    }

    public void showName() {
        System.out.println(id + ",  Nom: " + name + ",  Esp: " + speciality);
    }

}
