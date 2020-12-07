import java.util.Scanner;
import registro.*;
public class teste {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Menu.listarOsClientes(0,Menu.orderClienteBynome);
        System.out.println("fim teste");
    }
}
