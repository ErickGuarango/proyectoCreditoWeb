package Ista.cursoM4A.model.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Negocio")
public class Negocio implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_negocio;
	
	public Long getId_negocio() {
		return id_negocio;
	}
	public void setId_negocio(Long id_negocio) {
		this.id_negocio = id_negocio;
	}
	public String getActividad() {
		return Actividad;
	}
	public void setActividad(String actividad) {
		Actividad = actividad;
	}
	@Column(unique = true)
	private int Ruc;

	private String Razon_Social;
	private String Actividad;
	private String Sub_actividad;
	private int Num_empleados;
	private int Antiguedad;
	private String Lugar_ventas;
	private String Tiempo;
	private boolean hipotecado;
	private String Ciudad;
	private String Direccion;
	private int Num_casa;
	private String Referencia;
	private int Num_telefono;
	
	
	
	
	public int getRuc() {
		return Ruc;
	}
	public void setRuc(int ruc) {
		Ruc = ruc;
	}
	public String getRazon_Social() {
		return Razon_Social;
	}
	public void setRazon_Social(String razon_Social) {
		Razon_Social = razon_Social;
	}
	public String getSub_actividad() {
		return Sub_actividad;
	}
	public void setSub_actividad(String sub_actividad) {
		Sub_actividad = sub_actividad;
	}
	public int getNum_empleados() {
		return Num_empleados;
	}
	public void setNum_empleados(int num_empleados) {
		Num_empleados = num_empleados;
	}
	public int getAntiguedad() {
		return Antiguedad;
	}
	public void setAntiguedad(int antiguedad) {
		Antiguedad = antiguedad;
	}
	public String getLugar_ventas() {
		return Lugar_ventas;
	}
	public void setLugar_ventas(String lugar_ventas) {
		Lugar_ventas = lugar_ventas;
	}
	public String getTiempo() {
		return Tiempo;
	}
	public void setTiempo(String tiempo) {
		Tiempo = tiempo;
	}
	public boolean isHipotecado() {
		return hipotecado;
	}
	public void setHipotecado(boolean hipotecado) {
		this.hipotecado = hipotecado;
	}
	public String getCiudad() {
		return Ciudad;
	}
	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public int getNum_casa() {
		return Num_casa;
	}
	public void setNum_casa(int num_casa) {
		Num_casa = num_casa;
	}
	public String getReferencia() {
		return Referencia;
	}
	public void setReferencia(String referencia) {
		Referencia = referencia;
	}
	public int getNum_telefono() {
		return Num_telefono;
	}
	public void setNum_telefono(int num_telefono) {
		Num_telefono = num_telefono;
	}
	
	 
	
	
	
	
	

}
