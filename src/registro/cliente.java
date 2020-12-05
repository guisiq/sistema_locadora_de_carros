package registro;

import java.util.Scanner;

public class Cliente implements ConsoleManager {
    private int id;
    private String nome;
    private String cpf;
    private String email;

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
    //#endregion

    //#region metodos construtores

    public Cliente(Integer id, String nome, String cpf, String email) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
    }
    //#endregion
    
    //#region sobrescrita de metodos 
    //#region consolemenager 
    
    @Override
	public void cadastro(Scanner leitor, int indentacao) {
        // Captura de dados pessoais - CLiente da Locadora
       
       /* System.out.print(ConsoleManager.indentar(indentacao));
        System.out.println("Informe o id do Cliente: ");
        setId(leitor.nextInt());
        leitor.nextLine(); */

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
	}
	@Override
	public void impressao(int indentacao) {
        /*
        private String id;
        private String nome;
        private String cpf;
        private String email;
        */
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
