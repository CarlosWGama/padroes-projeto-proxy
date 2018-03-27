package exemplo;

import exemplo.classes.IUsuario;
import exemplo.classes.UsuarioProxy;

public class Main {

	public static void main(String[] args) {

		//Sem permiss�o
		IUsuario usuario = new UsuarioProxy("admin", "teste");
		System.out.println("Dados p�blicos: " + usuario.getDadosPublicos());
		System.out.println("Dados privados: " + usuario.getDadosPrivados());
		
		//Com permiss�o
		IUsuario usuario2 = new UsuarioProxy("admin", "admin");
		System.out.println("Dados p�blicos: " + usuario2.getDadosPublicos());
		System.out.println("Dados privados: " + usuario2.getDadosPrivados());
	}

}
