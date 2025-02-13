import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public interface ConsoleManager {
   
    public static void limparConsole() {
        System.out.print("\033[H\033[2J");
    }

    public static String indentar(int indentacao) {
        String out = "";
        for (int i = 0; i < indentacao; i++) {
            out += "  ";
        }
        return out;
    }

    public static Date lerdDate(String s ){
        Date date = null;
        try {
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            date = df.parse(s) ;
        } catch (Exception e) {
            System.out.println("Houve um erro inesperado");
            
        }
        return date ;
    }

    public static String imprimirDate(Date data) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(data);
    }

    public void cadastro( Scanner leitor , int indentacao);

    public void impressao( int indentacao);

    public void impressao();
}

