package arrays;

import java.util.Scanner;

public class TresEnRaya {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String x[][]=new String[3][3];
	
	{
	for (int z=0; z<x.length; z++)
    {
    	for (int h=0;h<x[z].length; h++)
        {
    		x[z][h]= "0";
        }
    }
	
	for (int z=0; z<x.length; z++)
    {
    	for (int h=0;h<x[z].length; h++)
	 {	
		Scanner numero = new Scanner(System.in);
		System.out.print("Escriba posición de la fila entre 1 y 2 ");
		int n1=numero.nextInt();
		System.out.print("Escriba posición de la columna entre 1 y 2 ");
		int n2=numero.nextInt();
		if (n1==-1 || n2==-1)
		{
		break;
		} else
		{
		while (n1<3 && n2<3)
		{
		x[n1][n2]= "X";
		continue;
		}
	   } 
	 }
   }
	
	for (int z=0; z<x.length; z++)
    {
    	for (int h=0;h<x[z].length; h++)
        {
	       System.out.print(x[z][h]);
        }
    	System.out.println();
      }
	}
  }
}

	