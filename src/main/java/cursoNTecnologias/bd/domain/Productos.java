package cursoNTecnologias.bd.domain;

public class Productos {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column productos.idProducto
     *
     * @mbg.generated Fri Apr 12 07:54:51 CDT 2019
     */
    private Integer idproducto;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column productos.nombre
     *
     * @mbg.generated Fri Apr 12 07:54:51 CDT 2019
     */
    private String nombre;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column productos.precio
     *
     * @mbg.generated Fri Apr 12 07:54:51 CDT 2019
     */
    private Double precio;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column productos.precioVta
     *
     * @mbg.generated Fri Apr 12 07:54:51 CDT 2019
     */
    private Double preciovta;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column productos.cantidad
     *
     * @mbg.generated Fri Apr 12 07:54:51 CDT 2019
     */
    private Integer cantidad;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column productos.marcaId
     *
     * @mbg.generated Fri Apr 12 07:54:51 CDT 2019
     */
    private Integer marcaid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column productos.idProducto
     *
     * @return the value of productos.idProducto
     *
     * @mbg.generated Fri Apr 12 07:54:51 CDT 2019
     */
    
    private Marcas marcas;
    
    public Productos() {
    	setMarcas(new Marcas());
    }
    
    public void setMarcas(Marcas marcas) {
    	this.marcas=marcas;
    }
    public Marcas getMarcas() {
    	return marcas;
    }
    
    
    public Integer getIdproducto() {
        return idproducto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column productos.idProducto
     *
     * @param idproducto the value for productos.idProducto
     *
     * @mbg.generated Fri Apr 12 07:54:51 CDT 2019
     */
    public void setIdproducto(Integer idproducto) {
        this.idproducto = idproducto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column productos.nombre
     *
     * @return the value of productos.nombre
     *
     * @mbg.generated Fri Apr 12 07:54:51 CDT 2019
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column productos.nombre
     *
     * @param nombre the value for productos.nombre
     *
     * @mbg.generated Fri Apr 12 07:54:51 CDT 2019
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column productos.precio
     *
     * @return the value of productos.precio
     *
     * @mbg.generated Fri Apr 12 07:54:51 CDT 2019
     */
    public Double getPrecio() {
        return precio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column productos.precio
     *
     * @param precio the value for productos.precio
     *
     * @mbg.generated Fri Apr 12 07:54:51 CDT 2019
     */
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column productos.precioVta
     *
     * @return the value of productos.precioVta
     *
     * @mbg.generated Fri Apr 12 07:54:51 CDT 2019
     */
    public Double getPreciovta() {
        return preciovta;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column productos.precioVta
     *
     * @param preciovta the value for productos.precioVta
     *
     * @mbg.generated Fri Apr 12 07:54:51 CDT 2019
     */
    public void setPreciovta(Double preciovta) {
        this.preciovta = preciovta;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column productos.cantidad
     *
     * @return the value of productos.cantidad
     *
     * @mbg.generated Fri Apr 12 07:54:51 CDT 2019
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column productos.cantidad
     *
     * @param cantidad the value for productos.cantidad
     *
     * @mbg.generated Fri Apr 12 07:54:51 CDT 2019
     */
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column productos.marcaId
     *
     * @return the value of productos.marcaId
     *
     * @mbg.generated Fri Apr 12 07:54:51 CDT 2019
     */
    public Integer getMarcaid() {
        return marcaid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column productos.marcaId
     *
     * @param marcaid the value for productos.marcaId
     *
     * @mbg.generated Fri Apr 12 07:54:51 CDT 2019
     */
    public void setMarcaid(Integer marcaid) {
        this.marcaid = marcaid;
    }
}