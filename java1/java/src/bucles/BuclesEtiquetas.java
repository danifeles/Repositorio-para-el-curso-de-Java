package bucles;

public class BuclesEtiquetas {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    boolean b=true;

    principal:   while(b) {
	                System.out.println("Estoy en el bucle Principal");
	secundario:      for(int x=0;x<10; x++) {
		               System.out.println("Estoy en el bucle Secundario"+x);
		               if (x==5) break principal;
	  }
    }
  }
}
