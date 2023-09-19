package com.polligonalApps.cadastroms.service;

import com.polligonalApps.cadastroms.dto.UsuarioDTO;
import com.polligonalApps.cadastroms.model.HistoricoUsuario;
import com.polligonalApps.cadastroms.model.Usuario;
import com.polligonalApps.cadastroms.model.constants.TipoMovimentacao;
import com.polligonalApps.cadastroms.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Arrays;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public Usuario criarUsuario(String nome, LocalDateTime dataNascimento,String email){
        Usuario usuario = new Usuario(nome,dataNascimento,email);
        repository.save(usuario);
        HistoricoUsuario historicoUsuario = new HistoricoUsuario(TipoMovimentacao.CRIACAO,usuario);
        usuario.setHistorico(Arrays.asList(historicoUsuario));
        repository.save(usuario);
        return usuario;
    }

    public Usuario criarUsuario(UsuarioDTO usuarioDTO) {
        return criarUsuario(usuarioDTO.nome(),usuarioDTO.dataNascimento(), usuarioDTO.email());
    }
}
