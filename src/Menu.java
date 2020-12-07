import registro.*;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
public  class Menu {
    //#region Comparator Carro
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
    public static Comparator<Carro> orderCarrosByid = ( obj1,obj2 )-> {
        if (obj1.getId() > obj2.getId()){
            return 1;
            
        } else if(obj1.getId() > obj2.getId()) {
            
            return -1;

        }else {

            return 0;

        }
    };
    public static Comparator<Carro> orderCarrosByNome = ( obj1,obj2 )-> {
        if (obj1.getId() > obj2.getId()){
            return 1;
            
        }
        return 1;
    };
    public static Comparator<Carro> orderCarrosByPlaca = ( obj1,obj2 )-> {
        if (obj1.getId() > obj2.getId()){
            return 1;
            
        }
        return 1;
    };
    public static Comparator<Carro> orderCarrosByDataDequisicao = ( obj1,obj2 )-> {
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
    //#region menu e login Cliente

    public static boolean loginCliente(String login , String senha ,Scanner leitor) {
        for (int j = 0; j < Registro.lClientes.size(); j++) {
            Cliente cliente = Registro.lClientes.get(j);
            if( Registro.lClientes.get(j).getUsuario().getLogin().equals(login) &&
                Registro.lClientes.get(j).getUsuario().getSenha().equals(senha)){
                    System.out.println(" Acesso liberado ");
                    menuCliente(j,leitor);
                    return true;
            }
        }
        return false;
    }
    public static void menuCliente (int id ,Scanner leitor) {
        int opcao;
        String out = "";
        
        out += "  ╔═╦═╗           ╔╗   ╔═╗ ╔╗    ╔╗  ╔═╗ \n ";
        out += "  ║║║║╠═╦═╦╦╦╗   ╔╝╠═╗ ║╔╬╗╠╬═╦═╦╣╚╦═╣═╣ \n ";
        out += "  ║║║║║╩╣║║║║║   ║╬║╩╣ ║╚╣╚╣║╩╣║║║╔╣╩╬═║ \n ";
        out += "  ╚╩═╩╩═╩╩═╩═╝   ╚═╩═╝ ╚═╩═╩╩═╩╩═╩═╩═╩═╝ \n ";
        out += "\n";
        out += "1-listar suas locacoes\n";
        out += "2-adicionar uma locacao diaria\n";
        out += "3-adicionar uma locacao extendida\n";
        out += "4-alterar seus dados \n";
        out += "5-sair\n";
        do {
            System.out.print(out);
            opcao = leitor.nextInt();
            leitor.nextLine();
            ConsoleManager.limparConsole();
            switch (opcao) {
                case 1:
                    Menu.listarLocacoesDeUmCliente(0, id , null );
                    break;
                
                case 2:
                //tem que ve se isso funciona 
                    LocacaoDiaria aux = new LocacaoDiaria();
                    Registro.lLocacoes.add(aux);
                    Registro.lClientes.get(id).getListLocacao().add(Registro.lLocacoes.get( Registro.lLocacoes.size()-1 ));
                    aux.cadastro(leitor, 0);
                    //List<Locacao> aux2 = Registro.lClientes.get(id).getListLocacao();
                    // aux2.add(aux);
                    // Registro.lClientes.get(id).setListLocacao(aux2);
                    
                    break;
                
                default:
                    break;
            }
        } while (opcao != 5);
    }
    //#endregion
   
    //#region login e menu do Adm
    public static boolean loginAdm(String login , String senha ){
        if(Registro.adm.getLogin().equals(login) && Registro.adm.getSenha().equals(senha)){
            System.out.println("Acesso Liberado");
            return true;
        }else
            System.out.println("Login ou senha incorreto");
        return false;
    } 
    public static void menuAdm () {
        
    }
    //#endregion
    public static void main(String[] args) {
        //#region inicio
        System.out.print("█   █▀▀█ █▀▀ █▀▀█ █▀▀▄ █▀▀█ █▀▀█ █▀▀█     █▀▀▄ █▀▀     █▀▀ █▀▀█ █▀▀█ █▀▀█ █▀▀█ █▀▀\n");
        System.out.print("█   █  █ █   █▄▄█ █  █ █  █ █▄▄▀ █▄▄█     █  █ █▀▀     █   █▄▄█ █▄▄▀ █▄▄▀ █  █ ▀▀█\n");
        System.out.print("▀▀▀ ▀▀▀▀ ▀▀▀ ▀  ▀ ▀▀▀  ▀▀▀▀ ▀ ▀▀ ▀  ▀     ▀▀▀  ▀▀▀     ▀▀▀ ▀  ▀ ▀ ▀▀ ▀ ▀▀ ▀▀▀▀ ▀▀▀\n");
        
        System.out.print("╔╗           ╔╗           ╔╗                     \n" );
        System.out.print("║║           ║║           ║║                     \n" );
        System.out.print("║║╔══╦══╦══╦═╝╠══╦═╦══╗ ╔═╝╠══╗ ╔══╦══╦═╦═╦══╦══╗\n");
        System.out.print("║║║╔╗║╔═╣╔╗║╔╗║╔╗║╔╣╔╗║ ║╔╗║║═╣ ║╔═╣╔╗║╔╣╔╣╔╗║══╣\n");
        System.out.print("║╚╣╚╝║╚═╣╔╗║╚╝║╚╝║║║╔╗║ ║╚╝║║═╣ ║╚═╣╔╗║║║║║╚╝╠══║\n");
        System.out.print("╚═╩══╩══╩╝╚╩══╩══╩╝╚╝╚╝ ╚══╩══╝ ╚══╩╝╚╩╝╚╝╚══╩══╝\n");   
        String andar="";
        /*
        for (int i = 0; i < 40; i++) {
            try {
                Thread.sleep(90);
                ConsoleManager.linparConsole();
                andar += " ";
                System.out.println(andar + "  ______      ");
                System.out.println(andar + " /|_||_\\`.__ ");
                System.out.println(andar + "(   _    _ _\\");
                System.out.println(andar + "=`-(_)--(_)-' ");
            } catch (Exception e) {
                
            }
        }
        */
        /**
         ______        a
         /|_||_\`.__    a
         (   _    _ _\   a
         =`-(_)--(_)-'   a
         
         __
         .-'--`-._
         '-O---O--'
         */     
        ConsoleManager.limparConsole();
        //#endregion
        boolean continuar = true;
        Scanner leitor = new Scanner(System.in); 
        do {
            String login,senha ;
            
            System.out.print("Digite o seu login :");
            login = leitor.nextLine();
            
            System.out.print("Digite o sua senha :");
            senha = leitor.next();
            leitor.nextLine();

            ConsoleManager.limparConsole();
            boolean isLogin =  loginCliente(login , senha ,leitor ); 

            if(!isLogin){
                isLogin = Menu.loginAdm(login, senha);
            }
            else if(!isLogin){
                System.out.println("Login ou Senha Errados");
                System.out.println("Digite [1] para tentar novamente ");
                System.out.println("Digite qualquer outra tecla para sair");
                continuar = (leitor.nextInt() == 1);
                leitor.nextLine();
            }else{
                continuar = false ;
            }
            
            
        } while (continuar);

        System.out.println("fim do programa: ");
    }
}
