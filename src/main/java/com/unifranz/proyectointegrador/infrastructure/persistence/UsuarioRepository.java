package com.unifranz.proyectointegrador.infrastructure.persistence;

import com.unifranz.proyectointegrador.application.dto.UsuarioDto;
import com.unifranz.proyectointegrador.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

    List<Usuario> findByActivoTrue();

    @Query("SELECT u FROM Usuario u WHERE u.activo = true")
    List<Usuario> listarActivos();
}
