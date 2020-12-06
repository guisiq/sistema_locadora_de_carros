package registro;

public enum Cor {
    PRETO("#000000"), PRATA("#bab8b5"), BRANCO("ffffff"), VERMELHO("ff0000"),AZUL("3744ff"),LARANJA("eb6809"),MARROM("381800");

    private String rgbCode;

    Cor(String rgbCode) {
        this.rgbCode = rgbCode;
    }

    public static void imprimir(int indentacao){
        for (int i = 0; i < Cor.values().length; i++) {
            System.out.print(ConsoleManager.indentar(indentacao));
            System.out.println(i + Cor.values()[i].name()+": #"+Cor.values()[i].rgbCode );
        }
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