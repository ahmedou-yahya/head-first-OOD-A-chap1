public class PhoneSpec {
    private String brand;
    private String model;


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

   public boolean matches(PhoneSpec phoneSpec){
        if (getBrand().equals(phoneSpec.getBrand()) && phoneSpec.equals(getModel()))
            return true;

        return false;
   }

}
