package pe.com.demo;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Venta implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String nroContrato;
	private java.lang.String fechaContrato;
	private java.lang.Double montoCIAContrato;
	private java.lang.Double montoCIAPagado;
	private java.lang.String estadoContrato;

	private java.lang.Boolean seConsidera;

	public Venta() {
	}

	public java.lang.String getNroContrato() {
		return this.nroContrato;
	}

	public void setNroContrato(java.lang.String nroContrato) {
		this.nroContrato = nroContrato;
	}

	public java.lang.String getFechaContrato() {
		return this.fechaContrato;
	}

	public void setFechaContrato(java.lang.String fechaContrato) {
		this.fechaContrato = fechaContrato;
	}

	public java.lang.Double getMontoCIAContrato() {
		return this.montoCIAContrato;
	}

	public void setMontoCIAContrato(java.lang.Double montoCIAContrato) {
		this.montoCIAContrato = montoCIAContrato;
	}

	public java.lang.Double getMontoCIAPagado() {
		return this.montoCIAPagado;
	}

	public void setMontoCIAPagado(java.lang.Double montoCIAPagado) {
		this.montoCIAPagado = montoCIAPagado;
	}

	public java.lang.String getEstadoContrato() {
		return this.estadoContrato;
	}

	public void setEstadoContrato(java.lang.String estadoContrato) {
		this.estadoContrato = estadoContrato;
	}

	public java.lang.Boolean getSeConsidera() {
		return this.seConsidera;
	}

	public void setSeConsidera(java.lang.Boolean seConsidera) {
		this.seConsidera = seConsidera;
	}

	public Venta(java.lang.String nroContrato, java.lang.String fechaContrato,
			java.lang.Double montoCIAContrato, java.lang.Double montoCIAPagado,
			java.lang.String estadoContrato, java.lang.Boolean seConsidera) {
		this.nroContrato = nroContrato;
		this.fechaContrato = fechaContrato;
		this.montoCIAContrato = montoCIAContrato;
		this.montoCIAPagado = montoCIAPagado;
		this.estadoContrato = estadoContrato;
		this.seConsidera = seConsidera;
	}

}