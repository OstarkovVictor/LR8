import java.io.*;
import java.net.URL;

public class Main {
    public static void readAllIByByte(InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read(); // читает 1 байт
            if (oneByte !=-1) { // признак отсутствия конца файла
                System.out.print((char) oneByte);
            } else {
                System.out.print("\n" + "end");
                break;
            }
        }}
        public static void main(String[] args) throws IOException {
            try {
// С потоком связан файл
                InputStream inFile = new FileInputStream("c:/java/text.txt");
                readAllIByByte(inFile);
                System.out.print( "\n\n\n");
                        inFile.close();
// С потоком связана интернет-страница
                InputStream inUrl = new URL("http://google.com").openStream();
                readAllIByByte(inUrl);
                System.out.print("\n\n\n");
                inUrl.close();
//С потоком связан массив типа byte
                InputStream inArray=new ByteArrayInputStream(new byte [] {7, 9, 3,7,4});
                readAllIByByte(inArray);
                System.out.print("\n\n\n");
                inArray.close();
            } catch (IOException e) {
                System.out.println("Oшибкa: "+ e);
            }
        }}