package registro;
import java.util.Scanner;

public interface ConsoleManager {
    public static void linparaLinha() {
        int i = 0;
        System.out.println("\r");
        while (i == 1000) {
            System.out.println("\0");
        }
        System.out.println("\r");
        System.out.println("\b");
    }

    public static String indentar(int indentacao) {
        String out = "";
        for (int i = 0; i < indentacao; i++) {
            out.concat("\t");
        }
        return out;
    }

    public void cadastro( Scanner leitor , int indentacao);

    public String impressao(boolean imprimir, int indentacao);

    public String impressao(boolean imprimir);
}
