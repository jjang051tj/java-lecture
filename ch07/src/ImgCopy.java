import java.io.*;

public class ImgCopy {
    public static void main(String[] args) {
        //파일 / 폴더
        File sourceFile =  new File("temp/jun.jpg");
        File copyFile = new File("temp/copy-jun.jpg");
        try {
            FileInputStream fileInputStream = new FileInputStream(sourceFile);
            FileOutputStream fileOutputStream = new FileOutputStream(copyFile);
            int c = 0;
            while((c = fileInputStream.read())!=-1) {
                fileOutputStream.write((byte)c);
            }
            fileInputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}