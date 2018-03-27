package exemplo.classes;

import exemplo.api.Usuario;

public class UsuarioProxy implements IUsuario {

	private String login;
	private String senha;
	private Usuario usuario = new Usuario();
	
	public UsuarioProxy(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	public String getDadosPublicos() {
		return usuario.getDadosPublicos();
	}
	
	public String getDadosPrivados() {
		if (login.equals("admin") && senha.equals("admin"))
			return usuario.getDadosPrivados();
		return "";
	}
}
