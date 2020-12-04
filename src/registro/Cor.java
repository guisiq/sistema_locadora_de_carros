package registro;

public enum Cor {
    PRETO("#000000"), PRATA("#bab8b5"), BRANCO("ffffff"), VERMELHO("ff0000");

    private String rgbCode;

    Cor(String rgbCode) {
        this.rgbCode = rgbCode;
    }

    public static Cor valueOf(int i ){
        if(i > Cor.values().length){
            return Cor.values()[i];
        }
        return null ;
    }

    // #region metodos getters e setters
    public String getRgbCode() {
        return rgbCode;
    }

    public void setRgbCode(String rgbCode) {
        this.rgbCode = rgbCode;
    }
    // #endregion
}