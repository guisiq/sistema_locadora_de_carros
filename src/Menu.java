import registro.*;
import java.util.Comparator;
import java.util.Scanner;
public  class Menu {

    //#region Comparator Carro
    
    public static Comparator<Carro> orderCarrosByPlaca = ( obj1,obj2 )-> {
        return obj1.getPlaca().compareTo(obj2.getPlaca());
    };

    public static Comparator<Carro> orderCarrosBymodelo = ( obj1,obj2 )-> {
        return obj1.getModelo().compareTo(obj2.getModelo());
    };

    public static Comparator<Carro> orderCarrosByano = ( obj1,obj2 )-> {
        return obj1.getAno().compareTo( obj2.getAno() )  ;
    };

    public static Comparator<Carro> orderCarrosByDataDeAquisisao = ( obj1,obj2 )-> {
        return obj1.getDataDeaquisicao().compareTo( obj2.getDataDeaquisicao() )  ;
    };

    public static Comparator<Carro> orderCarrosByCategoria = ( obj1,obj2 )-> {
        Integer num1 = obj1.getCategoria().ordinal()  ;
        Integer num2 = obj1.getCategoria().ordinal()  ;
        return num1.compareTo( num2 )  ;
    };

    public static Comparator<Carro> orderCarrosByCor = ( obj1,obj2 )-> {
        String s1 = obj1.getCor().getRgbCode()  ;
        String s2 = obj1.getCor().getRgbCode()  ;
        return s1.compareTo(s2)  ;
    };

    //#endregion
    
    //#region Comparator de cliente 
    public static Comparator<Cliente> orderClienteBynome = ( obj1,obj2 )-> {
        String s1 = obj1.getNome();
        String s2 = obj1.getNome();
        return s1.compareTo(s2)  ;
    };
    //#endregion

    //#region Comparator de locacoes 
    public static Comparator<Locacao> orderlocacaoByDataLocacao = ( obj1,obj2 )-> {
        return obj1.getDatalocacao().compareTo(obj2.getDatalocacao());
    };

    public static Comparator<Locacao> orderlocacaoByDataDevolucao = ( obj1,obj2 )-> {
        return obj1.getDataDevolucao().compareTo(obj2.getDataDevolucao());
    };
    public static Comparator<Locacao> orderlocacaoByValor = ( obj1,obj2 )-> {
        return obj1.getValor().compareTo(obj2.getValor());
    };
    
    //#endregion

    //#region listagen de registros

    public static void listarOsCarros (int indentacao,Comparator<Carro> ordem) {
        Registro.lCarros.sort(ordem);
        
        for (int i = 0; i < Registro.lCarros.size(); i++) {
            System.out.println();
            System.out.println("Carro "+ i);
            Carro carro = Registro.lCarros.get(i);
            carro.impressao(indentacao);
        }
        
    }
    
    public static void listarOsClientes (int indentacao,Comparator<Cliente> ordem) {
        Registro.lClientes.sort(ordem);

        for (int i = 0; i < Registro.lClientes.size(); i++) {
            System.out.println();
            System.out.println("cliente "+ i);
            Cliente cliente = Registro.lClientes.get(i);
            cliente.impressao(indentacao);
        }
        
    }
    
    public static void lstarTodasAsLocacoes(int indentacao,Comparator<Locacao> ordem) {
        Registro.lLocacoes.sort(ordem);

        for (int i = 0; i < Registro.lLocacoes.size(); i++) {
            System.out.println();
            System.out.println("locacao "+ i);
            Locacao locacao = Registro.lLocacoes.get(i);
            locacao.impressao(indentacao);
        }
    }
    
    public static void listarLocacoesDeUmCliente(int indentacao , int indice ,Comparator<Locacao> ordem) {
        Registro.lClientes.get(indice).getListLocacao().sort(ordem);
        
        for (int i = 0; i < Registro.lClientes.get(indice).getListLocacao().size(); i++) {
            System.out.println();
            System.out.println("locacao "+ i);
            Locacao locacao = Registro.lClientes.get(indice).getListLocacao().get(i);
            locacao.impressao(indentacao);
        }

    }
    
    public static void listarAsLocacoesPorCliente (int indentacao ,Comparator<Locacao> ordem) {
       
        for (int i = 0; i < Registro.lClientes.size() ; i++) {
            System.out.println();
            System.out.println("cliente "+ i);
            listarLocacoesDeUmCliente( indentacao,i,ordem);
        }
    }
    
    //#endregion
    
    //#region menu e login Cliente

    public static boolean loginCliente(String login , String senha ,Scanner leitor) {
        for (int j = 0; j < Registro.lClientes.size(); j++) {

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
                    System.out.println("1-listar suas locacoes");
                    System.out.println("   1-listar suas locacoes");
                    System.out.println("   1-listar suas locacoes");
                    System.out.println("   1-listar suas locacoes");

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
        System.out.print("█   █▀▀█ █▀▀ █▀▀█ █▀▀▄ █▀▀█ █▀▀█ █▀▀█\n");
        System.out.print("█   █  █ █   █▄▄█ █  █ █  █ █▄▄▀ █▄▄█\n");
        System.out.print("▀▀▀ ▀▀▀▀ ▀▀▀ ▀  ▀ ▀▀▀  ▀▀▀▀ ▀ ▀▀ ▀  ▀\n");
        System.out.print("              █▀▀▄ █▀▀               \n");
        System.out.print("              █  █ █▀▀               \n");
        System.out.print("              ▀▀▀  ▀▀▀               \n");
        System.out.print("     █▀▀ █▀▀█ █▀▀█ █▀▀█ █▀▀█ █▀▀     \n");
        System.out.print("     █   █▄▄█ █▄▄▀ █▄▄▀ █  █ ▀▀█     \n");
        System.out.print("     ▀▀▀ ▀  ▀ ▀ ▀▀ ▀ ▀▀ ▀▀▀▀ ▀▀▀     \n");



        System.out.print("╔╗           ╔╗           ╔╗                     \n" );
        System.out.print("║║           ║║           ║║                     \n" );
        System.out.print("║║╔══╦══╦══╦═╝╠══╦═╦══╗ ╔═╝╠══╗ ╔══╦══╦═╦═╦══╦══╗\n");
        System.out.print("║║║╔╗║╔═╣╔╗║╔╗║╔╗║╔╣╔╗║ ║╔╗║║═╣ ║╔═╣╔╗║╔╣╔╣╔╗║══╣\n");
        System.out.print("║╚╣╚╝║╚═╣╔╗║╚╝║╚╝║║║╔╗║ ║╚╝║║═╣ ║╚═╣╔╗║║║║║╚╝╠══║\n");
        System.out.print("╚═╩══╩══╩╝╚╩══╩══╩╝╚╝╚╝ ╚══╩══╝ ╚══╩╝╚╩╝╚╝╚══╩══╝\n");   
        /*
        String andar="";
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
         ConsoleManager.limparConsole();
        */     
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
                isLogin = true ;
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
