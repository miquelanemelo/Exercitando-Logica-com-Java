import java.util.Scanner;
public class Idade{

	public static void main(String[]args){
		
		Scanner s = new Scanner (System.in);
		System.out.println("Qual o ano seu ano de nascimento? ");
		int nascimento = s.nextInt();
		System.out.println("Qual ano estamos?");
		int ano = s.nextInt();
		System.out.println("Qual o mes do seu aniversario?");
		int mesAniversario = s.nextInt();
		System.out.println("Em qual mes estamos?");
		int mes = s.nextInt();
		
		if(mesAniversario > mes){	
			int idade = ano - nascimento -1;
			System.out.println("Sua idade e " + idade);			
		}else{
			int idade = ano - nascimento;
			System.out.println("Sua idade e " + idade);
		}
	}
}