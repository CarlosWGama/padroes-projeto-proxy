package exemplo.api;

import exemplo.classes.IUsuario;

public class Usuario implements IUsuario {

	public String getDadosPublicos() {
		return "Nome, Email, Idade";
	}
	
	public String getDadosPrivados() {
		return "CPF, RG, Endereço, Telefone";
	}
}


