package verificarnumero;
import java.util.Scanner;

public class Verificarnumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número:");
		int numero = sc.nextInt();
		
		if(numero > 0) {
			System.out.println("O numero é positivo");
		} else if (numero < 0) {
			System.out.println("O numero é negativo");
		} else {
			System.out.println("O numero é zero");
		}

		sc.close();
	}

}
