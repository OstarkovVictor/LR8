import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Введите имя файла =>"); String
                fname=sc.nextLine();
        try {
// Создается файл
            File f1=new File(fname);
            f1.createNewFile(); // файл создан
            System.out.println("Полный путь файла: "+ f1.getAbsolutePath());
            System.out.println("Введите количество строк для записи в файл => ");
            int n=sc.nextInt();
            DataOutputStream dOut= new DataOutputStream( new FileOutputStream(f1));
            sc.nextLine(); //очистка буфера
            for (int i= 0; i<n; i++) {
                System.out.println("Введите строку для записи в файл => ");
                String s=sc.nextLine();
                dOut.writeUTF(s);
// запись отдельных строк
            }
            dOut.flush();  // дописываем несохраненные данные на диск

            dOut.close(); // закрываем поток
// Чтение и вывод данных из созданного файла
            DataInputStream dln=new DataInputStream(new FileInputStream(f1));
            while (true) {
                System.out.println(dln.readUTF());
            }
        }catch (Exception e) {
            System.out.println(""+e);
        }
    }
}