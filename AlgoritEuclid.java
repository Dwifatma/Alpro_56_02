package ch05;

public class AlgoritEuclid {   
    static final int EXTEUCLID_RET_ARRAY_SIZE = 3;
    static final int INDEX_GCD = 0;
    
    static int gcd (int a, int b){
        int m = a;
        int n = b;
        int r = 0;
        
        while (n != 0){
            r = m % n;
            m = n;
            n = r;
        }
        return m;
    }
    public static void main (String [] args){
        int nilai_a = 45;
        int nilai_b = 36;
System.out.println("GCD(" + nilai_a + "," + nilai_b +") = " + AlgoritEuclid.gcd(nilai_a, nilai_b));

    }
}




