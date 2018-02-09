package binario_para_decimal;

import java.util.Scanner;

public class binario_para_decimal {

public static void main(String[] args) {

	Scanner dados = new Scanner (System.in);
	long num;
	System.out.println("Qual o numero binario?");
	num = dados.nextInt();
     int decimal = convertBinaryToDecimal(num);
    System.out.printf("%d em Binário = %d em Decimal", num, decimal);
}

public static int convertBinaryToDecimal(long num)
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
}
}
