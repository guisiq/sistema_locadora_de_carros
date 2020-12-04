
public class Usuario {
	enum Acesso {
		ADM, CLIENTE;
	}


	private String  login;
	private String  senha;
    private Acesso  acesso;
    private registro.cliente cliente;

	private static Usuario usuario = new Usuario("root", "admlogin", Acesso.ADM);
	private static Usuario usuario1 = new Usuario("client", "01234", Acesso.ADM);

	public Usuario(String login, String senha, Usuario.Acesso acesso) {
		this.login = login;
		this.senha = senha;
		this.acesso = acesso;
	}
}
