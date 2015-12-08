import java.util.Scanner;


public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int aux = 0;
		
		do{
			System.out.println("Digete 1 para gerar digito verificador");
			System.out.println("Digete 2 para validar número UPC");
			System.out.println("Digete 3 para sair");
			aux = teclado.nextInt();
			
			switch (aux) {
			case 1:
				System.out.println("Digite o número UPC sem o digito verificador");
				String numero = teclado.next();
				if (numero.length() == 11) {
					System.out.println("O número UPC com o digito verificador é: " + UPC.gerarDigito(numero));
				}
				else{
					System.out.println("Número UPC incorreto");
				}
				break;
			case 2:
				System.out.println("Digite o número UPC");
				numero = teclado.next();
				if (numero.length() == 12) {
					if (UPC.verificarUpc(numero))
						System.out.println("UPC válido");
					else
						System.out.println("UPC inválido");
				}
				else{
					System.out.println("Número UPC incorreto");
				}				
				break;
			case 3:
				System.out.println("Tchau");
				break;

			default:
				System.out.println("Opção invalida");
				break;
			}
			
		}while(aux!=3);

	}

}
