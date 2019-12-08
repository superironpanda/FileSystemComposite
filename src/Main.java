public class Main {
    public static void main(String[] args){
        File folderFile = new FolderFile("CS5800 Folder");
        File textFile = new TextFile("readme.txt");
        File textFile2 = new TextFile("doNotReadMe.text");
        folderFile.addFile(textFile);
        folderFile.addFile(textFile2);
        folderFile.displayFiles();
    }
}
