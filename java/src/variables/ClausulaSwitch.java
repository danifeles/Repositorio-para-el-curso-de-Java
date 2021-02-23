package variables;

import java.util.Scanner;

public class ClausulaSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Pon una letra: ");
		Scanner letra = new Scanner(System.in);
		String letra1;
        letra1= letra.nextLine();
		
        switch(letra1)
		{
		case "a": System.out.println("a");
		    break;
		case "e": System.out.println("e");
	        break;
		case "i": System.out.println("i");
	    break;
	    case "o": System.out.println("o");
        break;
	    case "u": System.out.println("u");
	    break;
	    default: System.out.println("Consonante"+letra1);
		}
	}

}
