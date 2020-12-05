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

    //#region construtores
  public Carro(Integer id, String nome, String placa, Date dataDeaquisicao, int ano, String modelo, Cor cor,
  Categoria categoria) {
    this.id = id;
    this.nome = nome;
    this.placa = placa;
    this.dataDeaquisicao = dataDeaquisicao;
    this.ano = ano;
    this.modelo = modelo;
    this.cor = cor;
    this.categoria = categoria;
}
    //#endregion

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
    
    // #region sobrescrita de metodos - impressão
    @Override
    public void cadastro(Scanner leitor,int indentacao) {

        System.out.print(ConsoleManager.indentar(indentacao));
        System.out.println("id:");
        setId(leitor.nextInt());
        leitor.nextLine();
        
        System.out.print(ConsoleManager.indentar(indentacao));
        System.out.println("nome:");
        setNome(leitor.nextLine());
        leitor.nextLine();

        System.out.print(ConsoleManager.indentar(indentacao));
        System.out.println("placa:");
        setPlaca(leitor.next());
        leitor.nextLine();
        
        System.out.print(ConsoleManager.indentar(indentacao));
        System.out.println("data de aquisiçao:");
        //setDataDeaquisicao(leitor.next());
        leitor.nextLine();
        
        System.out.print(ConsoleManager.indentar(indentacao));
        System.out.println("ano:");
        setAno(leitor.nextInt());
        leitor.nextLine();
        
        System.out.print(ConsoleManager.indentar(indentacao));
        System.out.println("modelo:");
        setModelo(leitor.next());
        leitor.nextLine();
        
        System.out.print(ConsoleManager.indentar(indentacao));
        System.out.println("cor:");
        setCor(Cor.valueOf(leitor.nextInt()));
        //return;
    }

    @Override
    public void impressao(int indentacao) {
        String impressao = "";
        String sIndentacao = ConsoleManager.indentar(indentacao);

        /*
        private Integer id;
        private String nome;
        private String placa;
        private Date dataDeaquisicao;
        private int ano;
        private String modelo;
        private Cor cor;
        private Categoria categoria;*/
        
        impressao = sIndentacao + "Id                :"+this.getId()+"\n" ;
        impressao = sIndentacao + "Nome              :"+this.getNome()+"\n" ;
        impressao = sIndentacao + "Placa             :"+this.getPlaca()+"\n" ;
        impressao = sIndentacao + "Data de aquisicao :"+this.getDataDeaquisicao()+"\n" ;
        impressao = sIndentacao + "Ano               :"+this.getAno()+"\n" ;
        impressao = sIndentacao + "modelo            :"+this.getModelo()+"\n" ;
        impressao = sIndentacao + "cor               :"+this.getCor().name()+"\n" ;
        impressao = sIndentacao + "categoria         :"+this.getCategoria().name()+"\n" ;
        System.out.println(impressao);
    }

    @Override
    public void impressao() {
        impressao(0);
    }

    @Override
    public String toString() {
        return " Carro [ano=" + ano + ", categoria=" + categoria + ", cor=" + cor + ", dataDeaquisicao="
                + dataDeaquisicao + ", id=" + id + ", modelo=" + modelo + ", nome=" + nome + ", placa=" + placa + "]";
    }
    //#endregion

  



}
