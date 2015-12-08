public class UPC {

	public static boolean verificarUpc(String numero) {
		int soma = 0;
		for (int i = 1; i <= 12; i++) {
			if (i % 2 == 0) {
				soma = (Integer.parseInt(numero.substring(i - 1, i)) + soma);
			} else {
				soma = (Integer.parseInt(numero.substring(i - 1, i)) * 3) + soma;
			}
		}
		if ((soma % 10 == 0)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static String gerarDigito(String numero){
		int soma = 0;
		for (int i = 1; i <= 11; i++) {
			if (i % 2 == 0) {
				soma = (Integer.parseInt(numero.substring(i - 1, i)) + soma);
			} else {
				soma = (Integer.parseInt(numero.substring(i - 1, i)) * 3) + soma;
			}
		}
		return numero = numero.concat(String.valueOf(10-(soma%10)));
		
		
	}
		
}
