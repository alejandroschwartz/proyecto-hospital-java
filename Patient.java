public class Patient {

    static int globalId = 1;
    private int id;
    private String name;
    private String email;
    private String address; 
    private String phoneNumber;
    private String birthday; 
    private double weight;
    private double height;
    private String blood;

    Patient(String name, String email, double weight, double height) {
        this.id = globalId++;
        this.name = name;
        this.email = email;
        this.weight = weight;
        this.height = height;
    }
}
