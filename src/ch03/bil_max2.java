import java.util.Scanner;

public class bil_max2 {
    public static void main(String[]args){
        
        int x = 0 ;
        int y = 0 ;
        int max;
        
        Scanner in = new Scanner (System.in);
        System.out.println("Masukkan Nilai X = ");
        x = in.nextInt();
        System.out.println("Masukkan Nilai Y = ");
        y = in.nextInt();
        System.out.println("");
        
        if (x>y) {
            max = x;
        } else{
            max = y;
        }
        System.out.println("Angka tertinggi adalah = "+max);
    
    }
}