package pe.com.demo;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ModeloResponse implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String codVendedor;

	private java.lang.Integer mesCalculado;

	private java.lang.Double pagoRVPremio;

	private java.lang.String mensaje;

	public ModeloResponse() {
	}

	public java.lang.String getCodVendedor() {
		return this.codVendedor;
	}

	public void setCodVendedor(java.lang.String codVendedor) {
		this.codVendedor = codVendedor;
	}

	public java.lang.Integer getMesCalculado() {
		return this.mesCalculado;
	}

	public void setMesCalculado(java.lang.Integer mesCalculado) {
		this.mesCalculado = mesCalculado;
	}

	public java.lang.Double getPagoRVPremio() {
		return this.pagoRVPremio;
	}

	public void setPagoRVPremio(java.lang.Double pagoRVPremio) {
		this.pagoRVPremio = pagoRVPremio;
	}

	public java.lang.String getMensaje() {
		return this.mensaje;
	}

	public void setMensaje(java.lang.String mensaje) {
		this.mensaje = mensaje;
	}

	public ModeloResponse(java.lang.String codVendedor,
			java.lang.Integer mesCalculado, java.lang.Double pagoRVPremio,
			java.lang.String mensaje) {
		this.codVendedor = codVendedor;
		this.mesCalculado = mesCalculado;
		this.pagoRVPremio = pagoRVPremio;
		this.mensaje = mensaje;
	}

}