package com.nobreestamparia.nobreestamparia.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nobreestamparia.nobreestamparia.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	public Optional<Usuario> findByUsuario(String usuario);
}
