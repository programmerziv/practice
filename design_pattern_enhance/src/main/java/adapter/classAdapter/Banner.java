package adapter.classAdapter;

/**
 * 实际
 */
public class Banner {

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    protected String banner;


    public String showWithParen(String banner){
        return "("+banner+")";
    }

    public String showWithAster(String banner){
        return "*"+banner+"*";
    }
}
