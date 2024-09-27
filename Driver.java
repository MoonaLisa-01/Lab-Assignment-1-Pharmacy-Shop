package Lab_Assesment;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Pharmacy shop");
        System.out.println("Enter 1 to display menu");
        int option = input.nextInt();
        while (option !=9) {
            System.out.println("Please select one of the following options: ");
            System.out.println("1.Add a new medicine.");
            System.out.println("2.Update existing medicine details.");
            System.out.println("3.Remove a medicine from the inventory.");
            System.out.println("4.Sell a medicine (reduce quantity and calculate revenue).");
            System.out.println("5.Display all available medicines.");
            System.out.println("6.Search for a medicine by ID or name.");
            System.out.println("7.Print total revenue from sales.");
            System.out.println("8.Identify and list expired medicines based on the current date.");
            System.out.println("9.Exit");
        }
        Person P = new Person("0853478-7328", "Haider");
        Address A = new Address("street-2","lahore","8349");
        Date d;
        Medicine m = new Medicine();
//        PharmacyShop p = new PharmacyShop(A,m,12,P);
//    if(option==1){
//        p.addMedicine(m);
//    } else if (option==2) {
//        System.out.println("Enter the medicine you wanted to update");
//        p.updateMedicine(input.nextLine());
//    }
    }

}
