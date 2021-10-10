public class Phone {
    private String serialNumber;
    private double price;
    private PhoneSpec phoneSpec;

    Phone(String serialNumber, double price, PhoneSpec phoneSpec){
        this.serialNumber=serialNumber;
        this.price=price;
        this.phoneSpec=phoneSpec;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public PhoneSpec getPhoneSpec() {
        return phoneSpec;
    }

    public void setPhoneSpec(PhoneSpec phoneSpec) {
        this.phoneSpec = phoneSpec;
    }
}
