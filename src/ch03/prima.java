import java.util.Scanner;

public class prima {
    public static void main (String [] args){
        
    Scanner in = new Scanner (System.in);
       System.out.println("Masukkan Angka Bilangan : ");
    //       variabel
    int angka = in.nextInt();
    int bilangan = 0;
    //Looping penambahan
    for (int Looping = 1; Looping <= angka; Looping++)
    {
    if(angka%Looping ==0)
        bilangan = bilangan + 1; }
    if(bilangan ==2)
        System.out.println("Angka " + angka + " merupakan Bilanagn Prima " );
    else
        System.out.println("Angka " + angka + " merupakan Bukan Bilangan Prima " );
   
    }
    
}
