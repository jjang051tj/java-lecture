import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFile01 {
    public static final String FILE_NAME = "temp/buffered.dat";
    public static final int FILE_SIZE = 1024*1024*2; // 10mb
    public static final int BUFFER_SIZE = 8000;
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME);
            long startTime = System.currentTimeMillis(); //milli second로 보여준다.
            for(int i=0;i<FILE_SIZE;i++) {
                fileOutputStream.write(1);
            }
            fileOutputStream.close();
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
