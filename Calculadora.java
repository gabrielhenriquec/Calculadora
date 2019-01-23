import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int n1, n2, soma, sub, m, d;
		int operacao = 0;

		System.out.println("============Calculadora============");
		
		System.out.println("Digite o primeiro número: ");
		n1 = leia.nextInt();
		
		System.out.println("Digite o segundo número: ");
		n2 = leia.nextInt();
		
		System.out.println("Informe a operação(1 - soma / 2 - subtração / 3 - multiplicação / 4 - divisão: ");
		operacao = leia.nextInt();
		
		if(operacao == 1) {
			soma = n1+n2;
			System.out.println("O resultado da soma é: " + soma);
		}
		
		if(operacao == 2) {
			sub = n1-n2;
			System.out.println("O resultado da soma é: " + sub);
		}
		
		if(operacao == 3) {
			m = n1*n2;
			System.out.println("O resultado da soma é: " + m);
		}
		
		if(operacao == 4) {
			d = n1/n2;
			System.out.println("O resultado da soma é: " + d);
		}
		
	}

}
