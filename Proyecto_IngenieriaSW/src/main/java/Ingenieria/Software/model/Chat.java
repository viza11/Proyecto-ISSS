package Ingenieria.Software.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity 
@Table(name="chat")

public class Chat {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int idChat;
	private String MensajeEmisor;
	private String MensajeReceptor;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idUsuarioEmisor", referencedColumnName = "idUsuario", insertable = false, updatable = false)
	@JsonBackReference
	private Usuario usuario;
	
	
	
	public Chat() {
		super();
	}
	

	
	public Chat(String mensajeEmisor, String mensajeReceptor) {
		super();
		MensajeEmisor = mensajeEmisor;
		MensajeReceptor = mensajeReceptor;
	}



	public String getMensajeEmisor() {
		return MensajeEmisor;
	}

	public void setMensajeEmisor(String mensajeEmisor) {
		MensajeEmisor = mensajeEmisor;
	}

	public String getMensajeReceptor() {
		return MensajeReceptor;
	}

	public void setMensajeReceptor(String mensajeReceptor) {
		MensajeReceptor = mensajeReceptor;
	}
	
	
	
}
