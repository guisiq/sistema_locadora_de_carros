

import java.util.List;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;

public class Cliente implements ConsoleManager {

    private String nome,cpf,email;
    private Telefone telefone;
    private List<Locacao> listLocacao;
    private Usuario usuario ;


    //#region metodos getters e seters

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
    public Cliente( String nome, String cpf, String email, Telefone telefone) {
		this.nome = nome;
		this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.usuario = new Usuario(nome , cpf, Usuario.Acesso.CLIENTE );
    }
    public Cliente( String nome, String cpf, String email, Telefone telefone ,Locacao[] listLocacao) {
		this.nome = nome;
		this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.usuario = new Usuario(nome , cpf, Usuario.Acesso.CLIENTE );
        this.listLocacao = new ArrayList<Locacao>();
        this.listLocacao.addAll(Arrays.asList(listLocacao));
    }
    public Cliente(){
    }
    //#endregion
    
    //#region sobrescrita de metodos 
    
    //#region ConsoleManager 
    
    @Override
	public void cadastro(Scanner leitor, int indentacao) {
        
        System.out.print(ConsoleManager.indentar(indentacao));
        System.out.print("Informe o Nome do Cliente :");
        setNome(leitor.nextLine());

        System.out.print(ConsoleManager.indentar(indentacao));
        System.out.print("Informe o CPF do Cliente  :");
        checarCpf(leitor.next(),leitor);
        
        System.out.print(ConsoleManager.indentar(indentacao));
        System.out.print("Informe o email do Cliente:");
        setEmail(leitor.nextLine());

        this.setTelefone(new Telefone());
        this.getTelefone().cadastro(leitor,indentacao+2);
        
        this.usuario = new Usuario(nome , cpf, Usuario.Acesso.CLIENTE );
    
    }
	@Override
	public void impressao(int indentacao) {
        
        String auxImpressao,sIndentacao;
        sIndentacao = ConsoleManager.indentar(indentacao);
        auxImpressao  = sIndentacao + "nome    :"+this.getNome()+"\n" ;
        auxImpressao += sIndentacao + "cpf     :"+this.getCpf()+"\n" ;
        auxImpressao += sIndentacao + "email   :"+this.getEmail()+"\n" ;
        auxImpressao += sIndentacao + "Telefone:\n" ;
        System.out.print(auxImpressao);
        this.getTelefone().impressao((indentacao+1));

	}
	@Override
	public void impressao() {
        this.impressao(0);
    }
    //#endregion
    @Override
	public String toString() {
		return "Cliente [cpf=" + cpf + ", email=" + email + ", nome=" + nome + "]";
	}
    //#endregion

    public void update(Scanner leitor, int indentacao) {
        
        System.out.print(ConsoleManager.indentar(indentacao));
        System.out.print("Informe o Nome do Cliente :");
        setNome(leitor.nextLine());

        System.out.print(ConsoleManager.indentar(indentacao));
        System.out.print("Informe o email do Cliente:");
        setEmail(leitor.nextLine());

        this.setTelefone(new Telefone());
        this.getTelefone().cadastro(leitor,indentacao+2);
        
        this.usuario = new Usuario( this.nome , this.cpf, Usuario.Acesso.CLIENTE );
    
    }
    public void checarCpf(String cpf,Scanner leitor ){
        leitor.nextLine();
    
        for (int i = 0; i < Registro.lClientes.size(); i++) {
            if(Registro.lClientes.get(i).getCpf().equals(cpf)){
                System.out.println("ja existe um cliente com esse cpf tente novamente ");
                this.checarCpf(leitor.next(),leitor);
            }
        }

        setCpf(cpf);
    }
    
     //#region Comparator de cliente 
     public static Comparator<Cliente> orderClienteByNome = ( obj1,obj2 )-> {
        String s1 = obj1.getNome();
        String s2 = obj1.getNome();
        return s1.compareTo(s2)  ;
    };
    
    public static Comparator<Cliente> orderClienteByEmail = ( obj1,obj2 )-> {
        String s1 = obj1.getEmail();
        String s2 = obj1.getEmail();
        return s1.compareTo(s2)  ;
    };
    //#endregion
    
    

    
}
