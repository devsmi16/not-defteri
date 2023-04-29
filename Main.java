import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dosyaAdi;
        String icerik;

        System.out.println("what do u do want?: ");
        System.out.println("1 - new file create");
        System.out.println("2 - file edit");
        System.out.println("3 - save as file");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println("file name enter: ");
                dosyaAdi = scanner.next();
                System.out.println("new content enter: ");
                icerik = scanner.next();
                dosyaOlustur(dosyaAdi, icerik);
            }
            case 2 -> {
                System.out.println("edit as file enter the name: ");
                dosyaAdi = scanner.next();
                System.out.println("new create enter: ");
                icerik = scanner.next();
                dosyaDuzenle(dosyaAdi, icerik);
            }
            case 3 -> {
                System.out.println("save as file enter the name: ");
                dosyaAdi = scanner.next();
                System.out.println("save as content enter: ");
                icerik = scanner.next();
                dosyaKaydet(dosyaAdi, icerik);
            }
            default -> System.out.println("invalid choice");
        }
    }
    public static void dosyaOlustur(String dosyaAdi, String icerik){
        try {
            File dosya = new File(dosyaAdi);
            FileWriter writer = new FileWriter(dosya);
            writer.write(icerik);
            writer.close();
            System.out.println("file is success create");
        } catch (IOException e) {
            System.out.println("file create error: " + e.getMessage());
        }
    }
    public static void dosyaDuzenle(String dosyaAdi, String icerik){
        try {
            File dosya = new File(dosyaAdi);
            FileWriter writer = new FileWriter(dosya);
            writer.write(icerik);
            writer.close();
            System.out.println("file edited...");
        }catch (IOException e){
            System.out.println("edit error: " + e.getMessage());
        }
    }
    public static void dosyaKaydet(String dosyaAdi, String icerik){
        try {
            File dosya = new File(dosyaAdi);
            FileWriter writer = new FileWriter(dosya);
            writer.write(icerik);
            writer.close();
            System.out.println("file success is saved...");
        }catch (IOException e){
            System.out.println("save error...");
        }
    }
}