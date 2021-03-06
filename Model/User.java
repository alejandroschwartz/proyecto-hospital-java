package Model;

public abstract class User {
    
    static int globalId = 1;
    private int id;
    private String name;
    private String email;
    private String address; 
    private String phoneNumber;

    public User(String name, String email) {
        this.id = globalId++;
        this.name = name;
        this.email = email;
    }
    public User(String name, String email, String address, String phoneNumber) {
        this.id = globalId++;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.length() > 7) {
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("Debe contener almenos 8 dijitos");
        }
    }



    @Override
    public String toString() {
        return "Nombre: " + name + ", Mail: " + email + ", Dirección: " + address + ", Telefono: " + phoneNumber;
    }
    // @Override
    // public String toString() {
    //     return "model.User: " + name + ", Email: "+email+
    //             "\nAddreess: "+address+". Phone: "+phoneNumber;
    // }

    public abstract void showDataUser();


}
