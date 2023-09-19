package com.polligonalApps.cadastroms.repository;

import com.polligonalApps.cadastroms.model.Usuario;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long>, Specification<Usuario> {
}
