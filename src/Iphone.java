public class Iphone extends Telephone {
    private String IOSVersion;

    public String getIOSVersion() {
        return IOSVersion;
    }

    public Iphone(String model, double screenSize, String IOSVersion) {
        super(model, "Apple", screenSize);
        this.IOSVersion = IOSVersion;
    }


    @Override
    public void print() {
        System.out.println("Brand: " + getBrand() +
                "\nModel: " + getModel() +
                "\nScreen Size: " + getScreenSize()+
                "\niOS Version: " + IOSVersion);
    }
}
