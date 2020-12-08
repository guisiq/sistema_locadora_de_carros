import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//import jdk.nashorn.internal.parser.DateParser;
import registro.*;

public abstract class Registro {

    public static List<Carro>   lCarros   = new ArrayList<Carro>(Arrays.asList(new Carro[]{
        new Carro("KDH-7821", ConsoleManager.lerdDate("5/10/2005"), 2002, "Hilux CS DX 4x2 2.7 16V 142cv", Cor.AZUL,Categoria.INTERMEDIÁRIO),
        new Carro("KEQ-0424", ConsoleManager.lerdDate("5/10/2005"), 1993, "Corolla DX/ SW DX 1.6 16V", Cor.LARANJA,Categoria.POPULAR),
        new Carro("NBC6843" , ConsoleManager.lerdDate("5/10/2005"), 1991, "Camper GL/GLS 4x4 4.0 Diesel", Cor.MARROM,Categoria.INTERMEDIÁRIO),
        new Carro("MNG1163" , ConsoleManager.lerdDate("5/10/2005"), 1994, "Espero 2.0", Cor.MARROM,Categoria.POPULAR),
        new Carro("MZS9310" , ConsoleManager.lerdDate("5/10/2005"), 2008, "MARRU", Cor.PRATA,Categoria.INTERMEDIÁRIO),
    }));
    public static List<Locacao> lLocacoes = Arrays.asList(new Locacao[]{
        new LocacaoDiaria(ConsoleManager.lerdDate("04/05/2012"),ConsoleManager.lerdDate("09/06/2012"),30.000f,Registro.lCarros.get(1),10),
        new LocacaoDiaria(ConsoleManager.lerdDate("08/06/2012"),ConsoleManager.lerdDate("09/12/2012"),20.800f,Registro.lCarros.get(2),10),
        new LocacaoDiaria(ConsoleManager.lerdDate("08/16/2012"),ConsoleManager.lerdDate("09/24/2012"),10.800f,Registro.lCarros.get(3),10),
        new LocacaoDiaria(ConsoleManager.lerdDate("08/16/2012"),ConsoleManager.lerdDate("09/24/2012"),10.800f,Registro.lCarros.get(4),10),
        new LocacaoDiaria(ConsoleManager.lerdDate("08/16/2012"),ConsoleManager.lerdDate("09/24/2012"),10.800f,Registro.lCarros.get(4),10)
    });

    public static List<Cliente> lClientes = new ArrayList<Cliente>(Arrays.asList(new Cliente[]{
        new Cliente( "Thales Mateus Kaique Cardoso", "07794037891","thalesmateuskaiquecardoso..thalesmateuskaiquecardoso@outloock.com",new Telefone("82","992561483"),new Locacao[]{
            Registro.lLocacoes.get(3),
            Registro.lLocacoes.get(4)
        }),
        new Cliente( "Guilherme Henrique", "02494832209","lluanmatheusjoaobarros@wizardsjc.com.br",new Telefone("27","983729202"), new Locacao[]{
            Registro.lLocacoes.get(0),
            Registro.lLocacoes.get(1),
            Registro.lLocacoes.get(2)
        })
        /*,
        new Cliente("Débora Benedita Elisa da Rocha", "11183004249","ddeborabeneditaelisadarocha@modus.com.br"),
        new Cliente("Luzia Luna Nunes", "57148219205","luzialunanunes__luzialunanunes@arosacampinas.com.br"),
        new Cliente("Mário Rodrigo Ryan Jesus", "95072767930","mariorodrigoryanjesus_@trietto.com.br"),
        new Cliente("Sara Isadora Aparício", "84883733335","saraisadoraaparicio..saraisadoraaparicio@holtmail.com"),
        new Cliente("Yuri Luan Fernandes", "82162188937","yuriluanfernandes..yuriluanfernandes@lonax.net"),
        new Cliente("Alice Maria Porto", "46537485606","alicemariaporto..alicemariaporto@compecia.com.br")*/
    }));
    public static Usuario adm  = new Usuario("root", "admlogin", Usuario.Acesso.ADM);
}
