package Lab_Assesment;

public class PharmacyShop {
    private Address address;
    private Medicine[] medicine;
    private int medicineCount;
    private Person owner;

    public Medicine[] getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine[] medicine) {
        this.medicine = medicine;
    }

    public PharmacyShop(Address address, Medicine[] medicine, int medicineCount, Person owner) {
        this.address = address;
        this.medicine = medicine;
        this.medicineCount = medicineCount;
        this.owner = owner;
    }

    {
        medicine[0]=new Medicine("M001","Paracetamol"," B123","PharmaCorp",
                100, 50.0, new Date(15,8,2024));
        medicine[1]=new Medicine("M002","Ibuprofen"," B124","HealthMed",
                80, 75.0, new Date(10,12,2024));
        medicine[2]=new Medicine("M003","Amoxicillin"," B125","BioPharma",
                80, 280.0, new Date(10,12,2026));
        medicine[3]=new Medicine("M004","Amoxicillin"," B126","MedLife",
                60, 120.0, new Date(9,12,2027));
        medicine[4]=new Medicine("M005","Metformin"," B127","GlucoCare",
                70, 65.0, new Date(3,8,2027));

    }
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getMedicineCount() {
        return medicineCount;
    }

    public void setMedicineCount(int medicineCount) {
        this.medicineCount = medicineCount;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public void searchMedicineById(String ID){
for(int i = 0; i < medicine.length; i++){
    boolean b = medicine[i].getMedicineID().equals(ID);
    if(b){
        System.out.println("Medicine Found");
    }
    else
        System.out.println("Not Found");
}
    }
    public void updateMedicine(String name){

    }
    public void searchMedicineByName(String name) {

    }
    public void printTotalRevenue(){

    }
    public void findExpiredMedicine(Date date){

    }
    public void removeMedicine(String name){

    }
    public void sellMedicine(String name,int quantity){

    }
    public void addMedicine(Medicine medicine){

    }
    public void displayMedicine(){

    }

}
