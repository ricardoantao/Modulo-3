package sistemasnumericos;

import java.util.Scanner;

public class sistemas_numericos {

public static void main(String[] args) {

Scanner dados = new Scanner (System.in);
int menu;
do {
System.out.print(" Converter entre Sistemas Numéricos \n"
			+ "\n    (1) Binário para Decimal \n"
			+ "    (2) Octal para Decimal \n"
			+ "    (3) Hexadecimal para Decimal \n"
			+ "    (4) Decimal para  Binário \n"
			+ "    (5) Decimal para Octal \n"
			+ "    (6) Decimal para Hexadecimal \n"
			+ "    (0) Sair do programa \n "
			+ "\n Insira a opção: ");
menu = dados.nextInt();
switch (menu) {
case 1:
	for (int i = 0; i < 100; ++i)  
	       System.out.println();
long num1;
System.out.print("\n Insira o nº Binário: ");
num1 = dados.nextInt();
int decimal1 = cbtd(num1);
System.out.println("O nº Decimal correspondente é: " + decimal1 + "\n");
		break;
		case 2:
			for (int i = 0; i < 100; ++i)  
			       System.out.println();
long num2;
System.out.println("\n Insira o nº Octal: ");
num2 = dados.nextInt();
int decimal2 = octal_decimal(num2);			
System.out.println("O nº Decimal correspondente é: " + decimal2 + "\n");	
		break;
		case 3:
			for (int i = 0; i < 100; ++i)  
			       System.out.println();
		String num3;	
		System.out.println("\n Insira o nº Hexadecimal: ");	
		num3 = dados.next();	
			int decimal3 = hexadecimal_decimal(num3);
			System.out.println("O nº Decimal correspondente é: " + decimal3 + "\n");	
		break;
		case 4:
			for (int i = 0; i < 100; ++i)  
			       System.out.println();
			long num4;
			System.out.println("\n Insira o nº Decimal: ");
			num4 = dados.nextInt();
			int binario1 = decimal_binario(num4);
			System.out.println("O nº Binário correspondente é: " + binario1 + "\n");
		break;
		case 5:
			for (int i = 0; i < 100; ++i)  
			       System.out.println();
			long num5;
			System.out.println("\n Insira o nº Decimal: ");
			num5 = dados.nextInt();
			String octal1=Integer.toOctalString((int) num5);
			System.out.println("O nº Octal correspondente é: " + octal1 + "\n");
		break;
		case 6:
			for (int i = 0; i < 100; ++i)  
			       System.out.println();
			long num6;
			System.out.println("\n Insira o nº Decimal: ");
			num6 = dados.nextInt();
			String hexadecimal1=Integer.toHexString((int) num6);
			System.out.println("\n O nº Hexadecimal correspondente é: " + hexadecimal1 + "\n");
		break;
		case 0:
			for (int i = 0; i < 100; ++i)  
			       System.out.println();
System.out.print("FIM");
System.exit(0);
break;	

}
} while (menu!=7);
}

public static int cbtd(long num) // 1º caso - INICIO
{
int decimalNumber = 0, i = 0;
long remainder;
while (num != 0)
{
remainder = num % 10;
num /= 10;
decimalNumber += remainder * Math.pow(2, i);
++i;
}
return decimalNumber;
}                                         // 1º caso - FIM

public static int octal_decimal(long num2){    // 2º CASO - INICIO
    int decimal = 0;    
    int n = 0;    
    while(true){    
      if(num2 == 0){    
        break;    
      } else {    
          int temp = (int) (num2%10);    
          decimal += temp*Math.pow(8, n);    
          num2 = num2/10;    
          n++;    
       }    
    }    
    return decimal;    
}                                  // 2º CASO - FIM


public static int hexadecimal_decimal(String num3) {   // 3º caso - inicio
    String digits = "0123456789ABCDEF";
    num3 = num3.toUpperCase();
    int val = 0;
    for (int i = 0; i < num3.length(); i++) {
        char c = num3.charAt(i);
        int d = digits.indexOf(c);
        val = 16*val + d;
    }
    return val;
}                                      // 3º caso - fim

static int decimal_binario(long num4){           // 4º CASO - INICIO
    int container[] = new int[100];
    int i = 0;
    while (num4 > 0){
        container[i] = (int) (num4%2);
        i++;
        num4 = num4/2;
    }
    for (int j = i -1 ; j >= 0 ; j--){
        System.out.print(container[j]);
    }
	return i;
}                                                // 4º CASO - FIM
}

