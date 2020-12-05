package registro;

import java.util.Scanner;

public class Telefone implements ConsoleManager {
    private String codicoDeArea;
    private String numero;

    // #region getters e setters
    public String getCodicoDeArea() {
        return codicoDeArea;
    }

    public void setCodicoDeArea(String codicoDeArea) {
        this.codicoDeArea = codicoDeArea;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    // #endregion

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
