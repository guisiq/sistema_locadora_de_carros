import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
public class teste {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //LocacaoExtendida loExtendida = new LocacaoExtendida();
        //loExtendida.cadastro(leitor,1);
        Menu.listarOsCarros(2,Menu.orderCarrosByCategoria);
        //Menu.menuCliente(1, leitor);

        System.out.println("fim teste");
    }
}
