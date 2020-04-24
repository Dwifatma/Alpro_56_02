public class No2_h {
     public static void main (String [] args){    
        int [] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        // Menjumlahkan nilai keseluruhan array
        int total = 0;
         for (int i = 0; i < angka.length; i++) {
             total += angka[i];
      }
            System.out.print("Jumlah keseluruhan angka pada array  " + total);
      System.out.println("");
     }
}
