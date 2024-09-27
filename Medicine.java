package Lab_Assesment;

public class Medicine {
    private String medicineID;
    private String medicineName;
    private String batchNumber;
    private String manufacturer;
    private int quantity;
    private double price;

    public Medicine() {
        this.medicineID = "";
        this.medicineName = "";
        this.batchNumber = "";
        this.manufacturer = "";
        this.quantity = 0;
        this.price = 0;
    }

    private Date expiryDate;

    public String getMedicineID() {
        return medicineID;
    }

    public void setMedicineID(String medicineID) {
        this.medicineID = medicineID;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Medicine(String medicineID, String medicineName, String batchNumber, String manufacturer, int quantity, double price, Date expiryDate) {
        this.medicineID = medicineID;
        this.medicineName = medicineName;
        this.batchNumber = batchNumber;
        this.manufacturer = manufacturer;
        this.quantity = quantity;
        this.price = price;
        this.expiryDate = expiryDate;
    }
    public void displayMedicine() {
        System.out.println("Medicine ID: " + this.medicineID);
        System.out.println("Medicine Name: " + this.medicineName);
        System.out.println("Batch Number: " + this.batchNumber);
        System.out.println("Manufacturer: " + this.manufacturer);
        System.out.println("Quantity: " + this.quantity);
        System.out.println("Price: " + this.price);
        System.out.println("Expiry Date: " + this.expiryDate);

    }

    @Override
    public boolean equals(Object obj) {
        Medicine temp = (Medicine)obj;
        return temp.getMedicineID().equals(this.getMedicineID());
    }
}
