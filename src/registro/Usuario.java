package registro;

public class Usuario {
	public enum Acesso {
		ADM, CLIENTE;
	}

	private String login;
	private String senha;
	private Acesso acesso;

	private static Usuario usuario = new Usuario("root", "admlogin", Acesso.ADM);
	// private static Usuario usuario1 = new Usuario("client", "01234", Acesso.ADM);

	public Usuario(String login, String senha, Usuario.Acesso acesso) {
		this.login = login;
		this.senha = senha;
		this.acesso = acesso;
	}
	
	//#region getters e setters
    /**
     * @return String return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return String return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return Acesso return the acesso
     */
    public Acesso getAcesso() {
        return acesso;
    }

    /**
     * @param acesso the acesso to set
     */
    public void setAcesso(Acesso acesso) {
        this.acesso = acesso;
	}
	//#endregion

}
