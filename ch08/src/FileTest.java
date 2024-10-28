import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {
        //자바에서 파일 만들기..
        //폴더 만들기.
        File file = new File("temp/example.txt");
        File directory = new File("temp/exampleDir");
        if(!directory.exists()) {
            directory.mkdir();
        }
        if(file.exists()) {
            System.out.println("temp/example.txt이 있습니다.");
        } else {
            try {
                boolean isCreate = file.createNewFile();
                System.out.println(isCreate);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("temp/example.txt이  없습니다.");
        }
        System.out.println("temp/example.txt "+file.exists());
    }
}
