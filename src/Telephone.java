public abstract class Telephone implements Printable {
    public String model;
    public String brand;
    public double screenSize;

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public Telephone(String model, String brand, double screenSize) {
        this.model = model;
        this.brand = brand;
        this.screenSize = screenSize;
    }

}
