public class Samsung extends Telephone {
    private String androidVersion;

    public String getAndroidVersion() {
        return androidVersion;
    }

    public Samsung(String model, double screenSize, String androidVersion) {
        super(model, "Samsung", screenSize);
        this.androidVersion = androidVersion;
    }

    @Override
    public void print() {
        System.out.println("Brand: " + getBrand() +
                "\nModel: " + getModel() +
                "\nScreen Size: " + getScreenSize() +
                "\nAndroid Version: " + androidVersion);

    }
}
