public class No2_e {
    public static void main(String[] args) {   
        int [] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
        //Menampilkan angka yang memiliki angka 2
        System.out.print("Yang memiliki angka 2 pada array :  ");
        for (int i = 0; i < angka.length; i++){
            if (angka [i] % 10==2 || angka[i]==2){
                System.out.print(angka[i] + " ");
            }
        }      
        System.out.println("");
    }
}
