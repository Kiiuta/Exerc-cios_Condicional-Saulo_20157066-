import java.util.Scanner;

public class exercício5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner leitor = new Scanner (System.in)) {
			float x;

			System.out.println("Digite um número e descubra se ele é Par ou Ímpar:");
			x = leitor.nextFloat(); 

			if (x%2==0) 
			System.out.println("O número "+x+" é par.");
			else
			System.out.println("O número "+x+" é ímpar.");
		}	
		
		
	}

}
