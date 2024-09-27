package Lab_Assesment;

public class Person {
    private String name;
    private String contact;

    public Person(String contact, String name) {
        this.contact = contact;
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Contact: " + contact);
    }
}