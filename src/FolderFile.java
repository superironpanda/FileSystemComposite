import java.util.ArrayList;

public class FolderFile implements File {
    public String name;
    public ArrayList<File> files;

    public FolderFile(String name){
        this.name = name;
        this.files = new ArrayList<File>();
    }

    @Override
    public void displayFiles() {
        for(File file : files){
            file.displayFiles();
        }
    }

    @Override
    public void addFile(File file) {
        files.add(file);
    }
}
