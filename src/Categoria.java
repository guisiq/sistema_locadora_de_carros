

public enum Categoria {
    POPULAR, INTERMEDIÁRIO, LUXO;

    public static void imprimir(int indentacao) {
        for (int i = 0; i < Categoria.values().length; i++) {
            System.out.print(ConsoleManager.indentar(indentacao));
            System.out.println(i + Categoria.values()[i].name());
        }
    }

    public static Categoria valueOf(int i) {
        if (i < Categoria.values().length) {
            return Categoria.values()[i];
        }
        return null;
    }
    
    
}
