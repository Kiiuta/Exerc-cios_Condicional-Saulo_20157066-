import java.util.Scanner;

public class exercício4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner leitor = new Scanner(System.in)) {
			int x,y;

			System.out.println("Digite um número:");
			x=leitor.nextInt();
			System.out.println("Digite outro número:");
			y=leitor.nextInt();

			if (x>y)
			System.out.println("Em ordem decrescente eles ficam assim: "+x+","+y);
			if (y>x)
			System.out.println("Em ordem decrescente eles ficam assim: "+y+","+x);
		}
		
		
		
	}

}
