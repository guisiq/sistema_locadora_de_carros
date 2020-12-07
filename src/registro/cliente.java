package registro;

import java.util.List;
import java.util.Scanner;

import registro.Usuario.Acesso;

public class Cliente implements ConsoleManager {

    private int id;
    private String nome;
    private String cpf;
    private String email;
    private Telefone telefone;
    private List<Locacao> listLocacao;
    private Usuario usuario ;


    //#region metodos getters e seters
   
    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public List<Locacao> getListLocacao() {
		return listLocacao;
	}

	public void setListLocacao(List<Locacao> listLocacao) {
		this.listLocacao = listLocacao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
    //#endregion

    //#region metodos construtores
    public Cliente(Integer id, String nome, String cpf, String email, Telefone telefone) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.usuario = new Usuario(nome , cpf, Acesso.CLIENTE );
    }
    public Cliente(){
    }
    //#endregion
    
    //#region sobrescrita de metodos 
    //#region consolemenager 
    
    @Override
	public void cadastro(Scanner leitor, int indentacao) {
        // Captura de dados pessoais - CLiente da Locadora
       
        System.out.print(ConsoleManager.indentar(indentacao));
        System.out.println("Informe o id do Cliente: ");
        setId(leitor.nextInt());
        leitor.nextLine(); 

        System.out.print(ConsoleManager.indentar(indentacao));
        System.out.println("Informe o Nome do Cliente: ");
        setNome(leitor.nextLine());
        leitor.nextLine();

        System.out.print(ConsoleManager.indentar(indentacao));
        System.out.println("Informe o CPF do Cliente: ");
        setCpf(leitor.nextLine());
        leitor.nextLine();
        
        System.out.print(ConsoleManager.indentar(indentacao));
        System.out.println("Informe o email do Cliente: ");
        setEmail(leitor.nextLine());
        leitor.nextLine();

        this.setTelefone(new Telefone());
        this.getTelefone().cadastro(leitor,indentacao+1);
        
        this.usuario = new Usuario(nome , cpf, Acesso.CLIENTE );
    
    }
	@Override
	public void impressao(int indentacao) {
        String auxImpressao ;
        String sIndentacao = ConsoleManager.indentar(indentacao);

        auxImpressao = sIndentacao + "Id      :"+this.getId()+"\n" ;
        auxImpressao = sIndentacao + "nome    :"+this.getNome()+"\n" ;
        auxImpressao = sIndentacao + "cpf     :"+this.getCpf()+"\n" ;
        auxImpressao = sIndentacao + "email   :"+this.getEmail()+"\n" ;
        System.out.printf(auxImpressao);
	}

	@Override
	public void impressao() {
        this.impressao(0);
    }
    
    //#endregion
    
    
    @Override
	public String toString() {
		return "Cliente [cpf=" + cpf + ", email=" + email + ", id=" + id + ", nome=" + nome + "]";
	}
    //#endregion

    
}
