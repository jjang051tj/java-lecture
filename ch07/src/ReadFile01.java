import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile01 {
    public static final String FILE_NAME = "temp/buffered.dat";
    public static final int FILE_SIZE = 1024*1024*2; // 10mb
    public static final int BUFFER_SIZE = 8000;
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream(FILE_NAME);
            long startTime = System.currentTimeMillis(); //milli second로 보여준다.
            int c = 0;
            int fileSize = 0;
            while ((c = fileInputStream.read())!=-1) {
                fileSize++;
            }
            fileInputStream.close();
            long endTime = System.currentTimeMillis();
            System.out.println("파일==="+FILE_NAME);
            System.out.println("파일 크기==="+FILE_SIZE/1024/1024+"mb");
            System.out.println("파일 쓰기에 걸린 시간==="+(endTime - startTime)+"ms");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}