package builder;

public class BuilderMain {

    public static void main(String[] args) {
        TextBuilder textBuilder = new TextBuilder();
        Director director1 = new Director(textBuilder);
        director1.construct();
        System.out.println(textBuilder.getResult());


        HTMLBuilder htmlBuilder = new HTMLBuilder();
        Director director2 = new Director(htmlBuilder);
        director2.construct();
        System.out.println(htmlBuilder.getResult());



    }
}
