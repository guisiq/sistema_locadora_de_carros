
import java.util.Date;
import java.util.Scanner;

public class LocacaoExtendida extends Locacao {
    //private float valorMes;
    private Integer quantidadeMeses;

    // #region getters e setters
    public Integer getQuantidadeMeses() {
        return quantidadeMeses;
    }

    public void setQuantidadeMeses(Integer quantidadeMeses) {
        this.quantidadeMeses = quantidadeMeses;
    }

    // #endregion

    @Override
    protected void calcularValor() {

        long interTempo = (this.dataDevolucao.getTime() - this.datalocacao.getTime()) / 1000 / 60 / 60 / 24 / 30;

        if (interTempo % 1 > 0) {
            interTempo++;
        }

        this.setQuantidadeMeses((int) interTempo);

        if (getCarro().getCategoria() == Categoria.POPULAR) {
            this.valor = interTempo * 45f * 30 * 0.7f;
        } else if (getCarro().getCategoria() == Categoria.INTERMEDIÁRIO) {
            this.valor = interTempo * 80.90f * 30 * 0.7f;
        } else if (getCarro().getCategoria() == Categoria.LUXO) {
            this.valor = interTempo * 130.80f * 30 * 0.7f;
        }
    }

    @Override
    public void cadastro(Scanner leitor, int indentacao) {

        System.out.print(ConsoleManager.indentar(indentacao));
        System.out.print("informe o carro:");
        Menu.listarOsCarros(indentacao + 2, Menu.orderCarrosByCategoria);
        System.out.print(ConsoleManager.indentar(indentacao));
        System.out.print("digite o indice do carro :");
        leitor.nextLine();

        System.out.print(ConsoleManager.indentar(indentacao));
        System.out.print("informe a data de locacao:");
        this.setDatalocacao(ConsoleManager.lerdDate(leitor.next()));
        leitor.nextLine();

        System.out.print(ConsoleManager.indentar(indentacao));
        System.out.print("informe a data de devolucao:");
        this.setDatalocacao(ConsoleManager.lerdDate(leitor.next()));
        leitor.nextLine();

        this.calcularValor();

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
        return "LocacaoExtendida [quantidadeMeses=" + quantidadeMeses + "]";
    }

    public LocacaoExtendida(Date datalocacao, Date dataDevolucao, float kilometragen, Carro carro) {
        super(datalocacao, dataDevolucao, kilometragen, carro);
        this.calcularValor();
    }

    public LocacaoExtendida() {
    }

   
    
    
}
