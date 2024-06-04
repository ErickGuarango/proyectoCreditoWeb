package Ista.cursoM4A.model.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "Credito")
public class Credito implements Serializable{

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_socicitud;
	
	private String Plazo;
	private double Valor_solicitado;
	private String Privincia;
	private String Ciudad;
	private String Tipo_credito;
	private String Estado;
	private String Forma_pago;
	private String Inversion;
	

	private static final long serialVersionUID = 1L;
	
	@Column(name = "fecha_creaccion")
	@Temporal(TemporalType.DATE)
	private Date fecha_creaccion;
	
	@ManyToOne
	    @JoinColumn(name = "socio_id")
	    private Socio socio;
	
	@PrePersist
	public void prePersist() {
		fecha_creaccion = new Date();
	}

	public String getPlazo() {
		return Plazo;
	}

	public void setPlazo(String plazo) {
		Plazo = plazo;
	}

	public double getValor_solicitado() {
		return Valor_solicitado;
	}

	public void setValor_solicitado(double valor_solicitado) {
		Valor_solicitado = valor_solicitado;
	}

	public String getPrivincia() {
		return Privincia;
	}

	public void setPrivincia(String privincia) {
		Privincia = privincia;
	}

	public String getCiudad() {
		return Ciudad;
	}

	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}

	public String getTipo_credito() {
		return Tipo_credito;
	}

	public void setTipo_credito(String tipo_credito) {
		Tipo_credito = tipo_credito;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public String getForma_pago() {
		return Forma_pago;
	}

	public void setForma_pago(String forma_pago) {
		Forma_pago = forma_pago;
	}

	public String getInversion() {
		return Inversion;
	}

	public void setInversion(String inversion) {
		Inversion = inversion;
	}

	public Date getFecha_creaccion() {
		return fecha_creaccion;
	}

	public void setFecha_creaccion(Date fecha_creaccion) {
		this.fecha_creaccion = fecha_creaccion;
	}

	public Long getId_socicitud() {
		return id_socicitud;
	}

	public void setId_socicitud(Long id_socicitud) {
		this.id_socicitud = id_socicitud;
	}
	
	

}
