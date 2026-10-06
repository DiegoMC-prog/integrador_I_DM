package com.unifranz.proyectointegrador.application.dto;

import com.unifranz.proyectointegrador.domain.Usuario;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDto {
    private Long id;
    private String nombre;
    private String email;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaModificacion;
    private String creadoPor;
    private String modificadoPor;
    private Boolean activo;

    public UsuarioDto(Usuario usuario) {
        this.id = usuario.getId();
        this.nombre = usuario.getNombre();
        this.email = usuario.getEmail();
        this.fechaCreacion = usuario.getFechaCreacion();
        this.fechaModificacion = usuario.getFechaModificacion();
        this.creadoPor = usuario.getCreadoPor();
        this.modificadoPor = usuario.getModificadoPor();
        this.activo = usuario.getActivo();
    }
}
