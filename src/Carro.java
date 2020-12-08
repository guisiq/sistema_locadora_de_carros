
import java.util.Date;
import java.util.Scanner;


public class Carro implements ConsoleManager {

    private String placa;
    private Date dataDeaquisicao;
    private Integer ano;
    private String modelo;
    private Cor cor;
    private Categoria categoria;

    // #region construtores
    public Carro(String placa, Date dataDeaquisicao, int ano, String modelo, Cor cor, Categoria categoria) {
        this.placa = placa;
        this.dataDeaquisicao = dataDeaquisicao;
        this.ano = ano;
        this.modelo = modelo;
        this.cor = cor;
        this.categoria = categoria;
    }

    public Carro() {

    }
    // #endregion

    // #region getters e setters

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
    public Integer getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(Integer ano) {
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

    // #region sobrescrita de metodos
    @Override
    public void cadastro(Scanner leitor, int indentacao) {

        System.out.print(ConsoleManager.indentar(indentacao));
        System.out.print("Informe a placa do Veículo    :");
        setPlaca(leitor.next());
        leitor.nextLine();

        System.out.print(ConsoleManager.indentar(indentacao));
        System.out.print("Informe a data de aquisiçao   :");
        this.setDataDeaquisicao(ConsoleManager.lerdDate(leitor.next()));
        leitor.nextLine();

        System.out.print(ConsoleManager.indentar(indentacao));
        System.out.print("Informe o ano de fabricação   :");
        setAno(leitor.nextInt());
        leitor.nextLine();

        System.out.print(ConsoleManager.indentar(indentacao));
        System.out.print("Informe o modelo do veículo   :");
        setModelo(leitor.next());
        leitor.nextLine();

        System.out.print(ConsoleManager.indentar(indentacao));
        System.out.print("informe o códico da cor       :");
        Cor.imprimir(indentacao + 3);
        System.out.print(ConsoleManager.indentar(indentacao));
        System.out.print("                              :");
        setCor(Cor.valueOf(leitor.nextInt()));
        leitor.nextLine();

        System.out.print(ConsoleManager.indentar(indentacao));
        System.out.println("infoeme o código da categoria:");
        Categoria.imprimir(indentacao + 3);
        System.out.print(ConsoleManager.indentar(indentacao));
        System.out.print("                              :");
        this.setCategoria(Categoria.valueOf(leitor.nextInt()));
        leitor.nextLine();
        // return;
    }

    @Override
    public void impressao(int indentacao) {
        String impressao = "";
        String sIndentacao = ConsoleManager.indentar(indentacao);

        // impressao += sIndentacao + "Id :"+this.getId()+"\n" ;
        impressao += sIndentacao + "Placa             :" + this.getPlaca() + "\n";
        impressao += sIndentacao + "Data de aquisicao :" + ConsoleManager.imprimirDate(this.getDataDeaquisicao())
                + "\n";
        impressao += sIndentacao + "Ano               :" + this.getAno() + "\n";
        impressao += sIndentacao + "modelo            :" + this.getModelo() + "\n";
        impressao += sIndentacao + "cor               :" + this.getCor().toString() + "\n";
        impressao += sIndentacao + "categoria         :" + this.getCategoria().toString() + "\n";
        System.out.println(impressao);
    }

    @Override
    public void impressao() {
        impressao(0);
    }

    @Override
    public String toString() {
        return " Carro [ano=" + ano + ", categoria=" + categoria + ", cor=" + cor + ", dataDeaquisicao="
                + dataDeaquisicao + ", modelo=" + modelo + /* ", nome=" + nome + */ ", placa=" + placa + "]";
    }
    // #endregion

}
