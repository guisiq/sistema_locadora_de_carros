

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class LocacaoDiaria extends Locacao {
    private Integer quantidadeDias;
    // #region getters e setters

    public Integer getQuantidadeDias() {
        return quantidadeDias;
    }

    public void setQuantidadeDias(Integer quantidadeDias) {
        this.quantidadeDias = quantidadeDias;
    }

    // #endregion

    //#region construtores
    
    public LocacaoDiaria( Date datalocacao, Date dataDevolucao, float kilometragen, Carro carro) {
        super(datalocacao, dataDevolucao, kilometragen, carro);
        this.calcularValor();
    }

    public LocacaoDiaria() {
    }

    //#endregion


    @Override
    public void cadastro(Scanner leitor, int indentacao){
        
        System.out.print(ConsoleManager.indentar(indentacao));
        System.out.print("digite o indice do carro :");
        Menu.listarOsCarros(indentacao+2,Menu.orderCarrosByCategoria);
        System.out.print(ConsoleManager.indentar(indentacao));
        int aux = leitor.nextInt();
        if (aux > Registro.lCarros.size()) {
            this.setCarro(Registro.lCarros.get(leitor.nextInt()));
        } else {
            this.setCarro(Registro.lCarros.get(Registro.lCarros.size()-1));
        }
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
    protected void calcularValor() {
        
        long interTempo = (this.dataDevolucao.getTime() - this.datalocacao.getTime()) /1000/60/60/24 ;
        
        if(interTempo % 1 > 0 ){
            interTempo++;
        }

        this.setQuantidadeDias((int) interTempo) ;

        if(getCarro().getCategoria() == Categoria.POPULAR){
            this.valor = interTempo* 45f*30*0.7f;
        }
        else if(getCarro().getCategoria() == Categoria.INTERMEDIÁRIO){
            this.valor = interTempo*80.90f*30*0.7f;
        }
        else if(getCarro().getCategoria() == Categoria.LUXO){
            this.valor = interTempo*130.80f*30*0.7f;
        }
    }

    @Override
    public String toString() {
        return "LocacaoDiaria [quantidadeDias=" + quantidadeDias + "]";
    }

}
