package bucles;

import java.util.Scanner;

public class BucleWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Escribe dos números: ");
		Scanner numero = new Scanner(System.in);
        int num1;
        int num2;
        num1= numero.nextInt();
        num2= numero.nextInt();
		while(num1<=num2)
		{
			System.out.println(num1);
			num1++;
		}
		numero.close();
	}
}
