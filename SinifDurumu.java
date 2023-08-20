import java.util.Scanner;

public class SinifDurumu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ortalamanızı girin: ");
        double ortalama = scanner.nextDouble();
        
        String sonuc = (ortalama >= 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        
        System.out.println(sonuc);
        
        scanner.close();
    }
}