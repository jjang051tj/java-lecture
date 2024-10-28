import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesTest {
    //File을 보완해서 나온 새로운 클래스
    public static void main(String[] args) {
        Path file = Path.of("temp02/example.txt");
        Path directory =  Path.of("temp02/exampleDir");
        try {
            Files.createFile(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            Files.createDirectory(directory);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
