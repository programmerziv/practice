package builder;

public class TextBuilder extends Builder{

    private StringBuffer buffer = new StringBuffer();


    public void makeTitle(String title) {
        this.buffer.append("《"+title+"》"+"\n");
    }

    public void makeString(String string) {
        this.buffer.append("\n\r"+string+"\n\r");
    }

    public void makeItems(String[] items) {
        for (String item:items){
            this.buffer.append("\n\r"+item);
        }
    }

    public void close() {
        this.buffer.append("\n\r"+"---------------");
    }

    public String getResult(){
        return this.buffer.toString();
    }

}
