public class JPEGFile implements File{
    public String name;

    public JPEGFile(String name){
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
