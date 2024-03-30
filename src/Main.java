import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int age, flightType;
        double km, total;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi Giriniz : ");
        km = input.nextDouble();
        System.out.print("Yaşınızı Giriniz : ");
        age = input.nextInt();
        System.out.print("Tek Yön -> 1\nGidiş Dönüş ->2\nYolculuk Tipini Giriniz : ");
        flightType = input.nextInt();
        total = km * 0.10;
        if (km > 0 && age > 0 && (flightType == 1 || flightType == 2)) {
            if (age <= 12) {
                total = total - (total * 0.50);
            } else if (age > 12 && age <= 24) {
                total = total - (total * 0.10);
            } else if (age >= 65) {
                total = total - (total * 0.30);
            }if (flightType == 2){
                total = (total * 2) - (2 * (total * 0.20));
            }
            System.out.print("Uçak Bileti Fiyatı : " + total);
        } else {
            System.out.println("Hatalı Veri Girdiniz!");
        }


    }
}
