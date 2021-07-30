import java.util.Scanner;
/*Faça um programa que receba o peso do saco de ração e a quantidade de ração fornecida para caa animal, calule e mostre quanto restara de ração no saco apos a quantidade de dias digitada pelo usuario*/
public class SacoRacao{

	public static void main(String []args){
	
	System.out.println("*********Bem-Vindo!!!!*********");
	
	Scanner p = new Scanner (System.in);
	System.out.println("Digite o peso da racao em quilogramas: ");
	double peso = p.nextDouble();
	System.out.println("Digite a quantidade de racao do primeiro animal: ");
	double animal1 = p.nextDouble();
	System.out.println("Digite a quantidade de racao do segundo animal: ");
	double animal2 = p.nextDouble();
	System.out.println("Para quantos dias voce deseja calcular a racao? ");
	double dias = p.nextDouble();
	double pesoFinal = peso - dias *(animal1 + animal2);
	System.out.println(pesoFinal);
	
	}


}