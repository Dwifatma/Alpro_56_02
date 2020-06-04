public class No2_b {
    public static void main (String [] args){     
        int [] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int cari = 19;
        
        // Mencetak sebuah nilai array
          for (int i = 0; i < angka.length; i++) {
              if (angka[i]==cari){
                  System.out.print(cari +" berada pada indeks ke - "+ i);
              }
          }
        
         System.out.println("");
    }
    
}
