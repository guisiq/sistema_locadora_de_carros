package registro;

import java.util.Scanner;

public class Cliente implements ConsoleManager {
    private String id;
    private String nome;
    private String cpf;
    private String email;

    //#region metodos getters e seters
   
    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public Cliente(String id, String nome, String cpf, String email) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
    }
    //#endregion
    
    //#region sobrescrita de metodos 
    
    @Override
	public void cadastro(Scanner leitor, int indentacao) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void impressao(int indentacao) {
        /*
        private String id;
        private String nome;
        private String cpf;
        private String email;
        */
        String imprecao ;
        String sIndentacao = ConsoleManager.indentar(indentacao);

        imprecao = sIndentacao + "Id      :"+this.getId()+"\n" ;
        imprecao = sIndentacao + "nome    :"+this.getNome()+"\n" ;
        imprecao = sIndentacao + "cpf     :"+this.getCpf()+"\n" ;
        imprecao = sIndentacao + "email   :"+this.getEmail()+"\n" ;
        System.out.printf(imprecao);
	}

	@Override
	public void impressao() {
        this.impressao(0);
	}

	@Override
	public String toString() {
		return "Cliente [cpf=" + cpf + ", email=" + email + ", id=" + id + ", nome=" + nome + "]";
	}
    //#endregion
    
}
