import java.util.Scanner;

public class Macas {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		System.out.println("Quantas macas desejada?");
		int numMacas;
		double numValor;
		
		numMacas = tc.nextInt();
		
		if (numMacas < 12) {
		    numValor= 0.30; 
		} else { 
			numValor= 0.25;	
		}
		double numTotal= (numValor * numMacas);
	    System.out.printf("Valor da compra : %.2f", numTotal);
	    
	    tc.close();
	    
	    
	}
}
