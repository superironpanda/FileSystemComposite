import java.util.ArrayList;
import java.util.List;

public class TextFile implements File {
    public String name;

    public TextFile(String name){
        this.name = name;
    }

    @Override
    public void addFile(File file) {
        System.out.println("");
    }

    @Override
    public void displayFiles() {
        System.out.println(this.name);
    }
}
