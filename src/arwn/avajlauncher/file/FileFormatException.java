package arwn.avajlauncher.file;

public class FileFormatException extends Exception {
    public FileFormatException(String line) {
        super(line);
    }
}
