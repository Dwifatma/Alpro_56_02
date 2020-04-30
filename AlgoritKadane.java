package ch05;

import java.util.Scanner;

public class AlgoritKadane {
     /* Function to largest continuous sum */
    public int maxSequenceSum(int[] arr)
    {        
        int maxSoFar = arr[0], maxEndingHere = arr[0];
 
        for (int i = 1; i < arr.length; i++)
        {
            /* calculate maxEndingHere */
            if (maxEndingHere < 0)
                maxEndingHere = arr[i];
            else
                maxEndingHere += arr[i];
 
            /* calculate maxSoFar */
            if (maxEndingHere >= maxSoFar)
                maxSoFar = maxEndingHere;
        }
        return maxSoFar;
    }    
    /* Main function */
    public static void main (String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kadane Algorithm Test\n");
        /* Make an object of AlgoritKadane class */
        AlgoritKadane k = new AlgoritKadane();
 
        System.out.println("Masukkan Jumlah Array :");
        int N = scan.nextInt();
        /* Accept two 2d matrices */
        System.out.println("Masukkan "+ N +" elements");
        int[] arr = new int[N];
        for (int i = 0; i < N; i++)
            arr[i] = scan.nextInt();
        int sum = k.maxSequenceSum(arr);
        System.out.println("\nMaximum Sequence sum = "+ sum);
 
    }
}




