import java.util.Scanner;
import registro.*;
public class teste {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        LocacaoDiaria lDiaria = new LocacaoDiaria();
        lDiaria.cadastro(leitor, 1);
        System.out.println("fim teste");
    }
}
