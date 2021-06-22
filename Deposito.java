public class Deposito{

	public static void main(String []args){
	
	double deposito = 500.00; double taxa = 0.08; 
	double rendimento = deposito + taxa/100;
	double total = deposito + rendimento/100;
	
	System.out.println("O deposito foi de R$ "+ deposito + " rendimento de " + taxa +" o total foi " + total );
	
	
	}


}