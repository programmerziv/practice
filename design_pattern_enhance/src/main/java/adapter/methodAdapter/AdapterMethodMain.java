package adapter.methodAdapter;

public class AdapterMethodMain {

    public static void main(String[] args) {

        PrintBanner printBanner = new PrintBanner("hello");

        printBanner.printWeak();

        printBanner.printStrong();
    }
}
