package menorde3;
import java.util.Scanner;
public class menorde3 {
static int menorde3 (int X, int Y, int Z)
	{if (X>Y)
		X=Y;
     if (X>Z)	
	X=Z;
return X;}
	public static void main (String[] args) throws Exception {
		int x, y, z;
		Scanner lerS = new Scanner(System.in);
		System.out.println("Digite o primeiro valor (X)");
		x = lerS.nextInt();
		System.out.println("Digite o segundo valor (Y)");
		y = lerS.nextInt();
		System.out.print("Digite o terceiro valor (Z)");
		z = lerS.nextInt();
		System.out.println("Menor = " + menorde3 (x, y, z));
		}}

	

		