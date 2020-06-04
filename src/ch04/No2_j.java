public class No2_j {
    public static void main (String [] args){
        int [] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};     
        //Menampilkan selisih angka dengan angka setelahnya
        for (int i = 0; i < angka.length; i++) {
            if (i+1 < angka.length){
                int cetak1 = angka[i];
                int cetak2 = angka[i+1];
                if (cetak1 % 2 == 0 && cetak2 % 2 == 0){
                    int selisih = cetak1-cetak2;
                    if (selisih < 0){
                        selisih = selisih * -1;
                    }
System.out.println("Angka genap = "+""+cetak1+" dengan "+cetak2+""+" Selisihnya "+ selisih);
                }
            }
        }
       System.out.println();
    }
}

