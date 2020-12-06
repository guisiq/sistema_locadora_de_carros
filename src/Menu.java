import registro.*;
import java.util.Comparator;
import java.util.Scanner;
public  class Menu {
    //#region comparetor carro
    /**    
    private Integer id;
    // private String nome;
    private String placa;
    private Date dataDeaquisicao;
    private int ano;
    private String modelo;
    private Cor cor;
    private Categoria categoria; 
    */
    public static Comparator<Carro> ordeCarrosByid = ( obj1,obj2 )-> {
        if (obj1.getId() > obj2.getId()){
            return 1;
            
        } else if(obj1.getId() > obj2.getId()) {
            
            return -1;

        }else {

            return 0;

        }
    };
    public static Comparator<Carro> ordeCarrosByNome = ( obj1,obj2 )-> {
        if (obj1.getId() > obj2.getId()){
            return 1;
            
        }
        return 1;
    };
    public static Comparator<Carro> ordeCarrosByPlaca = ( obj1,obj2 )-> {
        if (obj1.getId() > obj2.getId()){
            return 1;
            
        }
        return 1;
    };
    public static Comparator<Carro> ordeCarrosByDataDequisicao = ( obj1,obj2 )-> {
        if (obj1.getId() > obj2.getId()){
            return 1;
            
        }
        return 1;
    };
    //#endregion

    //#region listagen de registros

    public static void listarOsCarros (int indentacao,Comparator<Carro> ordem) {
        Registro.lCarros.stream().
        sorted(ordem)
        .forEach(carro ->{
            carro.impressao(indentacao);
        });
    }
    
    public static void listarOsClientes (int indentacao,Comparator<Cliente> ordem) {
        Registro.lClientes
            .stream().
            sorted(ordem)
            .forEach(carro ->{
                carro.impressao(indentacao);
            });
    }
    
    public static void lstarTodasAsLocacoes(int indentacao,Comparator<Locacao> ordem) {
        Registro.lLocacoes
            .stream().
            sorted(ordem)
            .forEach(locacao ->{
                locacao.impressao(indentacao);
            });
    }
    
    public static void listarLocacoesDeUmCliente(int indentacao , int id ,Comparator<Locacao> ordem) {
        Registro.lClientes.forEach(cliente -> {
            if(cliente.getId() == id ){
                cliente.getListLocacao()
                .stream()
                .sorted(ordem)
                .forEach(locacao ->{
                    locacao.impressao(indentacao);
                });
            }
        });
    }
    
    //#endregion
    //#region menu e login ciente

    public static boolean loginCiente(String login , String senha ) {
        boolean islogin;
        for (int j = 0; j < Registro.lClientes.size(); j++) {
            if( Registro.lClientes.get(j).getUsuario().getLogin() == login &&
                Registro.lClientes.get(j).getUsuario().getSenha() == senha){
                    System.out.println(" Acesso iberado ");
                    menuCiente(j);
                    return true;
            }
        }
        return false;
    }
    
    public static void menuCiente (int indece  ) {
        Scanner leitor = new Scanner(System.in);
        int opcao;
        String out = "";
        
        out += "  ╔═╦═╗        \n      ╔╗  \n ╔═╗ ╔╗    ╔╗  ╔═╗ \n ";
        out += "  ║║║║╠═╦═╦╦╦╗ \n     ╔╝╠═╗\n ║╔╬╗╠╬═╦═╦╣╚╦═╣═╣ \n ";
        out += "  ║║║║║╩╣║║║║║ \n     ║╬║╩╣\n ║╚╣╚╣║╩╣║║║╔╣╩╬═║ \n ";
        out += "  ╚╩═╩╩═╩╩═╩═╝ \n     ╚═╩═╝\n ╚═╩═╩╩═╩╩═╩═╩═╩═╝ \n ";
        out += "\n";
        out += "1-istar suas locacoes\n";
        out += "2-addicionar uma locacao\n  ";
        out += "3-altera sus dados \n  ";
        out += "4-sair\n  ";
        do {
            System.out.print(out);
            opcao = leitor.nextInt();
            leitor.nextLine();
            ConsoleManager.linparConsole();
        } while (opcao != 4);
    }
    //#endregion
    public static boolean loginAdm(String login , String senha ){
        return false;
    }
    public static void menuAdm () {
        
    }
    //#endregion
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); 
        System.out.print("█   █▀▀█ █▀▀ █▀▀█ █▀▀▄ █▀▀█ █▀▀█ █▀▀█     █▀▀▄ █▀▀     █▀▀ █▀▀█ █▀▀█ █▀▀█ █▀▀█ █▀▀\n");
        System.out.print("█   █  █ █   █▄▄█ █  █ █  █ █▄▄▀ █▄▄█     █  █ █▀▀     █   █▄▄█ █▄▄▀ █▄▄▀ █  █ ▀▀█\n");
        System.out.print("▀▀▀ ▀▀▀▀ ▀▀▀ ▀  ▀ ▀▀▀  ▀▀▀▀ ▀ ▀▀ ▀  ▀     ▀▀▀  ▀▀▀     ▀▀▀ ▀  ▀ ▀ ▀▀ ▀ ▀▀ ▀▀▀▀ ▀▀▀\n");

        System.out.print("╔╗           ╔╗           ╔╗   \n" );
        System.out.print("║║           ║║           ║║   \n" );
        System.out.print("║║╔══╦══╦══╦═╝╠══╦═╦══╗ ╔═╝╠══╗ ╔══╦══╦═╦═╦══╦══╗\n");
        System.out.print("║║║╔╗║╔═╣╔╗║╔╗║╔╗║╔╣╔╗║ ║╔╗║║═╣ ║╔═╣╔╗║╔╣╔╣╔╗║══╣\n");
        System.out.print("║╚╣╚╝║╚═╣╔╗║╚╝║╚╝║║║╔╗║ ║╚╝║║═╣ ║╚═╣╔╗║║║║║╚╝╠══║\n");
        System.out.print("╚═╩══╩══╩╝╚╩══╩══╩╝╚╝╚╝ ╚══╩══╝ ╚══╩╝╚╩╝╚╝╚══╩══╝\n");        
        boolean continuar = true;
        do {
            
            String login ;
            String senha ;
            
            System.out.print("digite o seu login :");
            login = leitor.next();
            System.out.println();
            
            System.out.print("digite o sua senha :");
            senha = leitor.next();
            System.out.println();
            ConsoleManager.linparConsole();
            boolean isLogin =  loginCiente(login , senha ); 

            if(!isLogin){
                isLogin = Menu.loginAdm(login, senha);
            }
            if(!isLogin){
                System.out.println("logim ou senha errados ");
                System.out.println("digite [1]para tentar nvamente ");
                continuar = (leitor.nextInt() == 1);
            }else{
                continuar = false ;
            }
            
            
            System.out.println("fim do progama ");
            leitor.nextInt();
        } while (continuar);
    }
}
