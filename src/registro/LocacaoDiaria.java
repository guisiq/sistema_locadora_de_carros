package registro;

public class LocacaoDiaria extends Locacao {
    private float valordadiaria;
    private Integer quantidadeDias;

    @Override
    protected void calcularValor() {
        // TODO Auto-generated method stub

    }

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
}
