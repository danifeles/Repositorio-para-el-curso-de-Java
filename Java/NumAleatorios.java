package Java;

public class NumAleatorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//El 1 delante es para que salga entre 1 y 3 y no entre 0 y 3
	
	int[] array = new int[3];
	array[0]=1 +(int) (Math.random()*3);
	array[1]=1 +(int) (Math.random()*3);
	array[2]=1 +(int) (Math.random()*3);
		
	for(int i=0;i<array.length;i++)
	{
		if(array[i]==1)
		{
			System.out.print("*");
		} else if(array[i]==2)
		{
			System.out.print("x");
		} else if(array[i]==3)
		{
			System.out.print("o");
		}
	}
	
	if (array[0]==array[1] && array[0]==array[2])
	{
		System.out.print("\nPremio gordo");
	}
	if (array[0]==array[1] && array[0]!=array[2] || array[0]==array[2] && array[0]!=array[1] ||
		array[1]==array[0] && array[1]!=array[2] || array[1]==array[2] && array[1]!=array[0] ||
		array[2]==array[1] && array[2]!=array[0] || array[2]==array[0] && array[2]!=array[1])
	{
		System.out.print("\nPremio mediano");
	}
	if (array[0]!=array[1] && array[0]!=array[2] && array[1]!=array[2] )
	{
		System.out.print("\nHas perdido la pasta");
	}
	
	}	
}
