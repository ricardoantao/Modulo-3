package raizesquadradas;
import java.util.Scanner;
public class raizesquadradas {
static void raizquadrada (int Linf , int Lsup)
{
Scanner dados = new Scanner (System.in);	
System.out.println("Qual o limite inferior?");	
Linf= dados.nextInt();	
System.out.println("Qual o limite superior?");	
Lsup= dados.nextInt();	
for (int I=Linf ; I<Lsup ; I++)	
System.out.println(String.format("%5.1f",Math.sqrt(I)));
}	
public static void main(String[] args) {
raizquadrada(0,0);	
}
}

