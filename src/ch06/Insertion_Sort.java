public class Insertion_Sort {
    public static void main (String [] args){
        
        int[] tabInt = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int i,j,data_sisip;
        
        for(i=1; i<13; i++){ 
            data_sisip = tabInt[i]; 
            j = i; 
            while((j>0) && (tabInt[j-1] > data_sisip)){            
                tabInt[j] = tabInt[j-1]; 
                j = j - 1; 
            }        
            tabInt[j] = data_sisip; 
        } 
        System.out.println("Insertion Sort :");
        for(i=0; i<13; i++){ 
            System.out.print(tabInt[i]+" ");
        }
        System.out.println();
    }
}




