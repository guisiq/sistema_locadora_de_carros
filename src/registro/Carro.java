package registro;

import java.util.Date;
import java.util.Scanner;

public class Carro implements ConsoleManager {

    private Integer id;
    private String nome;
    private String placa;
    private Date dataDeaquisicao;
    private int ano;
    private String modelo;
    private Cor cor;
    private Categoria categoria;

    // #region getters e setters
    /**
     * @return Integer return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return String return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return Date return the dataDeaquisicao
     */
    public Date getDataDeaquisicao() {
        return dataDeaquisicao;
    }

    /**
     * @param dataDeaquisicao the dataDeaquisicao to set
     */
    public void setDataDeaquisicao(Date dataDeaquisicao) {
        this.dataDeaquisicao = dataDeaquisicao;
    }

    /**
     * @return int return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return String return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return Cor return the cor
     */
    public Cor getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(Cor cor) {
        this.cor = cor;
    }

    /**
     * @return Categoria return the categoria
     */
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    // #endregion
    // #region sobreescrita de metodos

    @Override
    public void cadastro(Scanner leitor,int indentacao) {

        System.out.print(ConsoleManager.indentar(indentacao));
        System.out.println("id:");
        this.id = leitor.nextInt();
        leitor.nextLine();
        
        System.out.print(ConsoleManager.indentar(indentacao));
        System.out.println("nome:");
        this.nome = leitor.nextLine();

        System.out.print(ConsoleManager.indentar(indentacao));
        System.out.println("placa:");
        this.placa = leitor.next();
        leitor.nextLine();
        
        System.out.print(ConsoleManager.indentar(indentacao));
        System.out.println("data de aquisiçao:");
        //this.dataDeaquisicao = leitor.next();
        leitor.nextLine();
        
        System.out.print(ConsoleManager.indentar(indentacao));
        System.out.println("ano:");
        this.ano= leitor.nextInt();
        leitor.nextLine();
        
        System.out.print(ConsoleManager.indentar(indentacao));
        System.out.println("modelo:");
        this.modelo = leitor.next();
        leitor.nextLine();
        
        System.out.print(ConsoleManager.indentar(indentacao));
        System.out.println("cor:");
        this.cor = Cor.valueOf(leitor.nextInt());
        //return;
    }

    @Override
    public String impressao(boolean imprimir, int indentacao) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String impressao(boolean imprimir) {
        // TODO Auto-generated method stub
        return null;
    }
    
    //#endregion
}
