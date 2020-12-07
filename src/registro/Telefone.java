package registro;

import java.util.Scanner;

public class Telefone implements ConsoleManager {
    private String codigoDeArea,numero;
    
    //#region métodos construtores
    public Telefone(String codigoDeArea, String numero) {
        this.codigoDeArea = codigoDeArea;
        this.numero = numero;
    }
    public Telefone() {
    } 
    //#endregion

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
        System.out.print(ConsoleManager.indentar(indentacao));
        System.out.print("Informe o código de Área do telefone: ");
        setCodigoDeArea(leitor.nextLine());

        System.out.print(ConsoleManager.indentar(indentacao));
        System.out.print("Informe o número de  telefone       : ");
        setNumero(leitor.nextLine());

    }

    @Override
    public void impressao(int indentacao) {
        String auxImpressao,sIndentacao;
        sIndentacao = ConsoleManager.indentar(indentacao);

        auxImpressao  = sIndentacao + "codico de area :"+this.getCodigoDeArea()+"\n" ;
        auxImpressao += sIndentacao + "numero         :"+this.getNumero()+"\n" ;
        System.out.print(auxImpressao);
    }

    @Override
    public void impressao() {
        this.impressao(0);
    }
	@Override
	public String toString() {
		return "Telefone [codigoDeArea=" + codigoDeArea + ", numero=" + numero + "]";
	}
}
