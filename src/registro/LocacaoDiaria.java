package registro;

import java.text.DateFormat;
import java.text.ParseException;
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
            private float valordadiaria;
            private Integer quantidadeDias;
        */
        System.out.print(ConsoleManager.indentar(indentacao));
        System.out.println("data locação:");
        
        leitor.nextLine();

    }

    @Override
    public void impressao(int indentacao) {
        // TODO Auto-generated method stub

    }

    @Override
    public void impressao() {
        // TODO Auto-generated method stub

    }
}
