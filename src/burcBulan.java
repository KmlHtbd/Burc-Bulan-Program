import java.util.Scanner;
public class burcBulan {
    public static void main(String[] args) {

        int ay,gun;
        boolean isError = false;
        Scanner input = new Scanner (System.in);
        System.out.print("Kaçıncı Ayda Doğdunuz? : ");
        ay = input.nextInt();
        System.out.print("Ayın Kaçında Doğdunuz? : ");
        gun = input.nextInt();

        if ((ay>=1 && ay<=12) && (gun>=1 && gun<=31)) {
            if ((ay == 1 && gun >= 22) || (ay == 2 && gun <= 19)) {
                System.out.println("Kova Burcusunuz");
            } else if ((ay == 2) || (ay == 3 && gun <= 20)) {
                System.out.println("Balık Burcusunuz");
            } else if ((ay == 3) || (ay == 4 && gun <=20)) {
                System.out.println("Koç Burcusunuz");
            } else if ((ay == 4) || (ay == 5 && gun <= 21)) {
                System.out.println("Boğa Burcusunuz");
            } else if ((ay == 5) || (ay == 6 && gun <= 22)) {
                System.out.println("İkizler Burcusunuz");
            } else if ((ay == 6) || (ay == 7 && gun <= 22)) {
                System.out.println("Yengeç Burcusunuz");
            } else if ((ay == 7) || (ay == 8 && gun <= 22)) {
                System.out.println("Aslan Burcusunuz");
            } else if ((ay == 8) || (ay == 9 && gun <= 22)) {
                System.out.println("Başak Burcusunuz");
            } else if ((ay == 9) || (ay == 10 && gun <= 22)) {
                System.out.println("Terazi Burcusunuz");
            } else if ((ay == 10) || (ay == 11 && gun <= 22)) {
                System.out.println("Akrep Burcusunuz");
            } else if ((ay == 11) || (ay == 12 && gun <= 21)) {
                System.out.println("Yay Burcusunuz");
            } else {
                System.out.println("Oğlak Burcusunuz");
            }
        } else{
            isError = true;
        }
            if (isError){
                System.out.println("Yanlış Bir Değer Girdiniz.");
            }
    }
}