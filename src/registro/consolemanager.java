package registro;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public interface ConsoleManager {
   
    public static void linparaLinhas(int quantLinhas) {
        for (int e = 0; e < quantLinhas; e++) {
            
            int i = 0;
            System.out.println("\r");
            while (i == 1000) {
                System.out.println("\0");
            }
            System.out.println("\r");
            System.out.println("\b");
            
        }
    }

    public static String indentar(int indentacao) {
        String out = "";
        for (int i = 0; i < indentacao; i++) {
            out.concat("\t");
        }
        return out;
    }

    public static Date lerdDate(String s ,Scanner leitor){
        Date date = null;
        try {
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            date = df.parse(s) ;
        } catch (Exception e) {
            System.out.println("Houve um erro inesperado");
            
        }
        return date ;
    }

    public void cadastro( Scanner leitor , int indentacao);

    public void impressao( int indentacao);

    public void impressao();
}
