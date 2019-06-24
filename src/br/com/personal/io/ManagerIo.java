package br.com.personal.io;

public class ManagerIo {
	public static int VALOR = 0;
	private static String typeFuel[] = new String[VALOR];
	
	public static String verificaTipoCombustivel(int tipoComb) {
		String typeFuel = null;
		
		for (int i = 0; i < typeFuel.length(); i++) {
			
		}
		
		if(tipoComb == 1) {
			typeFuel = "Gasolina";
		}else if(tipoComb == 2) {
			typeFuel = "Gasolina Aditivada";
		}else if(tipoComb == 3) {
			typeFuel = "Etanol Comum";
		}else if(tipoComb == 4) {
			typeFuel = "Etanol Aditivado";
		}else if(tipoComb == 5) {
			typeFuel = "Diesel";
		}else if(tipoComb == 6) {
			typeFuel = "Outros";
		}else {
			System.out.println("Opção inválida!");
			System.exit(0);
		}
		return typeFuel;
	}
	
	public static void registraPrecoCombustivel() {
		
	}
	public void solicitaRegistro() {
		
	}
}
