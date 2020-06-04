public class No2_g {
    public static void main(String[] args) {     
        int [] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
        //Menampilkan angka kelipatan 5 yang sebelumnya juga merupakan angka kelipatan 5
        System.out.print("Angka kelipatan 5 yang sebelumnya juga merupakan angka kelipatan 5 pada array adalah :  ");
        for (int i = 0; i < angka.length; i++){
            if (angka [i] % 5 == 0){
                System.out.print(angka[i] + " ");
            }
        }      
        System.out.println("");
    }
}
