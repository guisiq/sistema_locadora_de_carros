

import java.util.Date;


public abstract class Locacao implements ConsoleManager{
	//protected int idlocacao;
	protected Date datalocacao;
	protected Date dataDevolucao;
	protected Float valor;
	protected Float kilometragen;
	protected Carro carro;


	protected abstract void calcularValor();

	public Date getDatalocacao() {
		return datalocacao;
	}

	public void setDatalocacao(Date datalocacao) {
		this.datalocacao = datalocacao;
	}

	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	public float getKilometragen() {
		return kilometragen;
	}

	public void setKilometragen(float kilometragen) {
		this.kilometragen = kilometragen;
	}
	public void setKilometragen(Float kilometragen) {
		this.kilometragen = kilometragen;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	// #endregion

	public Locacao() {
	}

	public Locacao( Date datalocacao, Date dataDevolucao,  float kilometragen, Carro carro) {
		//this.idlocacao = idlocacao;
		this.datalocacao = datalocacao;
		this.dataDevolucao = dataDevolucao;
		this.kilometragen = kilometragen;
		this.carro = carro;
	}

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
	
}
