package registro;

import java.util.Scanner;

public class LocacaoExtendida extends Locacao {
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

    }

    @Override
    public void cadastro(Scanner leitor, int indentacao) {
        // TODO Auto-generated method stub

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
