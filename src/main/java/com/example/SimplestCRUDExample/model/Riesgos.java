package com.example.SimplestCRUDExample.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="Riesgos")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Riesgos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String nombre;

    @Column
    private String author;
    
    @Column
    private String tipo;
    
    @Column
    private String mitigacion;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String title) {
		this.nombre = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMitigacion() {
		return mitigacion;
	}

	public void setMitigacion(String mitigacion) {
		this.mitigacion = mitigacion;
	}
	
	

}
