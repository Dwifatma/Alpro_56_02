public class No2_d {
    public static void main(String[] args) {      
        int [] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
        //Menampilkan angka kelipatan 3
        System.out.print("Angka kelipatan 3 pada array adalah :  ");
        for (int i = 0; i < angka.length; i++){
            if (angka [i] % 3 == 0){
                System.out.print(angka[i] + " ");
            }
        }      
        System.out.println("");
    }
}
