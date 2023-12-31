package Model;

public class Reserva {
	
	String id;
	String usuario;
	Categoria tipo_carro;
	String sede_recogida;
	String fecha_recogida;
	String hora_recogida;
	String sede_entrega;
	String fecha_entrega;
	String hora_entrega;
	String pago;
	Seguro seguro;
	Vehiculo carro_asignado;
	
	public Reserva(String id, String usuario, Categoria tipo_carro, String sede_recogida, String fecha_recogida, String hora_recogida, String sede_entrega, String fecha_entrega, String hora_entrega, String pago, Seguro seguro, Vehiculo carro) {
		this.id = id;
		this.usuario = usuario;
		this.tipo_carro = tipo_carro;
		this.sede_recogida = sede_recogida;
		this.fecha_recogida = fecha_recogida;
		this.hora_recogida = hora_recogida;
		this.sede_entrega = sede_entrega;
		this.fecha_entrega = fecha_entrega;
		this.hora_entrega = hora_entrega;
		this.pago = pago;
		this.seguro = seguro;
		this.carro_asignado = carro;
	}

	public void setCarro(Vehiculo carro) {
		this.carro_asignado = carro;
	}
	
	public String getId() {
		
		return this.id;
	}

	public Categoria getTipo() {

		return this.tipo_carro;
	}

	public String getSedeRecogida() {

		return this.sede_recogida;
	}

	public String getHoraRecogida() {

		return this.hora_recogida;
	}

	public String getHoraEntrega() {

		return this.hora_entrega;
	}

	public String getDiaEntrega() {

		return this.fecha_entrega;
	}

	public String getDiaRecogida() {

		return this.fecha_recogida;
	}

	public String getUsername() {

		return this.usuario;
	}
	
	public Seguro getSeguro() {
		return this.seguro;
	}

	public String getSedeEntrega() {
		return this.sede_entrega;
	}

	public String getPago() {
		return this.pago;
	}

	public Vehiculo getCarro() {
		return this.carro_asignado;
	}
}
