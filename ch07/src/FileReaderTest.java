import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {
        //외부에 있는 파일들은
        //오류 잡기 try catch
        try {
            //파일이 정해진 경로에 있다.
            FileReader fileReader = new FileReader("temp/system.ini");
            int c;


//            while((c = fileReader.read())!=-1) {
//                System.out.print((char)c);
//            }
            while(true) {
                c = fileReader.read();
                if(c==-1) break;
                System.out.print((char)c);
            }
        } catch (FileNotFoundException e) {
            System.out.println("파일이 경로에 없습니다.");
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
