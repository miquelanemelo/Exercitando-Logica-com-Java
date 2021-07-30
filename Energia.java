import java.util.Scanner;
/*Sabe-se que o quilowatt custa um quinto do salario minimo. Faça um programa que receba o valor do salario minimo e a quantidade de quilowatts consumida por um residencia.
*/

public class Energia{

public static void main(String[]args){
	
	Scanner s = new Scanner(System.in);
		System.out.println("Digite o valor do salario: ");
		double salario = s.nextDouble();
		System.out.println("Digite a quantidade de quilowatt: ");
		int quilowatt = s.nextInt();
		double valorKw = salario / 5;
		double valorReais = valorKw * quilowatt;
		double desconto = valorReais * 15 / 100;
		double vDesconto = valorReais - desconto;
		System.out.println("O valor do quilowatt " + valorKw + " sua conta sem desconto ficou " + valorReais + " e com desconto ficou " + vDesconto);
		

}


}