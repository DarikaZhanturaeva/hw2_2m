public class Xiaomi extends Telephone {
    private String MIUI;

    public String getMIUI() {
        return MIUI;
    }

    public Xiaomi(String model , double screenSize, String MIUI) {
        super(model, "Xiaomi", screenSize);
        this.MIUI = MIUI;
    }

    @Override
    public void print() {
        System.out.println("Brand: " + getBrand() +
                "\nModel: " + getModel() +
                "\nScreen Size: " + getScreenSize() +
                "\nHas MIUI: " + MIUI);

    }
}
