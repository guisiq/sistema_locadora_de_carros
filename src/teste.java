import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        registro.Carro carro = new registro.Carro();
        System.out.println(carro);
        (new registro.Carro()).cadastro( new Scanner(System.in), 2);;
    }
}
