package adapter.classAdapter;

public class AdapterMain {

    public static void main(String[] args) {
        PrintBanner printBanner = new PrintBanner("你好");

        printBanner.printWeak();

        printBanner.printStrong();
    }
}
