import java.util.Scanner;


public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int aux = 0;
		
		do{
			System.out.println("Digete 1 para gerar digito verificador");
			System.out.println("Digete 2 para validar n�mero UPC");
			System.out.println("Digete 3 para sair");
			aux = teclado.nextInt();
			
			switch (aux) {
			case 1:
				System.out.println("Digite o n�mero UPC sem o digito verificador");
				String numero = teclado.next();
				if (numero.length() == 11) {
					System.out.println("O n�mero UPC com o digito verificador �: " + UPC.gerarDigito(numero));
				}
				else{
					System.out.println("N�mero UPC incorreto");
				}
				break;
			case 2:
				System.out.println("Digite o n�mero UPC");
				numero = teclado.next();
				if (numero.length() == 12) {
					if (UPC.verificarUpc(numero))
						System.out.println("UPC v�lido");
					else
						System.out.println("UPC inv�lido");
				}
				else{
					System.out.println("N�mero UPC incorreto");
				}				
				break;
			case 3:
				System.out.println("Tchau");
				break;

			default:
				System.out.println("Op��o invalida");
				break;
			}
			
		}while(aux!=3);

	}

}
