public class No2_f {
    public static void main(String[] args) {     
        int [] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
        //Menampilkan angka ganjil yang diapit angka genap
        System.out.print("Angka ganjil yang diapit angka genap pada array adalah :  ");
        for (int i = 0; i < angka.length; i++){
            if (i+2 < angka.length){
                 int cetak = angka[i+1];
                    if (cetak % 2 == 1){
                System.out.print(cetak + " ");
            }
        }  
    }
        System.out.println("");
    }
}
