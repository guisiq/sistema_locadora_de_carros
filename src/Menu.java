
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
    public static Comparator<Carro> orderCarrosByDataDeAquisicao = ( obj1,obj2 )-> {
        return obj1.getDataDeaquisicao().compareTo( obj2.getDataDeaquisicao() )  ;
    };
    public static Comparator<Carro> orderCarrosByCategoria = ( obj1,obj2 )-> {
        Integer num1 = obj1.getCategoria().ordinal()  ;
        Integer num2 = obj2.getCategoria().ordinal()  ;
        return num1.compareTo( num2 )  ;
    };
    public static Comparator<Carro> orderCarrosByCor = ( obj1,obj2 )-> {
        String s1 = obj1.getCor().getRgbCode()  ;
        String s2 = obj1.getCor().getRgbCode()  ;
        return s1.compareTo(s2)  ;
    };
    //#endregion
    
    //#region Comparator de cliente 
    public static Comparator<Cliente> orderClienteByNome = ( obj1,obj2 )-> {
        String s1 = obj1.getNome();
        String s2 = obj1.getNome();
        return s1.compareTo(s2)  ;
    };
    public static Comparator<Cliente> orderClienteByEmail = ( obj1,obj2 )-> {
        String s1 = obj1.getEmail();
        String s2 = obj1.getEmail();
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
        if(ordem != null){
            Registro.lCarros.sort(ordem);
        }
        
        for (int i = 0; i < Registro.lCarros.size(); i++) {
            System.out.print(ConsoleManager.indentar(indentacao));
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
    
    public static void listarTodasAsLocacoes(int indentacao,Comparator<Locacao> ordem) {
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
  
    public static void menuCliente (int indice ,Scanner leitor) {
        int opcao;
        ConsoleManager.limparConsole();
        String out = "";
        out+=" Acesso liberado                    \n";
        out+="     █▀▄▀█ █▀▀ █▀▀▄ █  █            \n";
        out+="     █ ▀ █ █▀▀ █  █ █  █            \n";
        out+="     ▀   ▀ ▀▀▀ ▀  ▀ ▀▀▀▀            \n";
        out+="█▀▀ █    ▀  █▀▀ █▀▀▄ ▀▀█▀▀ █▀▀      \n"; 
        out+="█   █   ▀█▀ █▀▀ █  █   █   █▀▀      \n"; 
        out+="▀▀▀ ▀▀▀ ▀▀▀ ▀▀▀ ▀  ▀   ▀   ▀▀▀      \n";
        out+="                                    \n";
        out+="1-listar suas locacoes              \n";
        out+="2-adicionar uma locacao diaria      \n";
        out+="3-adicionar uma locacao extendida   \n";
        out+="4-alterar seus dados                \n";
        out+="5-sair                              \n";
        do {
            System.out.print(out);
            opcao = leitor.nextInt();
            leitor.nextLine();
            ConsoleManager.limparConsole();
            switch (opcao) {
                case 1:{
                    System.out.println("# listar suas locacoes");
                    System.out.println("   1-listar suas locacoes ordenada por data de locacao");
                    System.out.println("   2-listar suas locacoes ordenada por data de devolucao");
                    System.out.println("   3-listar suas locacoes ordenada por valor ");
                    
                    int opcao2 = leitor.nextInt();
                    leitor.nextLine();
                    switch (opcao2) {
                        case 1:
                        ConsoleManager.limparConsole();
                        System.out.println("# listar suas locacoes");
                        System.out.println("   # listar suas locacoes ordenada por data de locacao");
                        Menu.listarLocacoesDeUmCliente(3, indice ,orderlocacaoByDataLocacao );
                        break;
                        case 2:
                        ConsoleManager.limparConsole();
                        Menu.listarLocacoesDeUmCliente(3, indice ,orderlocacaoByDataDevolucao);
                        break;
                        case 3:
                        ConsoleManager.limparConsole();
                        Menu.listarLocacoesDeUmCliente(3, indice ,orderlocacaoByValor);
                        break;
                        default:
                        break;
                    }  
                }
                break;
                case 2: {
                    System.out.println("#-adicionar uma locacao diaria");
                    LocacaoDiaria aux = new LocacaoDiaria();
                    aux.cadastro( leitor,1);
                    Registro.lLocacoes.add(aux);
                    Registro.lClientes.get(indice).getListLocacao().add(Registro.lLocacoes.get( Registro.lLocacoes.size()-1 ));
                }
                break;
                case 3:{
                    System.out.println("#-adicionar uma locacao extendida");
                    LocacaoExtendida aux = new LocacaoExtendida();
                    aux.cadastro(leitor, 0);
                    Registro.lLocacoes.add(aux);
                    Registro.lClientes.get(indice).getListLocacao().add(Registro.lLocacoes.get( Registro.lLocacoes.size()-1 ));
                } 
                break;
                case 4:{
                    System.out.println("#-alterar seus dados ");
                    Registro.lClientes.get(indice).update(leitor,2);
                }
                break;
                default:
                    break;
            }
        } while (opcao != 5);
    }
    //#endregion
   
    //#region login e menu do Adm
    public static boolean loginAdm(String login , String senha ,Scanner leitor){
        if(Registro.adm.getLogin().equals(login) && Registro.adm.getSenha().equals(senha)){
            System.out.println("Acesso Liberado");
            menuAdm(leitor);
            return true;
        }else
        return false;
    } 
    public static void menuAdm (Scanner leitor) {
        String out;
        out ="                      █▀▄▀█ █▀▀ █▀▀▄ █  █                       \n"; 
        out+="                      █ ▀ █ █▀▀ █  █ █  █                       \n"; 
        out+="                      ▀   ▀ ▀▀▀ ▀  ▀  ▀▀▀                       \n";
        
        out+="█▀▀█ █▀▀▄ █▀▄▀█  ▀  █▀▀▄  ▀  █▀▀ ▀▀█▀▀ █▀▀█ █▀▀█ █▀▀▄ █▀▀█ █▀▀█ \n"; 
        out+="█▄▄█ █  █ █ ▀ █ ▀█▀ █  █ ▀█▀ ▀▀█   █   █▄▄▀ █▄▄█ █  █ █  █ █▄▄▀ \n"; 
        out+="▀  ▀ ▀▀▀  ▀   ▀ ▀▀▀ ▀  ▀ ▀▀▀ ▀▀▀   ▀   ▀ ▀▀ ▀  ▀ ▀▀▀  ▀▀▀▀ ▀ ▀▀ \n";
        System.out.println(out);
        //System.out.println("Menu do Administrador: ");
        System.out.println("Digite o número da opção que você deseja: ");

        System.out.println("1 - Listar Carros ");
        System.out.println("2 - Cadastrar Carro  ");
        System.out.println("3 - Remover Carro  ");
        System.out.println("4 - Cadastrar Cliente ");
        System.out.println("5 - Remover Cliente  ");
        System.out.println("6 - Listar Cliente  ");

        int funcionalidade = leitor.nextInt();
        leitor.nextLine();

        switch (funcionalidade){
        case 1:{
            ConsoleManager.limparConsole();
            System.out.println("# Listagem  Carros:");
            System.out.println(" 1 - Ordenar por placa:");
            System.out.println(" 2 - Ordenar por data de aquisição:");
            System.out.println(" 3 - Ordenar por Ano de Fabricação:");
            int option = leitor.nextInt();;
            if(option==1)
                Menu.listarOsCarros (0,orderCarrosByPlaca);
            else if(option==2)
                Menu.listarOsCarros (0,orderCarrosByDataDeAquisicao);
            else if(option==3)
                Menu.listarOsCarros (0,orderCarrosByano);
            else 
                System.out.println("opção inválida");
        } break;
        case 2:{
            //adicionando Carro na lista 
            Carro veiculo = new Carro();
            veiculo.cadastro(leitor, 0);
            Registro.lCarros.add(veiculo);
            //Registro.lClientes.get(indice).getListarCarros().add(Registro.lCarros.get( Registro.lCarros.size()-1 ));
        } break;
        case 3:{
            //removendo Carro da Lista

        } break;
        case 4:{
           //cadastrar novo Cliente
           Cliente client = new Cliente();
           Registro.lClientes.add(client);
           //Registro.lClientes.get(indice).getListarCarros().add(Registro.lClientes.get( Registro.lClientes.size()-1 ));
           client.cadastro(leitor, 0);
        } break;
        case 5:{
           //Remover Cliente
     
        } break;
        case 6:{
            ConsoleManager.limparConsole();
            System.out.println("# Listagem  Clientes:");
            System.out.println(" 1 - Ordenar por Nome:");
            System.out.println(" 2 - Ordenar por Email:");

            int option = leitor.nextInt();;
            if(option==1)
                Menu.listarOsClientes(0, orderClienteByNome);
            else if(option==2)
                Menu.listarOsClientes(0,orderClienteByEmail);
            else 
                System.out.println("Opção inválida");
        } break;
        default:
        break;
        }
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

            boolean isLogin =  loginCliente(login , senha ,leitor ); 
            ConsoleManager.limparConsole();
        
            if(!isLogin){
                isLogin = Menu.loginAdm(login, senha,leitor);
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

    public Menu() {
    }
}
