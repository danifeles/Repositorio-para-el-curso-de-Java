package arrays;

public class ClaseArray {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=0;
		int z;
		
		int array1[];
		
		int[] array2;
		
		int[] array3= {20,30,40,34,37};
		
		System.out.print("Recorro el Bucle ");
		
		for(int contador=0;contador<=4;contador++)
		{
			System.out.println(array3[contador]+"-");
		}
		
		System.out.print("Recorro el Bucle al reves ");

		for (int contador=4;contador>=0;contador--)
		{
			System.out.println(array3[contador]+"-");
		}
	}

}
