import java.util.Scanner;

public class bil_max3 {
    public static void main(String[]args){
        int x = 0 ;
        int y = 0 ;
        int z = 0 ;
        int max;
        
        Scanner in = new Scanner (System.in);
        System.out.println("Masukkan Nilai X = ");
        x = in.nextInt();
        System.out.println("Masukkan Nilai Y = ");
        y = in.nextInt();
        System.out.println("Masukkan Nilai Z = ");
        z = in.nextInt();
        System.out.println("");
        
        if (x>y && x>z) {
            max = x;
        } else if (y>x && y>z){
            max = y;
        } else{
            max = z;
        }
        System.out.println("Angka tertinggi adalah = "+max);
    
    }
}
