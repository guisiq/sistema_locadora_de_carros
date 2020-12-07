package registro;

import java.util.Date;

public abstract class Locacao implements ConsoleManager{
	//protected int idlocacao;
	protected Date datalocacao;
	protected Date dataDevolucao;
	protected Float valor;
	protected Float kilometragen;
	protected Carro carro;


	protected abstract void calcularValor();

	// #region getters e setters
	/* public int getIdlocacao() {
		return idlocacao;
	}

	public void setIdlocacao(int idlocacao) {
		this.idlocacao = idlocacao;
	} */

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
}
