package variables;

import java.util.Scanner;

public class condiciones2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int n1;
		 int n2;
		 int n3;
		 System.out.println("Pon tres números: ");
		 Scanner numero = new Scanner(System.in);
		 n1=numero.nextInt();
		 n2=numero.nextInt();
		 n3=numero.nextInt();

		 if (n1>n2 && n1>n3)
		 {
			 System.out.println("Número mayor es: "+n1);
		 } else if (n2>n1 && n2>n3)
		 {
			 System.out.println("Número mayor es: "+n2);
		 } else
		 {
			 System.out.println("Número mayor es: "+n3);
		 }
		
	}

}
