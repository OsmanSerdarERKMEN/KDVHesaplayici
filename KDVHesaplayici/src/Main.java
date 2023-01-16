import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("KDV Hesaplamak İstediğiniz Tutarı Giriniz: ");
        double yalintutar = input.nextDouble();

        if(yalintutar <= 0) {
            System.out.println("Sıfır yada eksi bir değer girdiniz! Vergisi hesaplanamayan tutar!!");
        }
        else if (yalintutar <= 1000 && yalintutar >= 1){
            System.out.println("KDV'siz tutar: " + yalintutar);
            double kdv18 = (yalintutar*18/100);
            System.out.println("Girdiğiniz tutar % 18 lik dilime giriyor, ödemeniz gereken KDV: "
                    + kdv18 + " TL dir.");
            System.out.println("KDV eklenmiş toplam tutar: " + (kdv18 + yalintutar) + " TL dir.");
        }
        else if (yalintutar > 1000) {
            System.out.println("KDV'siz tutar: " + yalintutar);
            double kdv08 = (yalintutar*8/100);
            System.out.println("Girdiğiniz tutar % 8 lik dilime giriyor, ödemeniz gereken KDV: "
                    + kdv08 + " TL dir.");
            System.out.println("KDV eklenmiş toplam tutar: " + (kdv08 + yalintutar) + " TL dir.");
        }
    }
}