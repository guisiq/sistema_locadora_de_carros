
import java.util.Scanner;


public class LocacaoExtendida extends Locacao {
    private float valorMes;
    private Integer quantidadeMeses;

    // #region getters e setters
    public Integer getQuantidadeMeses() {
        return quantidadeMeses;
    }

    public void setQuantidadeMeses(Integer quantidadeMeses) {
        this.quantidadeMeses = quantidadeMeses;
    }

    public float getValorMes() {
        return valorMes;
    }

    public void setValorMes(float valorMes) {
        this.valorMes = valorMes;
    }

    // #endregion

    @Override
    protected void calcularValor() {

    }

    @Override
    public void cadastro(Scanner leitor, int indentacao) {

        System.out.print(ConsoleManager.indentar(indentacao));
        System.out.print("imforme a data de locacao  :");
        this.setDatalocacao(ConsoleManager.lerdDate(leitor.next()));
        leitor.nextLine();

        System.out.print(ConsoleManager.indentar(indentacao));
        System.out.print("imforme a data de devolucao:");
        this.setDatalocacao(ConsoleManager.lerdDate(leitor.next()));
        leitor.nextLine();

        System.out.print(ConsoleManager.indentar(indentacao));
        System.out.print("imforme a data de devolucao:");
        this.setDatalocacao(ConsoleManager.lerdDate(leitor.next()));
        leitor.nextLine();

        System.out.print(ConsoleManager.indentar(indentacao));
        System.out.print("imforme o carro:");
        leitor.nextLine();

    }

    @Override
    public void impressao(int indentacao) {

        String auxImpressao, sIndentacao;
        sIndentacao = ConsoleManager.indentar(indentacao);
        auxImpressao = sIndentacao + "tipo               : extendida\n";
        auxImpressao = sIndentacao + "Data de locacao    :" + ConsoleManager.imprimirDate(this.getDatalocacao()) + "\n";
        auxImpressao += sIndentacao + "Data de devolucao  :" + ConsoleManager.imprimirDate(this.getDataDevolucao())
                + "\n";
        auxImpressao += sIndentacao + "valor              :" + this.getValor() + "\n";
        auxImpressao += sIndentacao + "kilometragen       :" + this.getKilometragen() + "\n";
        auxImpressao += sIndentacao + "Valor por mes      :" + this.getValorMes() + "\n";
        auxImpressao += sIndentacao + "quantidade de meses:" + this.getQuantidadeMeses() + "\n";
        auxImpressao += sIndentacao + "Carro              :\n";
        System.out.print(auxImpressao);
        this.getCarro().impressao((indentacao + 2));

    }

    @Override
    public void impressao() {
        this.impressao(0);

    }

    @Override
    public String toString() {
        return "LocacaoExtendida [quantidadeMeses=" + quantidadeMeses + ", valorMes=" + valorMes + "]";
    }
    
    
}
