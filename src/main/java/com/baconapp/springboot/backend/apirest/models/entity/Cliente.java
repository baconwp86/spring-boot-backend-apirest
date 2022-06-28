package com.baconapp.springboot.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@Table(name = "clientes")
@SQLDelete(sql = "UPDATE clientes SET deleted = true WHERE id=?")
@Where(clause = "deleted=false")
public class Cliente implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nombre;
	private String apellido;
	private String email;
	private Boolean deleted = Boolean.FALSE;

	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private Date createAt;

	@PrePersist
	public void prePersist() {
		createAt = new Date();
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Cliente(Long i, String nombre, String apellido, String email, boolean deleted, Date createAt) {
		super();
		this.id = i;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.deleted = deleted;
		this.createAt = createAt;
	}
	
	public Cliente() {
		
	};
	

	@Override
	public boolean equals(Object obj) {
		
		Cliente cliente = (Cliente) obj;
		
		if(!(obj instanceof Cliente)) {
			return false;
		}
		
		if(this.id == null || this.nombre == null || this.apellido == null || this.deleted == null || this.createAt == null) {
			return false;
			
		}
		
		return this.id.equals(cliente.getId())  && this.nombre.equals(cliente.getNombre()) && this.apellido.equals(cliente.getApellido()) && this.email.equals(cliente.getEmail()) && this.deleted.equals(cliente.isDeleted()) && this.createAt.equals(cliente.createAt);
	}
	
	
	
	

}
