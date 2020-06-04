public class No2_l {
   public static void main (String [] args){      
        int [] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};     
        //Menampilkan jumlah angka dengan angka setelahnya yang hasil penjumlahannya bernilai genap 
        for (int i = 0; i < angka.length; i++) {
            if (i+1 < angka.length){
                int cetak1 = angka[i];
                int cetak2 = angka[i+1];
                  int jumlah = cetak1+cetak2;
                if (jumlah % 2 == 0){
   
                    System.out.println("Angka "+""+cetak1+" + "+cetak2+""+" berjumlah "+ jumlah);
                }
                }
            }
           System.out.println();
        }
    }
