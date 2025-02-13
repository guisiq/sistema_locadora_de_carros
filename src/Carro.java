
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
        this.checarplaca(leitor.next(),leitor);

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

    public void checarplaca(String placa,Scanner leitor ){
        leitor.nextLine();

        for (int i = 0; i < Registro.lCarros.size(); i++) {
            if(Registro.lCarros.get(i).getPlaca().equals(placa)){
                System.out.println("ja existe um carro com essa placa tente novamente ");
                this.checarplaca(leitor.next(),leitor);
            }
        }

        this.setPlaca(placa);
    }

        //#region Comparator Carro
    public static Comparator<Carro> orderCarrosByPlaca = ( obj1,obj2 )-> {
        return obj1.getPlaca().compareTo(obj2.getPlaca());
    };
    public static Comparator<Carro> orderCarrosBymodelo = ( obj1,obj2 )-> {
        return obj1.getModelo().compareTo(obj2.getModelo());
    };
    public static Comparator<Carro> orderCarrosByano = ( obj1,obj2 )-> {
        return obj1.getAno().compareTo( obj2.getAno() )  ;
    };
    public static Comparator<Carro> orderCarrosByDataDeAquisicao = ( obj1,obj2 )-> {
        return obj1.getDataDeaquisicao().compareTo( obj2.getDataDeaquisicao() )  ;
    };
    public static Comparator<Carro> orderCarrosByCategoria = ( obj1,obj2 )-> {
        Integer num1 = obj1.getCategoria().ordinal()  ;
        Integer num2 = obj2.getCategoria().ordinal()  ;
        return num1.compareTo( num2 )  ;
    };
    public static Comparator<Carro> orderCarrosByCor = ( obj1,obj2 )-> {
        String s1 = obj1.getCor().getRgbCode()  ;
        String s2 = obj1.getCor().getRgbCode()  ;
        return s1.compareTo(s2)  ;
    };
    //#endregion
  
    
}
