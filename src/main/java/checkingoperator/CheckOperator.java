package checkingoperator;

public class CheckOperator {

	
	
	public int checkOperator(String numero) {
		int reponse;
		if (numero.length() == 12) {
			numero = numero.substring(3, 11);
		}
		if (numero.charAt(1) == '5') {
			if (numero.charAt(2) == '0' || numero.charAt(2) == '1' || numero.charAt(2) == '2' || numero.charAt(2) == '3'
					|| numero.charAt(2) == '4') {
				reponse = 1;

			} else {
				reponse = 2;
			}
		} else {
			if (numero.charAt(1) == '6') {
				reponse = 3;
			} else {
				if (numero.charAt(1) == '7') {
					reponse = 1;
				} else {
					if (numero.charAt(1) == '8') {
						if (numero.charAt(2) == '0' || numero.charAt(2) == '1' || numero.charAt(2) == '2'
								|| numero.charAt(2) == '3' || numero.charAt(2) == '4') {
							reponse = 1;

						} else {
							reponse = 3;
						}
					} else {
						if (numero.charAt(1) == '9') {
							reponse = 2;
						}
						else {
							if(numero.charAt(1)=='2') {
								reponse=4;
							}else {
								reponse=0;
							}
						}
					}
				}
			}
		}
		return reponse;
	}

}
