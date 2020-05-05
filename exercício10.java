import java.util.Scanner;
public class exercício10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sexo1 = "Masculino";
		String sexo2 = "Feminino";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o sexo: ");
		String sexo = sc.nextLine();
		
		System.out.println("Digite a altura:");
		Float altura = sc.nextFloat();
		
		float imcmasc = (float) ((72.7* altura) - 58);
		float imcfem = (float) ((62.1 * altura) - 44.7);
		
		if( sexo.equals(sexo1)){
			
			System.out.println("O seu peso ideal é: "+imcmasc);
		}
			
			else if(sexo.contentEquals(sexo2)) {
				
			
				System.out.println("O seu peso ideal é:" +imcfem);
				
				
				
						
		}

	}
}
