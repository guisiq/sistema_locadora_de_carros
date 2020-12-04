package registro;

public enum Cor {
    PRETO("#000000"), PRATA("#bab8b5"), BRANCO("ffffff"), VERMELHO("ff0000");

    String rgbCode;

    Cor(String rgbCode) {
        this.rgbCode = rgbCode;
    }
}