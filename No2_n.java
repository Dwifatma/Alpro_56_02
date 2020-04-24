public class No2_n {
    public static void main (String [] args){ 
        int [] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        // Mencetak angka dan jumlah total array
        int total = 0;
         for (int i = 0; i < angka.length; i++) {
             System.out.print(angka [i]+ " ");
             total += angka[i];
      }
            System.out.print(" = " + total);
      System.out.println("");
    }
}
