import registro.*;
import java.util.Comparator;
import java.util.Scanner;
public abstract class Menu {
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
    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in); 
       System.out.println("locacora de carros ");
       System.out.println("digite [1]se e um cliente ");
       System.out.println("digite [2]se e o adim");
       int tipoUsuario = leitor.nextInt();
       if(tipoUsuario == 1){
            ConsoleManager.linparaLinhas(4);
       }else if(tipoUsuario == 2){

       }
       System.out.println("fim do progama ");
    }
}
