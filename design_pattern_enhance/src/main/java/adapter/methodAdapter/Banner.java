package adapter.methodAdapter;

/**
 * 真实
 */
public class Banner {

    public void showWithParen(String banner){
        System.out.println("("+ banner + ")");
    }

    public void showWithAster(String banner){
        System.out.println("*" + banner + "*");
    }
}
