package cursoNTecnologias.bd.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import cursoNTecnologias.utils.Utils;

public class Ventas {

    private Integer idventa;
    private Integer clienteid;
    private Double totalventa;
    private Date fecha;
    
    private Cliente cliente;
    private List<DetalleVentas> detalleVentasList;
    
    public List<DetalleVentas> getDetalleVentaList() {
		return detalleVentasList;
	}

	public void setDetalleVentaList(List<DetalleVentas> detalleVentaList) {
		this.detalleVentasList = detalleVentaList;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Ventas () {
    	this.cliente = new Cliente ();
    	this.detalleVentasList = new ArrayList<DetalleVentas>();
    }
    
    public Integer getIdventa() {
        return idventa;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ventas.idVenta
     *
     * @param idventa the value for ventas.idVenta
     *
     * @mbg.generated Fri Apr 12 07:54:51 CDT 2019
     */
    public void setIdventa(Integer idventa) {
        this.idventa = idventa;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ventas.clienteId
     *
     * @return the value of ventas.clienteId
     *
     * @mbg.generated Fri Apr 12 07:54:51 CDT 2019
     */
    public Integer getClienteid() {
        return clienteid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ventas.clienteId
     *
     * @param clienteid the value for ventas.clienteId
     *
     * @mbg.generated Fri Apr 12 07:54:51 CDT 2019
     */
    public void setClienteid(Integer clienteid) {
        this.clienteid = clienteid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ventas.totalVenta
     *
     * @return the value of ventas.totalVenta
     *
     * @mbg.generated Fri Apr 12 07:54:51 CDT 2019
     */
    public Double getTotalventa() {
        return totalventa;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ventas.totalVenta
     *
     * @param totalventa the value for ventas.totalVenta
     *
     * @mbg.generated Fri Apr 12 07:54:51 CDT 2019
     */
    public void setTotalventa(Double totalventa) {
        this.totalventa = totalventa;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ventas.fecha
     *
     * @return the value of ventas.fecha
     *
     * @mbg.generated Fri Apr 12 07:54:51 CDT 2019
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ventas.fecha
     *
     * @param fecha the value for ventas.fecha
     *
     * @mbg.generated Fri Apr 12 07:54:51 CDT 2019
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public String getFechaString () {
    	return Utils.parseDateToString(this.fecha);
    }
    
    public void setFecha(String fecha) {
    	this.fecha = Utils.parseStringToDate(fecha);
    }
    
    @Override
    public String toString () {
    	String str = "";
    	str += "idVenta: " + idventa + "\n";
    	str += "clienteId: " + clienteid + "\n";
    	str += "totalVenta: " + totalventa + "\n";
    	str += "Fecha: " + fecha + "\n";
    	return str;
    }
}