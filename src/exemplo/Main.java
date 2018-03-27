package exemplo;

import exemplo.classes.IUsuario;
import exemplo.classes.UsuarioProxy;

public class Main {

	public static void main(String[] args) {

		//Sem permissão
		IUsuario usuario = new UsuarioProxy("admin", "teste");
		System.out.println("Dados públicos: " + usuario.getDadosPublicos());
		System.out.println("Dados privados: " + usuario.getDadosPrivados());
		
		//Com permissão
		IUsuario usuario2 = new UsuarioProxy("admin", "admin");
		System.out.println("Dados públicos: " + usuario2.getDadosPublicos());
		System.out.println("Dados privados: " + usuario2.getDadosPrivados());
	}

}
