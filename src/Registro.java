import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

//import jdk.nashorn.internal.parser.DateParser;
import registro.*;
public abstract class Registro {
    public static List<Carro>   lCarros   = new ArrayList<Carro>(Arrays.asList(new Carro[]{
        new Carro(1, "KDH-7821", new Date(2005, 10, 5) , 2002, "Hilux CS DX 4x2 2.7 16V 142cv", Cor.AZUL,Categoria.INTERMEDIÁRIO),
        new Carro(2, "KEQ-0424", new Date(2005, 10, 5) , 1993, "Corolla DX/ SW DX 1.6 16V", Cor.LARANJA,Categoria.POPULAR),
        new Carro(3, "NBC6843", new Date(2005,10,5) , 1991, "Camper GL/GLS 4x4 4.0 Diesel", Cor.MARROM,Categoria.INTERMEDIÁRIO),
        new Carro(4, "MNG1163", new Date(2005,10,5) ,1994, "Espero 2.0", Cor.MARROM,Categoria.POPULAR),
        new Carro(5, "MZS9310", new Date(2005,10,5) ,2008, "MARRU", Cor.PRATA,Categoria.INTERMEDIÁRIO),
    }));
    public static List<Cliente> lClientes = new ArrayList<Cliente>(Arrays.asList(new Cliente[]{
        new Cliente(1, "Thales Mateus Kaique Cardoso", "07794037891","thalesmateuskaiquecardoso..thalesmateuskaiquecardoso@outloock.com"),
        new Cliente(2, "Luan Matheus João Barros", "49006244627","lluanmatheusjoaobarros@wizardsjc.com.br"),
        new Cliente(3, "Débora Benedita Elisa da Rocha", "11183004249","ddeborabeneditaelisadarocha@modus.com.br"),
        new Cliente(4, "Luzia Luna Nunes", "57148219205","luzialunanunes__luzialunanunes@arosacampinas.com.br"),
        new Cliente(1, "Mário Rodrigo Ryan Jesus", "95072767930","mariorodrigoryanjesus_@trietto.com.br"),
        new Cliente(1, "Sara Isadora Aparício", "84883733335","saraisadoraaparicio..saraisadoraaparicio@holtmail.com"),
        new Cliente(1, "Yuri Luan Fernandes", "82162188937","yuriluanfernandes..yuriluanfernandes@lonax.net"),
        new Cliente(1, "Alice Maria Porto", "46537485606","alicemariaporto..alicemariaporto@compecia.com.br")
    }));
    //public static List<Locacao> lLocacoes = new ArrayList<Locacao>(Arrays.asList(new Cliente[]{
        //new LocacaoDiaria();

    //}));
    public static void init(){
    }
}
