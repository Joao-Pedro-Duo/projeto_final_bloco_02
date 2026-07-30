package com.generation.ecommercefarmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.ecommercefarmacia.model.Categoria;



public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	
	public List<Categoria> findAllByTipoContainingIgnoreCase(String tipo);
	
	
	// Método Personalizado - Uma Busca por todas as Categorias cujo a descrição seja igual a descrição digitada
	public List<Categoria> findAllByDescricaoContainingIgnoreCase(String descricao);

}
