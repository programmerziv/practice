package builder;

public class HTMLBuilder extends Builder {

    private StringBuffer buffer = new StringBuffer();

    public void makeTitle(String title) {
        this.buffer.append("<h1>"+title+"</h1>"+"\n\r");
    }

    public void makeString(String string) {
        this.buffer.append("<p>"+string+"</p>"+"\n\r");
    }

    public void makeItems(String[] items) {
        for (int i=0; i<items.length;i++){
            this.buffer.append(i + "_"+items[i]+"\n\r");
        }
    }

    public void close() {
        this.buffer.append("over"+"-----------------------");
    }

    public String getResult(){
        return this.buffer.toString();
    }
}
