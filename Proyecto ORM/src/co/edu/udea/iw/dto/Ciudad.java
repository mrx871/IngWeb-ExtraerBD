package co.edu.udea.iw.dto;

import java.io.Serializable;

// DTO
public class Ciudad implements Serializable {
	
	// Atributos privados por ser un DTO
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer codigo;
	private String nombre;
	private String codigoArea;
	
	
	// CTRL SHIFT S : Generar automaticamente
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigoArea() {
		return codigoArea;
	}
	public void setCodigoArea(String codigoArea) {
		this.codigoArea = codigoArea;
	}
	
}
