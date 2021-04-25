import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class DesafioDoGuizao {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<Integer>();
		ArrayList<Integer> lista = new ArrayList<Integer>();
		Random random = new Random();
		int acertos = 0;
		
		for(int i = 0; i < 6; i++) {
			int numero1Aleatorio = random.nextInt(60);
			array.add(numero1Aleatorio);
		}
		
		for(int i = 0; i < 6; i++) {
			System.out.println("Digite um numero:");
			int numeroDigitado = scanner.nextInt();
			if(numeroDigitado <= 60 || numeroDigitado <= 0) {
				lista.add(numeroDigitado);
			}else {
				System.out.println("O número deve ser entre 0 e 60");
			}	
		}
		
		for(int i = 0; i < array.size(); i++) {
			int teste1 = array.get(i);
			for(int j = 0; j < lista.size(); j++) {
				int teste2 = lista.get(j);
				int resultado = Integer.compare(teste1, teste2);
				if(resultado == 0) {
					acertos++;
				}
			}
		}
		System.out.println("Você acertou: " + acertos);
		System.out.println("Mega do Guizão: " + array);
		System.out.println("Sua cartela de Números: " + lista);
		scanner.close();
		
	}
	
	
}
