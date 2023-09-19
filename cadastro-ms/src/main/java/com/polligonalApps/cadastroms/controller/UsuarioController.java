package com.polligonalApps.cadastroms.controller;

import com.polligonalApps.cadastroms.dto.UsuarioDTO;
import com.polligonalApps.cadastroms.model.Usuario;
import com.polligonalApps.cadastroms.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<?> cadastrarNovoUsuario(@Valid @RequestBody UsuarioDTO usuarioDTO){
        Usuario novoUsuario = usuarioDTO.toModel();
        novoUsuario = usuarioService.criarUsuario(usuarioDTO);
        return ResponseEntity.ok("ok");
    }
}
