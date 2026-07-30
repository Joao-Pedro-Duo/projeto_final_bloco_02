package com.generation.ecommercefarmacia.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos") // CREATE TABLE tb_produtos();
public class Produto {
	
	@Id // PRYMARY KEY 
	@GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT
	private Long id;
	
	@NotBlank(message = "O atributo nome é obrigatório!")
	@Size(min = 3, max = 255, message = "O atributo nome deve ter no mínimo 3 caracteres e no máximo 255 caracteres!")
	@Column(length = 255)
	private String nome;
	
	@NotNull(message = "O atributo quantidade é obrigatório!")
	private int quantidade;
	
	@NotNull(message = "O atributo preco é obrigatório!")
	@PositiveOrZero(message = "O valor só pode ser positivo e maior do que zero!")
	@Digits(integer = 10, fraction = 2)
	private BigDecimal preco;
	
	@NotBlank(message = "O atributo foto é obrigatório!")
	@Size(max = 500, message = "O atributo foto deve ter no máximo 500 caracteres!")
	@Column(length = 500)
	private String foto;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	
	
}
