

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;



public class LocacaoDiaria extends Locacao {
    private float valordadiaria;
    private Integer quantidadeDias;
    protected Categoria categoria;
    // #region getters e setters

    /**
     * @return float return the valordadiaria
     */
    public float getValordadiaria() {
        return valordadiaria;
    }

    /**
     * @param valordadiaria the valordadiaria to set
     */
    public void setValordadiaria(float valordadiaria) {
        this.valordadiaria = valordadiaria;
    }

    /**
     * @return Integer return the quantidadeDias
     */
    public Integer getQuantidadeDias() {
        return quantidadeDias;
    }

    /**
     * @param quantidadeDias the quantidadeDias to set
     */
    public void setQuantidadeDias(Integer quantidadeDias) {
        this.quantidadeDias = quantidadeDias;
    }
    // #endregion

    //#region construtores
    
    public LocacaoDiaria( Date datalocacao, Date dataDevolucao, float kilometragen, Carro carro,
            int quantidadeDias) {
        super(datalocacao, dataDevolucao, kilometragen, carro);
        this.quantidadeDias = quantidadeDias;
    }

    public LocacaoDiaria() {
    }

    //#endregion


    @Override
    public void cadastro(Scanner leitor, int indentacao){
        
        System.out.print(ConsoleManager.indentar(indentacao));
        System.out.print("imforme o carro:");
        Menu.listarOsCarros(indentacao+2,Menu.orderCarrosByCategoria);
        System.out.print(ConsoleManager.indentar(indentacao));
        System.out.print("digite o indice do carro :");
        leitor.nextLine();


        System.out.print(ConsoleManager.indentar(indentacao));
        System.out.print("imforme a data de locacao  :");
        this.setDatalocacao(ConsoleManager.lerdDate(leitor.next()));
        leitor.nextLine();

        System.out.print(ConsoleManager.indentar(indentacao));
        System.out.print("imforme a data de devolucao:");
        this.setDatalocacao(ConsoleManager.lerdDate(leitor.next()));
        leitor.nextLine();

        //this.calcularValor();

        
        /**    
            private float valordadiaria;
            private Integer quantidadeDias;
        */


    }

    @Override
    public void impressao(int indentacao) {

        String auxImpressao,sIndentacao;
        sIndentacao   = ConsoleManager.indentar(indentacao);
        auxImpressao  = sIndentacao + "tipo               : locacao Diaria\n" ;
        auxImpressao  = sIndentacao + "Data de locacao    :"+ConsoleManager.imprimirDate(this.getDatalocacao())+"\n" ;
        auxImpressao += sIndentacao + "Data de devolucao  :"+ConsoleManager.imprimirDate(this.getDataDevolucao())+"\n" ;
        auxImpressao += sIndentacao + "valor              :" + this.getValor() + "\n" ;
        auxImpressao += sIndentacao + "kilometragen       :" + this.getKilometragen() + "\n" ;
        auxImpressao += sIndentacao + "Valor da diaria    :" + this.getValordadiaria() + "\n" ;
        auxImpressao += sIndentacao + "quantidade de dias :" + this.getQuantidadeDias() + "\n" ;
        auxImpressao += sIndentacao + "Carro              :\n" ;        
        System.out.print(auxImpressao);
        this.getCarro().impressao((indentacao+2));

    }

    @Override
    public void impressao() {
        impressao( 0 );
    }

    @Override
    public String toString() {
        return "LocacaoDiaria [quantidadeDias=" + quantidadeDias + ", valordadiaria=" + valordadiaria + "]";
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    

}
