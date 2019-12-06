package adapter.classAdapter;

public class PrintBanner extends Banner implements Print {

    public PrintBanner(String banner){
        super.banner = banner;
        // 或者写成
        //super(banner)
    }

    public void printWeak() {
        System.out.println(super.showWithParen(super.banner));
    }

    public void printStrong() {
        System.out.println(super.showWithAster(super.banner));
    }
}
