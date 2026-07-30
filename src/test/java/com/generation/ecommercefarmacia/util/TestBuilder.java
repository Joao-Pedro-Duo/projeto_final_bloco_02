package com.generation.ecommercefarmacia.util;

import java.time.LocalDate;

import com.generation.ecommercefarmacia.model.Usuario;
import com.generation.ecommercefarmacia.model.UsuarioLogin;

public class TestBuilder {
	public static Usuario criarUsuario(Long id, String nome, String usuario, String senha, LocalDate dataNascimento) {
		Usuario novoUsuario = new Usuario();
		novoUsuario.setId(id);
		novoUsuario.setNome(nome);
		novoUsuario.setUsuario(usuario);
		novoUsuario.setSenha(senha);
		novoUsuario.setFoto("-");
		novoUsuario.setDataNascimento(dataNascimento);
		return novoUsuario;
	}
 
	public static UsuarioLogin criarUsuarioLogin(String usuario, String senha) {
		UsuarioLogin usuarioLogin = new UsuarioLogin();
		usuarioLogin.setUsuario(usuario);
		usuarioLogin.setSenha(senha);
		return usuarioLogin;
	}
}