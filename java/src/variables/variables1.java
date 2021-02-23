package variables;

public class variables1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		boolean v=true;
		char letra='x';
		double d1=3.10;
		long l=15776;
		int i=10;
		short s=200;
		float f=2.4f;
		byte b=127;
		
		/*
		 * Variables con nombre y apellido. Variables con salario y IRPF
		 */
		
		String nombre="Daniela";
		String apellido="Felis";
		long salario=1000;
		int irpf=10;
		long impuesto=salario/irpf;
        System.out.println("Mi nombre es"+nombre+" "+apellido+"y gano "+salario+"y el irpf es "+impuesto);

	}

}
