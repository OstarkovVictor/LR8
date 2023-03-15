import java.io.*;
import java.util.Scanner;
public class Main {public static void main(String[] args) {
    try {
// Cоздanue иcxoдoного файла numIsh.txt и запись в него чисел типа float
        File fl=new
                File("C:\\java\\numlsh.txt");
        fl.createNewFile();
        Scanner sc = new Scanner(System.in, "cp1251");
        DataOutputStream wr =
                new DataOutputStream(new FileOutputStream(fl.getAbsolutePath()));
        System.out.println("Сколько вещественных чисел записать в файл?"); int count = sc.nextInt();
        System.out.println("Введите числа:");
        for (int i= 0; i < count; i++)
            wr.writeFloat(sc.nextFloat());
        wr. flush();
        wr.close();
// Создание файла numIsh. txt Е и переписывание в него чисел из numRez.txt
        File f2=new
                File("С:\\java\\numRez.txt");
        f2.createNewFile();
// поток для чтения из исходного файла numIsh. txt
        DataInputStream rd =
                new DataInputStream(new FileInputStream(fl.getAbsolutePath()));
// поток для записи в результирующий файл numRez.txt
        wr = new DataOutputStream(new FileOutputStream(f2.getAbsolutePath()));
        try {
            while(true) {
                float number=rd.readFloat();
                wr.writeFloat(number);
                System.out.print(" Число "+ (float)number);
            }
        }catch(EOFException e) {}
        wr.flush();
        wr.close();
        rd.close();
    }catch(IOException e){
        System.out.println("End of file");
    }
}}
