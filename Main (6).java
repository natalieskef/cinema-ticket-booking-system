//NATALI ISKEIF 240411900
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("kaç bilet almak istiyorsun(1-2)");
        int biletSayi= scanner.nextInt();
        if (biletSayi ==1 || biletSayi==2){
        }else{
            System.out.println("Geçersiz bilet sayısı girdiniz");
        }
        for (SeatType s:SeatType.values()){
            System.out.println(s + ":" + SeatType.values());
        }
        for (ShowTime sh:ShowTime.values()){
            System.out.println(sh + ":"+ ShowTime.values());
        }
        int basePrice=100;
    }
}