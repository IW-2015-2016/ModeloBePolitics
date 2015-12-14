package modificadores;

import java.sql.Date;

import pais.TipoRecurso;
/**
 * Modificadores a la producci�n. contienen un tipo de recurso, un porcentaje, un t�tulo,
 * una descripci�n, y una fecha de inicio y otra de fin. tienen como objetivo almacenar
 * las modificaciones de producci�n que sufre un pa�s por cualquier motivo.
 * 
 * @author Ismael
 * @see Date
 */
public class ModificadorProduccion {
	private TipoRecurso tipo;
	private int porcentaje;
	private String titulo;
	private String descripcion;
	private Date fechainicio;
	private Date fechafin;
	/**
	 * Crea un Modificador. si el porcentaje no est� entre -100 y 100, se pondr� autom�ticamente a 0
	 *  
	 * @param t el tipo de recurso
	 * @param porcent el porcentaje que modifica
	 * @param titulo el t�tulo del modificador
	 * @param descripcion la descripci�n del modificador
	 * @param inicio aqu� va la fecha de inicio (java.sql.Date)
	 * @param fin aqu� va la fecha de fin (java.sql.Date)
	 * 
	 * @see java.sql.Date
	 */
	public ModificadorProduccion(TipoRecurso t, int porcent, String titulo, String descripcion, Date inicio, Date fin){
		this.setPorcentaje(porcent);
		if(porcent<-100 || porcent>100) 
			this.setPorcentaje(0);
		this.setTitulo(titulo);
		this.setDescripcion(descripcion);
		this.setFechainicio(inicio);
		this.setFechafin(fin);
	}
	
	/**
	 * Clona el modificador de producci�n actual.
	 */
	public ModificadorProduccion clone(){
		return new ModificadorProduccion(this.tipo,this.porcentaje, this.titulo,this.descripcion,this.fechainicio,this.fechafin);
	}
	
	/*********************/
	/**Getters y setters**/
	/*********************/
	
	private TipoRecurso getTipo() {
		return tipo;
	}
	private void setTipo(TipoRecurso tipo) {
		this.tipo = tipo;
	}
	private int getPorcentaje() {
		return porcentaje;
	}
	private void setPorcentaje(int porcentaje) {
		this.porcentaje = porcentaje;
	}
	private Date getFechainicio() {
		return fechainicio;
	}
	private void setFechainicio(Date fechainicio) {
		this.fechainicio = fechainicio;
	}
	private Date getFechafin() {
		return fechafin;
	}
	private void setFechafin(Date fechafin) {
		this.fechafin = fechafin;
	}
	private String getTitulo() {
		return titulo;
	}
	private void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	private String getDescripcion() {
		return descripcion;
	}
	private void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
}
