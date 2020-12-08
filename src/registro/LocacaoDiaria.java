package registro;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class LocacaoDiaria extends Locacao {
    private float valordadiaria;
    private Integer quantidadeDias;

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
    protected void calcularValor() {
        // TODO Auto-generated method stub

    }

    @Override
    public void cadastro(Scanner leitor, int indentacao){
        // TODO Auto-generated method stub
        /**
            protected int idlocacao;
            protected Date datalocacao;
            protected Date dataDevolucao;
            //protected float valor;
            protected float kilometragen;
            protected Carro carro;
        */ 
        
        
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

}
