import java.util.Scanner;

public class Konvers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int jam, menit, detik, totalDetik, totalMenit, totalJam;
        
        System.out.println("Berapa Detik yang ingin di konvesikan : ");
        totalDetik = input.nextInt();
        
        detik = totalDetik%60;
        totalMenit = totalDetik/60;
        menit = totalMenit%60;
        totalJam = totalMenit/60;
        jam = totalJam%24;
        
        
        System.out.println("Konversi dari : "+totalDetik+" detik, Adalah : ");
	System.out.println("Detik sekarang  : " +detik+ " detik");
        System.out.println("Total menit     : " +totalMenit+ " menit");
        System.out.println("Menit sekarang  : " +menit+ " menit");
        System.out.println("Total jam       : " +totalJam+ " jam");
        System.out.println("Jam sekarang    : " +jam+ " jam");
        System.out.println("Tampil waktu    : " + jam + ":" + menit + ":" + detik);
    }
    
    
}