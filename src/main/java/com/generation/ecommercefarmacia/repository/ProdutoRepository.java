package com.generation.ecommercefarmacia.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.ecommercefarmacia.model.Produto;




public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	public List<Produto> findAllByNomeContainingIgnoreCase(String nome);

	
	// Método Personalizado - Buscar todos os Produtos cujo o preço seja maior 
	// do que um valor digitado e retorne também ordenado pelo preço em ordem crescente
	public List <Produto> findAllByPrecoGreaterThanOrderByPreco(BigDecimal preco);
	
	
	// Método Personalizado - Buscar todos os Produtos cujo o preço seja menor
	// do que um valor digitado e retorne também ordenado pelo preço em ordem decrescente
	public List <Produto> findAllByPrecoLessThanOrderByPrecoDesc(BigDecimal preco);
	
}
