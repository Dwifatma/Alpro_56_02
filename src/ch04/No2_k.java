import java.util.Arrays;

public class No2_k {
    public static void main (String [] args){
        System.out.println("Angka yang bernilai lebir besar");
        int [] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};     
        //Menampilkan angka yang setelahnya bernilai lebih besar
        Arrays.sort(angka);
        for (int i = 0; i < angka.length; i++) {
            System.out.print(" "+angka[i]);
        }
        System.out.println();
        }       
}
