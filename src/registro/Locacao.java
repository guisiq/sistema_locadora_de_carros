package registro;

import java.util.Date;

public abstract class Locacao implements ConsoleManager{
	protected int idlocacao;
	protected Date datalocacao;
	protected Date dataDevolucao;
	protected float valor;
	protected float kilometragen;
	protected Carro carro;


	protected abstract void calcularValor();

	// #region getters e setters
	public int getIdlocacao() {
		return idlocacao;
	}

	public void setIdlocacao(int idlocacao) {
		this.idlocacao = idlocacao;
	}

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

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public float getKilometragen() {
		return kilometragen;
	}

	public void setKilometragen(float kilometragen) {
		this.kilometragen = kilometragen;
	}
	// #endregion
}
