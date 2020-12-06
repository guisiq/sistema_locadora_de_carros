package registro;

import java.util.Scanner;

public class Telefone implements ConsoleManager {
    private String codigoDeArea;
    private String numero;
    
    public Telefone(String codigoDeArea, String numero) {
        this.codigoDeArea = codigoDeArea;
        this.numero = numero;
    }

    // #region getters e setters
    public String getCodigoDeArea() {
        return codigoDeArea;
    }

    public void setCodigoDeArea(String codigoDeArea) {
        this.codigoDeArea = codigoDeArea;
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
