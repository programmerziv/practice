package adapter.methodAdapter;

public class PrintBanner extends Print{


    private String banner;

    public PrintBanner (String banner){
        this.banner = banner;
        this.ban = new Banner();
    }
    private Banner ban;

    protected void printWeak() {
        ban.showWithParen(this.banner);
    }

    protected void printStrong() {
        ban.showWithAster(this.banner);
    }
}
