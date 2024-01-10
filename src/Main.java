public class Main {
    public static void main(String[] args) {

        Telephone[] telephones = {
                createObject("IPhone"),
                createObject("Samsung"),
                createObject("Xiaomi")};
        for (Telephone printable : telephones) {
            printable.print();
        }
    }

    public static Telephone createObject(String className) {
        Telephone telephones = null;
        switch (className) {
            case "IPhone":
                telephones = new Iphone("2G", 3.5, "IOS 1");
                break;
            case "Samsung":
                telephones = new Samsung("S23", 6.1, "Android 14 ");
                break;
            case "Xiaomi":
                telephones = new Xiaomi("Redmi 8", 6.22, "MIUI Global 11");
                break;
        }
        return telephones;
    }
}