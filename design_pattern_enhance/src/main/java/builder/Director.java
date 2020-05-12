package builder;

public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public void construct(){
        builder.makeTitle("hellowold");
        builder.makeString("太阳出来我想唱歌");
        builder.makeItems(new String[]{"还","有","谁"});
        builder.close();
    }

}
