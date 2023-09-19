package com.polligonalApps.cadastroms.dto;

import com.polligonalApps.cadastroms.model.Usuario;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

@Valid
public record UsuarioDTO(
        @NotEmpty(message = "O campo nome deve ser preenchido.") String nome,
        @NotEmpty LocalDateTime dataNascimento,
        @NotEmpty(message = "O campo email deve ser preenchido.") @Email String email) {

    public Usuario toModel(){
        return new Usuario(this.nome(),this.dataNascimento(),this.email());
    }
}
