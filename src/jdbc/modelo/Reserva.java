package jdbc.modelo;

import java.sql.Date;

public class Reserva {
	
	private Integer id;
	private Date fechaE;
	private Date fechaS;
	private String valor;
	private String forma_pago;
	
	
	public Reserva(Date fechaE, Date fechaS, String valor, String forma_pago) {
		super();		
		this.fechaE = fechaE;
		this.fechaS = fechaS;
		this.valor = valor;
		this.forma_pago = forma_pago;
	}
		
	public Reserva(Integer id, Date fechaE, Date fechaS, String valor, String forma_pago) {
		this.id = id;
		this.fechaE = fechaE;
		this.fechaS = fechaS;
		this.valor = valor;
		this.forma_pago = forma_pago;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public Date getfechaE() {
		return fechaE;
	}

	public Date getfechaS() {
		return fechaS;
	}

	public String getvalor() {
		return valor;
	}

	public String getformaPago() {
		return forma_pago;
	}

	
	@Override
	public String toString() {
		
		return String.format("La reserva generada fue: %d, %s, %s, %s, %s", this.id, this.fechaE, this.fechaS, this.valor, this.forma_pago);
	}
	
	
	
}

