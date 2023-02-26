import java.io.*;
import java.net.URL;

public class Main {

    public static void readAllByByte(Reader in) throws IOException {
        while (true) {
            int oneByte = in.read(); // читает 1 байт
            if (oneByte != -1) { // признак конца файла
                System.out.print((char) oneByte);
            } else {
                System.out.print("\n" + " конец \n");
                break;
            }
        }
    }

    public static void main(String[] args) {
        try{
            InputStream inFile = new FileInputStream("C:\\My\\MyFile1.txt");
            Reader rFile = new InputStreamReader(inFile, "cp1251");
            readAllByByte(rFile);
            System.out.printf("\n\n\n");
            inFile.close();
            rFile.close();
            //Файл ^
            InputStream inUrl = new URL("http://google.com").openStream();
            Reader rUrl = new InputStreamReader(inUrl, "cp1251");
            readAllByByte(rUrl);
            inUrl.close();
            rUrl.close();
            //Сайт^
            InputStream inArray = new ByteArrayInputStream(new byte[]{5,8,3,9,11});
            Reader rArray = new InputStreamReader(inArray, "cp1251");
            readAllByByte(rArray);
            inArray.close();
            rArray.close();

        }catch(IOException e){
            System.out.printf("Ошибкка " + e);
        }
    }
}