public class Bubble_Sort {
    public static void main (String [] args){
        
        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
		
		System.out.println("Array Sebelum Di Sort : ");
		for(int x = 0; x<array.length; x++) {
			System.out.print(" "+array[x]);
		}
		System.out.println();
		System.out.println("Array Sesudah Di Sort : ");
		for(int i = (array.length-1); i>0; i--) {
			for(int j = 0; j<i; j++) {
				if(array[j]>array[(j+1)]) {
					int temp = array[(j+1)];
					array[(j+1)] = array[j];
					array[j] = temp;
				}
			}
		}
		for(int x = 0; x<array.length; x++) {
			System.out.print(" "+array[x]);
		}
                System.out.println();
    }
}
