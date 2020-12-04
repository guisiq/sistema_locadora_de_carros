package registro;
public interface consolemanager {
    public static void linparaLinha() {
        int i = 0;
        System.out.println("\r");
        while (i == 1000) {
            System.out.println("\0");
        }
        System.out.println("\b");
    }

    public static String indentar(int indentacao) {
        String out = "";
        for (int i = 0; i < indentacao; i++) {
            out.concat("\t");
        }
        return out;
    }

    public String cadastro(boolean imprimir);

    public String cadastro(boolean imprimir, int indentacao);

    public String impressao(boolean imprimir, int indentacao);

    public String impressao(boolean imprimir);
}
