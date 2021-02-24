package bucles;

import java.util.Scanner;

public class Numerosprimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner numero = new Scanner(System.in);
        int n1;
        n1=numero.nextInt();
        
        //Contador
        int x=2;
        boolean primo=true;
        
        //Comprobar si es primo
        while(x<n1) {
        	if(n1%x==0)
        {
        	System.out.println("Número no primo");
        	System.out.println("Divisible por: "+x);
        	primo=false;
        	break;
        }
        x++;
		}
	    if (primo)
	    {
	    	System.out.println("Número primo");
	    }
	}
}

