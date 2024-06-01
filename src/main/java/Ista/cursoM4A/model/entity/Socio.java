package Ista.cursoM4A.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Socio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombres;
    private String apellidos;
    private String cedula;
    private String lugarNacimiento;
    private String profesion;
    private String provincia;
    private String sector;
    private String correo;
    private String tipoCasa;
    private int tiempoResidencia;
    private String genero;
    private String carpeta;
    private int edad;
    private String direccion;
    private String ciudad;
    private String referencia;
    private String celular;
    private String propietario;
    private String telefonoPropietario;
    private String estadoCivil;
    private Date fechaNacimiento;
    private int personasDependientes;
    private String parroquia;
    private String telefono;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getLugarNacimiento() {
		return lugarNacimiento;
	}
	public void setLugarNacimiento(String lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}
	public String getProfesion() {
		return profesion;
	}
	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTipoCasa() {
		return tipoCasa;
	}
	public void setTipoCasa(String tipoCasa) {
		this.tipoCasa = tipoCasa;
	}
	public int getTiempoResidencia() {
		return tiempoResidencia;
	}
	public void setTiempoResidencia(int tiempoResidencia) {
		this.tiempoResidencia = tiempoResidencia;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCarpeta() {
		return carpeta;
	}
	public void setCarpeta(String carpeta) {
		this.carpeta = carpeta;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	public String getTelefonoPropietario() {
		return telefonoPropietario;
	}
	public void setTelefonoPropietario(String telefonoPropietario) {
		this.telefonoPropietario = telefonoPropietario;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public int getPersonasDependientes() {
		return personasDependientes;
	}
	public void setPersonasDependientes(int personasDependientes) {
		this.personasDependientes = personasDependientes;
	}
	public String getParroquia() {
		return parroquia;
	}
	public void setParroquia(String parroquia) {
		this.parroquia = parroquia;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

    
}
