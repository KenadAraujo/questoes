package com.polligonalApps.cadastroms.repository;

import com.polligonalApps.cadastroms.model.HistoricoUsuario;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoricoUsuarioRepository extends JpaRepository<HistoricoUsuario,Long>, Specification<HistoricoUsuario> {
}
