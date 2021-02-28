package Java;

public class MayorAMenorConOtroArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] array1 = { 10, 43, 1, 23, 56 };
	int[] array2 = new int[5];
	int pos = 0;
   
	//ordenar el array
	for (int i = 0; i < array1.length  ; i++) {
		for (int x = 0; x < array1.length ; x++) {
			if (array1[i] < array1[x])
				pos ++;				
			} 
		 array2[pos]= array1[i];
		 pos = 0;
		} 
		
	
	//Pintar el array
	for (int posicion=0;posicion<array2.length;posicion++)
	{
		System.out.print(array2[posicion]+"-");
	}
  }
}
