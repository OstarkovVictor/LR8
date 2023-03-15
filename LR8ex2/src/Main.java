package Lab_8ex2;


import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            // Создаем поток для чтения и записи с нужной кодировкой
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("C:\\java\\1.txt"), "utf8"));
            bw = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("C:\\java\\123.txt"), "utf8"));
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null){
                lineCount++;
                boolean checkString = checkNumber(s);
                if (checkString == true){
                    bw.write(s);
                    bw.newLine();

                } else if (lineCount == 2) {
                    bw.write(s);
                    bw.newLine();
                }

            }
        } catch (IOException e) {
            System.out.println("Error !!!!");
        }
        finally {
            br.close();
            bw.flush();
            bw.close();
        }
    }


    private static boolean checkNumber(String someString){
        char[] tempChar = someString.toCharArray();
        return Character.isDigit(tempChar[0]);}}