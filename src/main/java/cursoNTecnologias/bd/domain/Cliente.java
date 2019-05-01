package cursoNTecnologias.bd.domain;

public class Cliente {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cliente.id
	 * @mbg.generated  Fri Apr 12 07:54:51 CDT 2019
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cliente.nombre
	 * @mbg.generated  Fri Apr 12 07:54:51 CDT 2019
	 */
	private String nombre;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cliente.apellido
	 * @mbg.generated  Fri Apr 12 07:54:51 CDT 2019
	 */
	private String apellido;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cliente.email
	 * @mbg.generated  Fri Apr 12 07:54:51 CDT 2019
	 */
	private String email;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cliente.sexo
	 * @mbg.generated  Fri Apr 12 07:54:51 CDT 2019
	 */
	private String sexo;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cliente.idDireccion
	 * @mbg.generated  Fri Apr 12 07:54:51 CDT 2019
	 */
	private Integer iddireccion;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cliente.id
	 * @return  the value of cliente.id
	 * @mbg.generated  Fri Apr 12 07:54:51 CDT 2019
	 */
	
	private Direccion direccion;
	
	public Cliente() {
		setDireccion(new Direccion());
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cliente.id
	 * @param id  the value for cliente.id
	 * @mbg.generated  Fri Apr 12 07:54:51 CDT 2019
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cliente.nombre
	 * @return  the value of cliente.nombre
	 * @mbg.generated  Fri Apr 12 07:54:51 CDT 2019
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cliente.nombre
	 * @param nombre  the value for cliente.nombre
	 * @mbg.generated  Fri Apr 12 07:54:51 CDT 2019
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cliente.apellido
	 * @return  the value of cliente.apellido
	 * @mbg.generated  Fri Apr 12 07:54:51 CDT 2019
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cliente.apellido
	 * @param apellido  the value for cliente.apellido
	 * @mbg.generated  Fri Apr 12 07:54:51 CDT 2019
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cliente.email
	 * @return  the value of cliente.email
	 * @mbg.generated  Fri Apr 12 07:54:51 CDT 2019
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cliente.email
	 * @param email  the value for cliente.email
	 * @mbg.generated  Fri Apr 12 07:54:51 CDT 2019
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cliente.sexo
	 * @return  the value of cliente.sexo
	 * @mbg.generated  Fri Apr 12 07:54:51 CDT 2019
	 */
	public String getSexo() {
		return sexo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cliente.sexo
	 * @param sexo  the value for cliente.sexo
	 * @mbg.generated  Fri Apr 12 07:54:51 CDT 2019
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cliente.idDireccion
	 * @return  the value of cliente.idDireccion
	 * @mbg.generated  Fri Apr 12 07:54:51 CDT 2019
	 */
	public Integer getIddireccion() {
		return iddireccion;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cliente.idDireccion
	 * @param iddireccion  the value for cliente.idDireccion
	 * @mbg.generated  Fri Apr 12 07:54:51 CDT 2019
	 */
	public void setIddireccion(Integer iddireccion) {
		this.iddireccion = iddireccion;
	}
}