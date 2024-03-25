package pe.com.demo;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ModeloRequest implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String codVendedor;

	private java.lang.Integer mesCalculo;

	private java.lang.Double cuotaPremioAuto;

	private java.lang.Double cuotaPremioSemiNuevo;

	private java.util.List<pe.com.demo.Venta> datosVenta;

	private java.lang.Boolean indAplicaPremio;

	private java.lang.Integer numCertificados;

	private java.lang.Double sumaMonto;

	private java.lang.Double premio;

	private java.lang.Double porcentajeCuota;

	private java.lang.Double porcentajePremioPagar;

	public ModeloRequest() {
	}

	public java.lang.String getCodVendedor() {
		return this.codVendedor;
	}

	public void setCodVendedor(java.lang.String codVendedor) {
		this.codVendedor = codVendedor;
	}

	public java.lang.Integer getMesCalculo() {
		return this.mesCalculo;
	}

	public void setMesCalculo(java.lang.Integer mesCalculo) {
		this.mesCalculo = mesCalculo;
	}

	public java.lang.Double getCuotaPremioAuto() {
		return this.cuotaPremioAuto;
	}

	public void setCuotaPremioAuto(java.lang.Double cuotaPremioAuto) {
		this.cuotaPremioAuto = cuotaPremioAuto;
	}

	public java.lang.Double getCuotaPremioSemiNuevo() {
		return this.cuotaPremioSemiNuevo;
	}

	public void setCuotaPremioSemiNuevo(java.lang.Double cuotaPremioSemiNuevo) {
		this.cuotaPremioSemiNuevo = cuotaPremioSemiNuevo;
	}

	public java.util.List<pe.com.demo.Venta> getDatosVenta() {
		return this.datosVenta;
	}

	public void setDatosVenta(java.util.List<pe.com.demo.Venta> datosVenta) {
		this.datosVenta = datosVenta;
	}

	public java.lang.Boolean getIndAplicaPremio() {
		return this.indAplicaPremio;
	}

	public void setIndAplicaPremio(java.lang.Boolean indAplicaPremio) {
		this.indAplicaPremio = indAplicaPremio;
	}

	public java.lang.Integer getNumCertificados() {
		return this.numCertificados;
	}

	public void setNumCertificados(java.lang.Integer numCertificados) {
		this.numCertificados = numCertificados;
	}

	public java.lang.Double getSumaMonto() {
		return this.sumaMonto;
	}

	public void setSumaMonto(java.lang.Double sumaMonto) {
		this.sumaMonto = sumaMonto;
	}

	public java.lang.Double getPremio() {
		return this.premio;
	}

	public void setPremio(java.lang.Double premio) {
		this.premio = premio;
	}

	public java.lang.Double getPorcentajeCuota() {
		return this.porcentajeCuota;
	}

	public void setPorcentajeCuota(java.lang.Double porcentajeCuota) {
		this.porcentajeCuota = porcentajeCuota;
	}

	public java.lang.Double getPorcentajePremioPagar() {
		return this.porcentajePremioPagar;
	}

	public void setPorcentajePremioPagar(java.lang.Double porcentajePremioPagar) {
		this.porcentajePremioPagar = porcentajePremioPagar;
	}

	public ModeloRequest(java.lang.String codVendedor,
			java.lang.Integer mesCalculo, java.lang.Double cuotaPremioAuto,
			java.lang.Double cuotaPremioSemiNuevo,
			java.util.List<pe.com.demo.Venta> datosVenta,
			java.lang.Boolean indAplicaPremio,
			java.lang.Integer numCertificados, java.lang.Double sumaMonto,
			java.lang.Double premio, java.lang.Double porcentajeCuota,
			java.lang.Double porcentajePremioPagar) {
		this.codVendedor = codVendedor;
		this.mesCalculo = mesCalculo;
		this.cuotaPremioAuto = cuotaPremioAuto;
		this.cuotaPremioSemiNuevo = cuotaPremioSemiNuevo;
		this.datosVenta = datosVenta;
		this.indAplicaPremio = indAplicaPremio;
		this.numCertificados = numCertificados;
		this.sumaMonto = sumaMonto;
		this.premio = premio;
		this.porcentajeCuota = porcentajeCuota;
		this.porcentajePremioPagar = porcentajePremioPagar;
	}

}