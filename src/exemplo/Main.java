package exemplo;

import exemplo.api.Usuario;

public class Main {

	public static void main(String[] args) {
		Usuario usuario = new Usuario();
		
		System.out.println("Dados p�blicos: " + usuario.getDadosPublicos());
		System.out.println("Dados privados: " + usuario.getDadosPrivados());
	}

}
