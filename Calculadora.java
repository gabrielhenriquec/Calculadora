import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int n1, n2, soma, sub, m, d;
		int operacao = 0;

		System.out.println("============Calculadora============");
		
		System.out.println("Digite o primeiro n�mero: ");
		n1 = leia.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		n2 = leia.nextInt();
		
		System.out.println("Informe a opera��o(1 - soma / 2 - subtra��o / 3 - multiplica��o / 4 - divis�o: ");
		operacao = leia.nextInt();
		
		if(operacao == 1) {
			soma = n1+n2;
			System.out.println("O resultado da soma �: " + soma);
		}
		
		if(operacao == 2) {
			sub = n1-n2;
			System.out.println("O resultado da soma �: " + sub);
		}
		
		if(operacao == 3) {
			m = n1*n2;
			System.out.println("O resultado da soma �: " + m);
		}
		
		if(operacao == 4) {
			d = n1/n2;
			System.out.println("O resultado da soma �: " + d);
		}
		
	}

}
