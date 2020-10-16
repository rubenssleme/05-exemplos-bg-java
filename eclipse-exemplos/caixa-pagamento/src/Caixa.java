
public class Caixa {
	private int pagamento;
	private int recebido;
	private int troco;

	public Caixa() {

	}

	public Caixa(int pagamento, int recebido) {
		this.pagamento = pagamento;
		this.recebido = recebido;
		this.troco = troco;
	}

	public int getPagamento() {
		return pagamento;
	}

	public void setPagamento(int pagamento) {
		this.pagamento = pagamento;
	}

	public int getRecebido() {
		return recebido;
	}

	public void setRecebido(int recebido) {
		this.recebido = recebido;
	}

	public int getTroco() {
		return troco;
	}

	public void setTroco(int troco) {
		this.troco = troco;
	}

	@Override
	public String toString() {
		return "Caixa [pagamento=" + pagamento + ", recebido=" + recebido + ", troco=" + troco + "]";
	}

	public void cobrar() {
		this.troco = (this.pagamento - this.recebido);
		System.out.println("O troco é de:"+ troco);
	}

}
