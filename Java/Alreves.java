package Java;

public class Alreves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] c1 = new int[5];
		int[] c2 = new int[5];

		c1[0] = 1;
		c1[1] = 2;
		c1[2] = 3;
		c1[3] = 4;
		c1[4] = 5;

		for (int i = 0; i < 5; i++)

		{
			c2[i] = c1[4 - i];
			System.out.print(c2[i]);

		}
	}
}