import java.util.Calendar;

public class Hospedagem {

	private int codigo;
	private Calendar checkin;
	private int numQuarto;
	private Calendar checkout;
	private Hospede hospede;

	public Hospedagem() {
		this(0, null, 0, null, null);
	}

	public Hospedagem(int codigo, Calendar checkin, int numQuarto,
			Calendar checkout, Hospede hospede) {

		this.codigo = codigo;
		this.checkin = checkin;
		this.numQuarto = numQuarto;
		this.checkout = checkout;
		this.hospede = hospede;

	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Calendar getCheckin() {
		return checkin;
	}

	public void setCheckin(Calendar checkin2) {
		this.checkin = checkin2;
	}

	public int getNumQuarto() {
		return numQuarto;
	}

	public void setNumQuarto(int numQuarto) {
		this.numQuarto = numQuarto;
	}

	public Calendar getCheckout() {
		return checkout;
	}

	public void setCheckout(Calendar checkout2) {
		this.checkout = checkout2;
	}

	public Hospede getHospede() {
		return hospede;
	}

	public void setHospede(Hospede hospede) {
		this.hospede = hospede;
	}

	public void hospedar(int codigo, Calendar checkin, int numQuarto,
			Calendar checkout, Hospede hospede) {
		setCodigo(codigo);
		setCheckin(checkin);
		setNumQuarto(numQuarto);
		setCheckout(checkout);
		setHospede(hospede);

	}

	public void visualizar(Hospedagem h) {
		System.out.println(h.codigo);
		System.out.println(h.hospede);
		System.out.println(h.numQuarto);
		System.out.println(h.checkin);
		System.out.println(h.checkout);

	}

	@Override
	public String toString() {
		return "Hospedagem [codigo=" + codigo + ", checkin="
				+ Utilitario.formatarData(checkin) + ", numQuarto=" + numQuarto
				+ ", checkout=" + Utilitario.formatarData(checkout)
				+ ", hospede=" + hospede + "]";
	}
}
